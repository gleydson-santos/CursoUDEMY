package EXERCICIOS;

import java.util.Scanner;

public class ExercicioVendedor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("NOME:");
        entrada.next();

        System.out.println("SALÁRIO");
        double salario = entrada.nextDouble();

        System.out.println("VENDAS:");
        double vendas = entrada.nextDouble();

        double comissao =  (vendas * 15) / 100;
        double total = salario + comissao;

        System.out.printf("TOTAL = %.2f ", total);

    }

}
