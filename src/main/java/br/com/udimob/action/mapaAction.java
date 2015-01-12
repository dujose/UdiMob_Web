package br.com.udimob.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

@Namespace(value="/mapa")
public class mapaAction extends GenericAction {

	private static final long serialVersionUID = 1L;

	@Action(value = "index", results = {@Result(name = "success", location="/maps.jsp"),
			@Result(name = "error", location = "/maps.jsp")})
	public String index() {
		
		return SUCCESS;
	}
}
