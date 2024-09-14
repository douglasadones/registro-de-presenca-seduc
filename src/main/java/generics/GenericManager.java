package generics;

import jakarta.annotation.PostConstruct;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author dougl
 */
public abstract class GenericManager implements Serializable {

    private String editar;
    private String visualizar;

    @PostConstruct
    public void init() {
        carregarParametros();
        if (isEditar()) {
            carregar(this.editar);
        }

        if (isVisualizar()) {
            carregar(this.visualizar);
        }
        instanciar();
    }

    public abstract void carregar(String param);

    public abstract void instanciar();

    public abstract String getUrlPesquisar();

    public abstract String getUrlVisualizar();

    public String getTitulo() {
        if (isEditar()) {
            return "Editar";
        } else if (isVisualizar()) {
            return "Visualizar";
        } else if (isCadastrar()) {
            return "Cadastrar";
        } else {
            return "";
        }
    }

    public String getIcon() {

        if (isEditar()) {
            return "pi pi-pencil";
        } else if (isVisualizar()) {
            return "pi pi-eye";
        } else if (isCadastrar()) {
            return "pi pi-plus";
        } else {
            return "";
        }
    }

    public Boolean isRenderizarBotao() {
        return isVisualizar() || isEditar();
    }

    public String getUrlAposCancelar() {
        if (isVisualizar()) {
            return getUrlPesquisar();
        } else if (isEditar()) {
            return getUrlVisualizar();
        } else {
            return "index.xhtml";
        }
    }

    public Boolean isEditar() {
        return this.editar != null && !this.editar.isEmpty();
    }

    public Boolean isVisualizar() {
        return this.visualizar != null && !this.visualizar.isEmpty();
    }

    public Boolean isCadastrar() {
        return !this.isEditar() && !this.isVisualizar();
    }

    public void carregarParametros() {
        Map<String, String> params = FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getRequestParameterMap();

        this.editar = params.get("editar");
        this.visualizar = params.get("visualizar");
    }

}
