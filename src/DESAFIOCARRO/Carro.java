package DESAFIOCARRO;

public class Carro {

    int velocicidade_atual = 20;


    void acelerar() {

        velocicidade_atual += 5;
    }

    void frear () {
        if (velocicidade_atual >= 5) {
            velocicidade_atual -= 5;
        }

        else {
            velocicidade_atual = 0;
        }
    }

    public String toString() {
        return "A VELOCIDADE ATUAL É : " + velocicidade_atual + " km/h.";
    }
}


