package generics;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author dougl
 */
@MappedSuperclass
public class GenericEntity implements Serializable {

    private Boolean ativo;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAtualizacao;

    public GenericEntity() {
        this.ativo = Boolean.TRUE;
        dataCriacao = Calendar.getInstance();
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

}
