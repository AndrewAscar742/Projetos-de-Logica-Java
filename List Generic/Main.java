import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scText = new Scanner(System.in);
		List<Motocicleta> listaMoto = new ArrayList<Motocicleta>();
		List<Carro> listaCarro = new ArrayList<Carro>();
		List<Aviao> listaAviao = new ArrayList<Aviao>();
		
		int opcao = 0;
		int index = 0;
		String cor = "";
		String motor = "";
		int qtdAssentos = 0;
		
		System.out.println("Seja bem vindo ao nosso banco de dados");
		do {
			System.out.println("Selecione a lista que você deseja");
			System.out.println("1. Lista de Carros \n2. Lista de Avião \n3. Lista de Motos \n"
					+ "4. Encerrar o programa");
			
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				Carro car;
				String chassi = "";
				
				do {
					System.out.println("Digite a operação desejada");
					System.out.println("1. Adicionar \n2. Alterar \n3. Remover \n4. Remover tudo \n"
							+ "5. Imprimir Lista \n9. Sair da Lista");
					
					opcao = sc.nextInt();
					switch (opcao) {
					case 1:
						System.out.println("Digite sua cor");
						cor = scText.nextLine();
						
						System.out.println("Digite o modelo de seu motor");
						motor = scText.nextLine();
						
						System.out.println("Digite a quantidade de assentos");
						qtdAssentos = sc.nextInt();
						
						System.out.println("Digite o número de seu Chassi");
						chassi = scText.nextLine();
						
						listaCarro.add(car = new Carro(cor, motor, qtdAssentos, chassi));
						break;
						
					case 2:
						System.out.println("Digite sua nova cor");
						cor = scText.nextLine();
						
						System.out.println("Digite um novo modelo de seu motor");
						motor = scText.nextLine();
						
						System.out.println("Digite a quantidade de assentos");
						qtdAssentos = sc.nextInt();
						
						System.out.println("Digite o número de seu novo Chassi");
						chassi = scText.nextLine();
						
						System.out.println("Me informe a posição do elemento no vetor");
						index = sc.nextInt();
						
						listaCarro.set(index, car = new Carro(cor, motor, qtdAssentos, chassi));
						break;
						
					case 3:
						System.out.println("Me informe a posição do elemento no vetor");
						index = sc.nextInt();
						listaCarro.remove(index);
						break;
						
					case 4:
						listaCarro.removeAll(listaCarro);
						break;
					case 5:
						System.out.println(listaCarro.toString()); 
					case 9:
						break;
						
					default:
						System.err.println("Entrada inválida");
						break;
					}
					
				} while (opcao != 9);
				
				break;
			case 2:
				Aviao aviao;
				String turbina = "";
				String modelo = "";
				
				do {
					System.out.println("Digite a operação desejada");
					System.out.println("1. Adicionar \n2. Alterar \n3. Remover \n4. Remover tudo \n"
							+ "5. Imprimir Lista \n9. Sair da Lista");
					
					opcao = sc.nextInt();
					switch (opcao) {
					case 1:
						System.out.println("Digite sua cor");
						cor = scText.nextLine();
						
						System.out.println("Digite o modelo de seu motor");
						motor = scText.nextLine();
						
						System.out.println("Digite a quantidade de assentos");
						qtdAssentos = sc.nextInt();
						
						System.out.println("Digite o modelo da turbina");
						turbina = scText.nextLine();
						
						System.out.println("Digite o modelo do avião");
						modelo = scText.nextLine();
						
						listaAviao.add(aviao = new Aviao(cor, motor, qtdAssentos, turbina, modelo));
						break;
						
					case 2:
						System.out.println("Digite sua nova cor");
						cor = scText.nextLine();
						
						System.out.println("Digite um novo modelo de seu motor");
						motor = scText.nextLine();
						
						System.out.println("Digite a quantidade de assentos");
						qtdAssentos = sc.nextInt();
						
						System.out.println("Digite o modelo novo da turbina");
						turbina = scText.nextLine();
						
						System.out.println("Digite o novo modelo do avião");
						modelo = scText.nextLine();
						
						System.out.println("Me informe a posição do elemento no vetor");
						index = sc.nextInt();
						
						listaAviao.set(index, aviao = new Aviao(cor, motor, qtdAssentos, turbina, modelo));
						break;
						
					case 3:
						System.out.println("Me informe a posição do elemento no vetor");
						index = sc.nextInt();
						listaAviao.remove(index);
						break;
						
					case 4:
						listaAviao.removeAll(listaAviao);
						break;
						
					case 9:
						break;
						
					default:
						System.err.println("Entrada inválida");
						break;
					}
					
				} while (opcao != 9);
				
				break;
			case 3:
				Motocicleta moto;
				String categoriaMoto = "";
				 
				do {
					System.out.println("Digite a operação desejada");
					System.out.println("1. Adicionar \n2. Alterar \n3. Remover \n4. Remover tudo \n"
							+ "5. Imprimir Lista \n9. Sair da Lista");
					
					opcao = sc.nextInt();
					switch (opcao) {
					case 1:
						System.out.println("Digite sua cor");
						cor = scText.nextLine();
						
						System.out.println("Digite o modelo de seu motor");
						motor = scText.nextLine();
						
						System.out.println("Digite a quantidade de assentos");
						qtdAssentos = sc.nextInt();
						
						System.out.println("Digite a categoria de sua moto");
						categoriaMoto = scText.nextLine();
						
						listaMoto.add(moto = new Motocicleta(cor, motor, qtdAssentos, categoriaMoto));
						break;
						
					case 2:
						System.out.println("Digite sua nova cor");
						cor = scText.nextLine();
						
						System.out.println("Digite um novo modelo de seu motor");
						motor = scText.nextLine();
						
						System.out.println("Digite a quantidade de assentos");
						qtdAssentos = sc.nextInt();
						
						System.out.println("Digite a categoria de sua nova moto");
						categoriaMoto = scText.nextLine();
						
						System.out.println("Me informe a posição do elemento no vetor");
						index = sc.nextInt();
						
						listaMoto.set(index, moto = new Motocicleta(cor, motor, qtdAssentos, categoriaMoto));
						break;
						
					case 3:
						System.out.println("Me informe a posição do elemento no vetor");
						index = sc.nextInt();
						listaMoto.remove(index);
						break;
						
					case 4:
						listaMoto.removeAll(listaMoto);
						break;
						
					case 9:
						break;
						
					default:
						System.err.println("Entrada inválida");
						break;
					}
				} while (opcao != 9);
				
				break;
			case 4:
				break;
				
			default:
				System.err.println("Entrada inválida");
				break;
			}
		} while (opcao != 4);

	}

}
