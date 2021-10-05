package LAMBDAS;

public class CalculoTeste1 {

    public static void main(String[] args) {

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2,2));


        Calculo multiplicar = new Multiplicacao();
        System.out.println(multiplicar.executar(3,2));




    }
}
