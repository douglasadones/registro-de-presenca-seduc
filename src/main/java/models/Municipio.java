package models;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author dougl
 */
public class Municipio {
    
    private String nome;
    private GRE gre;
    private List<Escola> escolas;

    public Municipio() {
    }

    public Municipio(String nome, GRE gre, List<Escola> escolas) {
        this.nome = nome;
        this.gre = gre;
        this.escolas = escolas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GRE getGre() {
        return gre;
    }

    public void setGre(GRE gre) {
        this.gre = gre;
    }

    public List<Escola> getEscolas() {
        return escolas;
    }

    public void setEscolas(List<Escola> escolas) {
        this.escolas = escolas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Objects.hashCode(this.gre);
        hash = 19 * hash + Objects.hashCode(this.escolas);
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
        final Municipio other = (Municipio) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.gre, other.gre)) {
            return false;
        }
        return Objects.equals(this.escolas, other.escolas);
    }

    @Override
    public String toString() {
        return "Municipio{" + "nome=" + nome + ", gre=" + gre + ", escolas=" + escolas + '}';
    }
    
    
    
    
}
