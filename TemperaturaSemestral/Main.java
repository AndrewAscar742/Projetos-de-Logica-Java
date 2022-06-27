import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scTemp = new Scanner((System.in));
        List<Mes> tempGrausMeses = new ArrayList<>();

        String nome = "";
        float temperatura = 0.0f;
        int numMes = 1;
        do {
            System.out.println("Digite o nome do mês");
            nome = sc.next();
            System.out.println("Digite a temperatura do mês");
            temperatura = scTemp.nextFloat();

            tempGrausMeses.add(new Mes(nome, numMes, temperatura));
            numMes++;
        }while (tempGrausMeses.size() != 6);

        System.out.println(Mes.mediaTempSemes(tempGrausMeses));
        System.out.println(tempGrausMeses.toString());

    }
}
