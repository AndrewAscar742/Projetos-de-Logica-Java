package sp.andrew.ex2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scFloat = new Scanner(System.in);
		int[] qtdPecas = new int[10];
		float[] preco_vendedor = new float[qtdPecas.length];
		
		int somaTotal = 0;
		int qtdPecasT = 0;
		int cont = 0;
		
		do {
			System.out.println("Digite a quantidade de peças vendidas do vendedor: " + (cont + 1));
			qtdPecas[cont] = scInt.nextInt();
			qtdPecasT += qtdPecas[cont];
			
			System.out.println("Digite o valor de cada peça");
			preco_vendedor[cont] = scFloat.nextFloat();
			somaTotal += qtdPecas[cont] * preco_vendedor[cont];
			
			System.out.println("O preço da venda total do vendedor " + (cont + 1) + 
					" é: " + (qtdPecas[cont] * preco_vendedor[cont]));
			
			
			cont++;
		} while (cont < 10);
		
		System.out.println("A soma total de tudo é: " + somaTotal);
	}
}
