package COLLECTIONS;

import java.util.Objects;

public class Usuario {



    String nome;

    Usuario(String nome){
        this.nome =nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario1 = (Usuario) o;
        return Objects.equals(nome, usuario1.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
