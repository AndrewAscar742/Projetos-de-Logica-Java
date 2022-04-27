package vetor_automatizado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Lista listinha = new Lista(3);
		
		
		listinha.adicionar("Olá");
		listinha.adicionar("Gosto");
		listinha.adicionar("Tudo bem");
		listinha.adicionar("Dormiu bem?");
		listinha.adicionar("Julia, te amooo");
		
		listinha.alterar(3, "Oii");
		
		listinha.imprimirLista();

	}

}
