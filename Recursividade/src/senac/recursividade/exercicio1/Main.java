package senac.recursividade.exercicio1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        System.out.println(mostrarNumDescrescente(num));
    }

    public static int mostrarNumDescrescente(int num){
        if (num == 0)
            return 0;

        System.out.print(num + " ");
        return mostrarNumDescrescente(num - 1);

    }
}
