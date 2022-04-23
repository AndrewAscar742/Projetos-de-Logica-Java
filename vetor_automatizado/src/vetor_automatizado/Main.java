package vetor_automatizado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Lista listinha = new Lista();
		
		
		listinha.adicionar("Olá");
		listinha.adicionar("Gosto");
		listinha.adicionar("Tudo bem");
		
		listinha.excluir(1);
		
		listinha.adicionar("Dormiu bem?");
		
		listinha.imprimirLista();

	}

}
