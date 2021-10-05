package HorasDoJogo;
public class Saida {


    public static void main(String[] args) {

        Entrada entrada1 = new Entrada(7,37,10,59);

        System.out.println("O JOGO DUROU " + entrada1.ObterHora() +
                " HORAS E " + entrada1.Obterminutos() + " MINUTOS" );


    }
}
