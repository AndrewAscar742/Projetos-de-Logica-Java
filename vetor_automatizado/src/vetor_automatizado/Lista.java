package vetor_automatizado;

public class Lista {
	private int index = 10;  
	private String[] vet = new String[index];
	private int posicaoVetor;
	
	
	
	public void adicionar(String text) {
		vet[posicaoVetor] = text;
		posicaoVetor++;
		
	}
		
	public boolean alterar(int posicao, String novoText) {
		if (posicao < index) {
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
		vet[vet.length - 1] = "";
	}
	
	public void imprimirLista() {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
}
