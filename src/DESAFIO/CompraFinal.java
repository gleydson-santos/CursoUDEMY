package DESAFIO;

public class CompraFinal {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.AdicionarItem("notebook", 1000, 1);

        Compra compra2 = new Compra();
        compra2.AdicionarItem("tv", 2000, 1);


        Cliente clientenovo = new Cliente("Gleydson santos");
        clientenovo.compras.add(compra1);
        clientenovo.compras.add(compra2);


        System.out.println(clientenovo.ObterValorTotal());

    }

}


