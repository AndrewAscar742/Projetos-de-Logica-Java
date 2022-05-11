import java.util.Arrays;

public class TesteString {

	public static void main(String[] args) {
	String vet[] = "Pera;Maça;Laranja;Gordo gay".split(";");
	
	String palavra = "osasola";
	
	char[] vetorChar = palavra.toCharArray();
	System.out.println(Arrays.toString(vetorChar));
	
	
	boolean existeH = palavra.contains("o");
	System.out.println(existeH);
	
	String gay = palavra.concat(" Você é um boiola");
	System.out.println((gay));
	System.out.println(gay.charAt(0));
	
	System.out.println(gay.replace('o', 'x'));
	System.out.println(gay.substring(7));
	System.out.println(gay.substring(2, 7));
	String text = "      poijsaoijs";
	System.out.println(text);
	System.out.println(text.trim());
	int x = 24;
	String xText = String.valueOf(x);
	System.out.println(xText);
	}

}
