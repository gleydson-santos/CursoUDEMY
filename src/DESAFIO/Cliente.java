package DESAFIO;

import java.util.ArrayList;

public class Cliente {


    String nome;


    ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    double ObterValorTotal() {
        double total =  0;
        for(Compra compra: compras){
            total += compra.ObterValorTotal();
        }

        return total;

    }


}
