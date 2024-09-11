package models;

import java.util.Objects;

/**
 *
 * @author dougl
 */
public class Aluno {

    private String matricula;
    private String nome;
    private Municipio municipio;
    private Escola escola;
    private Curso curso;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, Municipio municipio, Escola escola, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.municipio = municipio;
        this.escola = escola;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.matricula);
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.municipio);
        hash = 67 * hash + Objects.hashCode(this.escola);
        hash = 67 * hash + Objects.hashCode(this.curso);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        if (!Objects.equals(this.escola, other.escola)) {
            return false;
        }
        return Objects.equals(this.curso, other.curso);
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", municipio=" + municipio + ", escola=" + escola + ", curso=" + curso + '}';
    }

}
