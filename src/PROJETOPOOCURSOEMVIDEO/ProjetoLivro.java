package PROJETOPOOCURSOEMVIDEO;

public class ProjetoLivro {
    public static void main(String[] args) {


        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("gleydson",30,"masculino");
        p[1] = new Pessoa("leila", 39, "feminino");
        l[0] =  new Livro("Narnia","cs lews",100,p[0]);
        l[1] = new Livro("santidade","jc ryle",500,p[1]);


        l[0].abrir();
        l[0].avancarpag();
        l[0].folhear(50);

        l[1].folhear(200);
        l[1].abrir();


        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());

        System.out.println(l[1].detalhes());


    }

}
