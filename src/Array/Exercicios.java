package Array;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("QUANTAS NOTAS");

        int quantnotas = ler.nextInt();

        double[] notas = new double[quantnotas];


        for (int i = 0; i < notas.length; i++) {
            System.out.println("INFORME A NOTA" + (i + 1) + ":");
            notas[i] = ler.nextDouble();
        }
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("A MEDIA É"  + media);
    }

}