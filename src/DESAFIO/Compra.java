package DESAFIO;

import java.util.ArrayList;

public class Compra {


    ArrayList<Item> itens = new ArrayList<>();


    void  AdicionarItem( String nome, double preco, int qntd){
        var produto = new Produto(nome,preco);
        this.itens.add( new Item(produto,qntd));
    }


    double ObterValorTotal(){
        double total = 0;
        for (Item item : itens) {
        total += item.quantidade * item.produto.preco;
        }
        return total;

    }


}
