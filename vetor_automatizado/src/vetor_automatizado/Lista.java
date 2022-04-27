package vetor_automatizado;

public class Lista { 
	private String[] vet;
	private int posicaoVetor;
	
	public Lista(int tamanho) {
		vet = new String[tamanho];
	}
	
	public Lista() {
		vet = new String[4];
	}
	
	public void adicionar(String text) {
		if (posicaoVetor == vet.length)
			aumentarIndex();
		
		vet[posicaoVetor] = text;
		posicaoVetor++;
		
	}
		
	public boolean alterar(int posicao, String novoText) {
		if (posicao < vet.length ) {
			vet[posicao] = novoText;
			return true;
		}else{
			return false;
		}
		
	}
	
	public String buscar(String buscarText) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].equalsIgnoreCase(buscarText)) {
				return vet[i];
			}
		}
		return "Valor Inexistente";
	}
	
	public void excluir(int index) {
		/*
		 * vet.lenght - 1 pois o método retorna o comprimento, ou seja, do 0 ao 5 sendo que o vetor é
		 * 0 ao 4, logo devemos subtrair
		 */
		for (int i = index; i < vet.length - 1; i++) {
			vet[i] = vet[i + 1];
		}
		vet[vet.length - 1] = null;
	}
	
	public void imprimirLista() {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
	
	private void aumentarIndex() {
		String vetAux[] = new String[vet.length * 2];
		
		for (int i = 0; i < vet.length; i++) {
			vetAux[i] = vet[i];
		}
		vet = vetAux;
	}
}
