package br.com.udimob.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

@Namespace(value="/descricao")
public class DescricaoImovel extends GenericAction {

	private static final long serialVersionUID = 1L;

	@Action(value = "index", results = {@Result(name = "success", location="/descricao.jsp"),
			@Result(name = "error", location = "/descricao.jsp")})
	public String index() {
		
		return SUCCESS;
	}
}
