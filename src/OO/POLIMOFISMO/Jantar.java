package OO.POLIMOFISMO;

public class Jantar {


    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(90.00);

        Arroz ingrediente1 = new Arroz(0.250);


        convidado.comer(ingrediente1);

        System.out.println(convidado.getPeso());


    }
}
