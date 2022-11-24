package sp.andrew.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		float[] salarioOp = new float[10];
		float max = Float.MIN_VALUE;
		float somaTotal = 0;
		int cont = 0;
		int contSalario = 0;

		do {
			System.out.println("Digite o salário do trabalhador");
			salarioOp[cont] = scInt.nextFloat();
			somaTotal += salarioOp[cont];

			if (max < salarioOp[cont]) max = salarioOp[cont];
			if (salarioOp[cont] < 850.00f) ++contSalario;

			cont++;
		} while (cont < 10);
		scInt.close();

		System.out.println(Arrays.toString(salarioOp));
		System.out.println("Média dos salários: " + somaTotal / 10);
		System.out.println("O maior salário foi: " + max);
		System.out.println("A quantidade de salários abaixo de 850 são: " + contSalario + " salários");
	}
}
