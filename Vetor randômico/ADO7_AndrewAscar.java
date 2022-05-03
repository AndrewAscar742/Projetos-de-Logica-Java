import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ADO7_AndrewAscar {
	
	public static void rand(String vet[]) {
		Random rd = new Random();
		
		for (int i = 0; i < vet.length - 1; i++) {
			int j = rd.nextInt(i + 1);
			
			String temp = vet[i];
			vet[i] = vet[j];
			vet[j] = temp;
			
		}
		
		System.out.println(Arrays.toString(vet));
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner leia = new Scanner(System.in);
		int tent = 0;
		int qtd = 5;
		String perguntas[] = new String[5];
		
		//Atribuindo vetor
		perguntas[0] = "(A) Método é um reuso do código sem retorno pertencente somente na mesma classe \n";
		perguntas[1] = "(B) Método é um nome dado na orientação a objeto, uma nomenclatura \n";
		perguntas[2] = "(C) Método é um nome dado na programação estruturada, pertencente somente na linguagem C \n";
		perguntas[3] = "(D) Método não pode ser reusado \n";
		perguntas[4] = "(E) Método na linguagem Java é FUNDAMENTAL usar o Destrutor para destruir um objeto, \n";
		
		//Laço
		System.out.println("Seja bem vindo ao Acertou! Ganhou! Com a seguinte pergunta: \n");
		String quest = "";
		do {
			System.out.println("O que é método? ");
			rand(perguntas);
			quest = leia.next().toLowerCase();
			
			switch (quest) {
			case "a":
				System.out.println("Você errou!, tente novamente");
				Thread.sleep(1000);
				tent++;
				break;
				
			case "b":
				System.out.println("Você acertou! Parabéns");
				Thread.sleep(1000);
				tent = 3;
				break;
				
			case "c":
				System.out.println("Você errou!, tente novamente");
				Thread.sleep(1000);
				tent++;
				break;
				
			case "d":
				System.out.println("Você errou!, tente novamente");
				Thread.sleep(1000);
				tent++;
				break;
				
			case "e":
				System.out.println("Você errou!, tente novamente");
				Thread.sleep(1000);
				tent++;
				break;
				
			default:
				System.out.println("Valor inválido! Tente novamente");
				Thread.sleep(1000);
				break;
			}
		} while (tent != 3);
	}
}
