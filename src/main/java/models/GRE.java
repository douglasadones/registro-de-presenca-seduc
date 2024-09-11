package models;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author dougl
 */
public class GRE {

    private int codigo;
    private String nome;
    private List<Municipio> municipios;

    public GRE() {
    }

    public GRE(int codigo, String nome, List<Municipio> municipios) {
        this.codigo = codigo;
        this.nome = nome;
        this.municipios = municipios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigo;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.municipios);
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
        final GRE other = (GRE) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.municipios, other.municipios);
    }

    @Override
    public String toString() {
        return "Gre{" + "codigo=" + codigo + ", nome=" + nome + ", municipios=" + municipios + '}';
    }

}
