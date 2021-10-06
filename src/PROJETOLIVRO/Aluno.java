package PROJETOLIVRO;

/*Criar um algoritmo que entre com nome e a matrícula para as disciplinas de Programação 1
e Sistemas de Informação. Cada disciplina tem 100 vagas. Após a entrada de dados,
aparecerá o menu a seguir:
        LISTA
        1 - Todos de Programação 1
        2- Todos de Sistemas de Informação
        3- Todos que fazem as duas
        4- Sair
        Opcao:
        1. Ao se digitar 1, sairão todos os nomes e respectivas matrículas.
        2. Ao se digitar 2, sairão todos os nomes e respectivas matrículas.
        3. Ao se digitar 3, sairão todos os nomes e respectivas matrículas. A PROCURA
        DEVERÁ SER FEITA PELA MATRÍCULA.
        4. Ao se digitar 4, aparecerá a mensagem: FECHANDO.
        5. Qualquer outro número, aparecerá a mensagem: OPÇÃO INVÁLIDA.*/

import java.util.Scanner;

public class Aluno {


    String nome;
    int matricula;
    String diciplina;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    @Override
    public String toString() {
        return "aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", diciplina='" + diciplina + '\'' +
                '}';
    }
}






