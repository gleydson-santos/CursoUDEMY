package Array;

import java.util.Scanner;

public class TestesDeCodigo {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        System.out.println("1 ENTRADA:");
        int entrada_1 = ler.nextInt();


        int[] entrada = new int[entrada_1];


        for (int i = 0; i < entrada_1; i++) {
            System.out.println("ENTRADA = ");
            int entradas = ler.nextInt();
            entrada[i] = entradas;

        }
        for (int n = 0; n < entrada_1; n++){
            System.out.println("RESPOSTA =" + entrada[n]);
        }
    }
}
