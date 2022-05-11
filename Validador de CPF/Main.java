import java.util.Scanner;

public class Main {
	
	private static String devolverCPF(String parteCPF) {
		String cpf = parteCPF;
		cpf = cpf.replace(".", "").replace("-", "");
		return cpf;
	}
	
	public static int validarCPF(String parteCPF) {
		int somaTotal = 0;
		String cpf = devolverCPF(parteCPF);
		System.out.println(cpf);
		
		
		int mult = cpf.length() + 1;
		for (int i = 0; i < cpf.length(); i++) {
			char c = cpf.charAt(i);
			String s = String.valueOf(c);
			int ii = Integer.parseInt(s);
			
			somaTotal += ii * mult;
			mult--;
		}
		
		int resto = somaTotal % 11;
		if (resto < 2)
			return 0;
		else
			return 11 - resto;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu CPF");
		String cpf = leia.nextLine();
		int dv1 = validarCPF(cpf);
		System.out.println("Digite seu CPF");
		String cpf2 = leia.nextLine();
		int dv2 = validarCPF(cpf2);
		
		if (dv1 == 0) {
			System.out.println("CPF Válido!");
		}else {
			System.out.println("CPF Inválido");
		}
		
		if (dv2 == 0) {
			System.out.println("CPF Válido");
		}else {
			System.out.println("CPF Inválido");
		}
		
		System.out.println(dv1);
		System.out.println(dv2);
	}

}
