package EXERCICIOS;

import java.util.Scanner;

public class CombustivelGasto {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("DIGITE QUANTAS HORAS DE VIAGEM:");
        int horas = ler.nextInt();
        System.out.println("DIGITE A VELOCIDADE MEDIA:");
        int velocidade = ler.nextInt();

        int distancia = horas * velocidade;
        double litros_por_viagem = distancia / 12;

        System.out.printf("FORAM GASTOS %.3fl NA VIAGEM", litros_por_viagem);

    }


}
