package models;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author dougl
 */
public class Escola {

    private String nome;
    private Municipio municipio;
    private List<Curso> cursos;

    public Escola() {
    }

    public Escola(String nome, Municipio municipio, List<Curso> cursos) {
        this.nome = nome;
        this.municipio = municipio;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.municipio);
        hash = 89 * hash + Objects.hashCode(this.cursos);
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
        final Escola other = (Escola) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        return Objects.equals(this.cursos, other.cursos);
    }

    @Override
    public String toString() {
        return "Escola{" + "nome=" + nome + ", municipio=" + municipio + ", cursos=" + cursos + '}';
    }

}
