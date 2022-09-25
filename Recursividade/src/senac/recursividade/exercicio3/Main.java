package senac.recursividade.exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Defina o número");
        int num = sc.nextInt();
        System.out.println("Defina o expoente");
        int expoente = sc.nextInt();

        System.out.println(devolverPotencia(num, expoente));
    }

    public static int devolverPotencia(int num, int expoente){
        if (expoente == 1) return num;

        return devolverPotencia(num, expoente - 1) * num;
    }
}
