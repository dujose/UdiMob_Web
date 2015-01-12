package br.com.udimob.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import br.com.udimob.dto.Usuario;
import br.com.udimob.exceptions.UdimobGenericException;

@ParentPackage("default")
@Namespace(value="/cadastroImobiliaria")
public class CadastroImobiliariaAction extends GenericAction {

	private static final long serialVersionUID = 1L;

	Usuario u;

	@Action(value = "index", results = {@Result(name = "success", location="/cadastroImobiliaria.jsp"),
            							@Result(name = "error", location = "/cadastroImobiliaria.jsp")})
	public String index() {
		u = new Usuario();
		return SUCCESS;
	}
	
	@Action(value = "cadastrar", results = {@Result(name = "success", location="/cadastroImobiliaria.jsp"),
			                                 @Result(name = "error", location = "/cadastroImobiliaria.jsp")})
	public String cadastrar() {
		try {										
			usuarioService.save(u);		
		} catch (UdimobGenericException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}
	
}