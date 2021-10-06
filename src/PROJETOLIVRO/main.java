package PROJETOLIVRO;

import PROJETOPOOCURSOEMVIDEO.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        dadosAlunos();
    }

    public static void dadosAlunos() {
        Scanner sc = new Scanner(System.in);
        Aluno aluno;
        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        int opcao = 0;

        do {
            System.out.println("ESCOLHA UMA DAS OPÇOES");
            System.out.println("OPÇÃO 1 - CADASTRAR ALUNO");
            System.out.println("OPÇÃO 3 - MOSTRA TODOS OS ALUNOS");
            System.out.println("OPÇÃO 4 - SAIR");

            System.out.println("DIGITE SUA OPÇÃO:");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                aluno = new Aluno();

                System.out.println("DIGITE MATRICULA:");
                aluno.setMatricula(Integer.parseInt(sc.nextLine()));

                System.out.println("DIGITE O NOME");
                aluno.setNome(sc.nextLine());

                System.out.println("DIGITE O CURSO 1=sistema de informação/2= programação 1:");
                aluno.setDiciplina(sc.nextLine());


                System.out.println();

                listaAlunos.add(aluno);

            } else if (opcao == 3) {
                if (listaAlunos.isEmpty()) {
                    System.out.println("NÃO TEM ALUNO CADASTRADO,PRECIONE UMA TECLA");
                    sc.nextLine();
                } else {
                    System.out.println(listaAlunos.toString());
                    System.out.println("PRECIONE UMA TECLA PARA CONTINUAR:");
                    sc.nextLine();
                }

            }
        }
            while (opcao!=0);
            sc.close();

    }
}