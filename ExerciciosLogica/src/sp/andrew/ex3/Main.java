package sp.andrew.ex3;

public class Main {
	
	public static int encontrarMenorValor(int vet[]) {
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < vet.length - 1; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[i] < vet[j]) menor = vet[i];
			}
		}
		
		return menor;
	}
	
	public static int encontrarMaiorValor(int vet[]) {
		int maior = Integer.MIN_VALUE;
		for (int i = 0; i < vet.length - 1; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[i] > vet[j]) maior = vet[i];
			}
		}
		
		return maior;
	}
	
	public static int encontrarMediaValor(int vet[]) {
		int somaTotal = 0;
		for (int i = 0; i < vet.length; i++) {
			somaTotal += vet[i];
		}
		
		return somaTotal / vet.length;
	}
	
	public static void main(String[] args) {
		int vendas[] = {10, 20, 34, 54, 10, 23, 77, 100, 6, 23};
		System.out.println("Menor valor das vendas: " + encontrarMenorValor(vendas));
		System.out.println("Maior valor das vendas: " + encontrarMaiorValor(vendas));
		System.out.println("Média das vendas: " + encontrarMediaValor(vendas));
		
		
	}
}
