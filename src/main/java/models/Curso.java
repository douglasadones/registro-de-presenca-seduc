package models;

import java.util.Objects;

/**
 *
 * @author dougl
 */
public class Curso {

    private String nome;
    private Escola escola;

    public Curso() {
    }

    public Curso(String nome, Escola escola) {
        this.nome = nome;
        this.escola = escola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.escola);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.escola, other.escola);
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", escola=" + escola + '}';
    }

}
