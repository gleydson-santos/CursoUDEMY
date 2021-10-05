package HorasDoJogo;

public class Entrada {
    int hora_entrada;
    int minito_entrada;
    int hora_saida;
    int minito_saida;

    Entrada(int hora_entrada,
            int minito_entrada,
            int hora_saida,
            int minito_saida) {
        this.hora_entrada = hora_entrada;
        this.minito_entrada = minito_entrada;
        this.hora_saida = hora_saida;
        this.minito_saida = minito_saida;
    }

    int ObterHora() {
        return (((hora_saida * 60) + minito_saida) - ((hora_entrada * 60) + minito_entrada)) / 60;
    }

    int Obterminutos() {
        return ((hora_saida * 60 + minito_saida) - (hora_entrada * 60 + minito_entrada)) % 60;
    }
}




