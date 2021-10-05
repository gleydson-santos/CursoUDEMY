package COLLECTIONS;

import java.util.ArrayList;

public class ListLista {
    public static  void main(String[] args) {


        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("FULANO"));


        lista.add(new Usuario("SICRANO"));

        System.out.println(lista.get(0).nome);


        System.out.println(lista.contains("SICRANO"));

        for(Usuario u: lista){
            System.out.println(u);
        }


    }


}
