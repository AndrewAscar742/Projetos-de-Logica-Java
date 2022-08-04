package alura.dio;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> arcoIris = new TreeSet<>(){{
           add("Vermelho");
           add("Amarelo");
           add("Laranja");
           add("Verde");
           add("Azul");
           add("Azul Escuro");
           add("Violeta");
        }};

        System.out.println(arcoIris);
        System.out.println("É vázio? " + arcoIris.isEmpty());
        System.out.println("Qual o tamanho do TreeSet " + arcoIris.size());

        //Ordenação Alfabética com Lambda(Eficiente)
        Set<String> arcoIris2 = new TreeSet<>((o1, o2) -> o1.compareToIgnoreCase(o2));
        arcoIris2.addAll(arcoIris);
        System.out.println("ArcoIris ordenado com Lambda");
        System.out.println(arcoIris2);

        //Ordenação Alfabética com Classe Anônima
        Set<String> arcoIris3 = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        arcoIris3.addAll(arcoIris);
        System.out.println("Ordenação por classe anônima");
        System.out.println(arcoIris3);

        //A maneira mais eficiente para organizar esse arcoIris
        Set<String> arcoIris4 = new TreeSet<>(String::compareToIgnoreCase);
        arcoIris4.addAll(arcoIris);
        System.out.println("Maneira mais eficiente de ser ordenado");
        System.out.println(arcoIris4);


        //Uso de Lambda para ordenar uma classe<T>
        System.out.println("Alunos");
        Set<Aluno> alunos = new TreeSet<>((al1, al2) -> {
            return al1.getNome().compareToIgnoreCase(al2.getNome());
        });

        alunos.add(new Aluno("Denis", 7.5f));
        alunos.add(new Aluno("Julia", 7.5f));
        alunos.add(new Aluno("Andrew", 7.5f));

        System.out.println(alunos);

    }
}
