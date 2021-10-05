package COLLECTIONS;

import java.util.HashSet;
import java.util.Set;

public class SetConjunto {

    public static void main(String[] args) {

        Set<String>  nomes = new HashSet<>();
        nomes.add("Gleydson");
        nomes.add("Leila");
        nomes.add("Anna");

        System.out.printf(String.valueOf(nomes));

        Set<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(170);
        numeros.add(34);

        System.out.printf(String.valueOf(numeros));


    }
}
