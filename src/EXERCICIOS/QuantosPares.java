package EXERCICIOS;

import java.util.Scanner;

public class QuantosPares {

    public static void main(String[] args) {
        int par = 0;

        Scanner ler = new Scanner(System.in);


        for (int n = 0; n < 4; n++) {
            System.out.println("DIGITE O NUMERO:" + (n + 1) + ":");
            int num = ler.nextInt();

            if (num % 2 == 0) {
                par++;

            }


        }

        System.out.printf("FORAM DIGITADOS " + String.valueOf(par) +  " PARES");
    }

}