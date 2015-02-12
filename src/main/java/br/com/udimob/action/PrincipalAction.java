package br.com.udimob.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import br.com.udimob.dto.Imovel;
import br.com.udimob.exceptions.UdimobGenericException;

@ParentPackage("default")
@Namespace(value="/principal")
public class PrincipalAction extends GenericAction {

	private static final long serialVersionUID = 1L;

	private List<Imovel> imoveis;
	
	@Action(value = "index", results = {@Result(name = "success", location="/imobiliaria.jsp"),
										@Result(name = "error", location = "/imobiliaria.jsp")})
	public String index() {
		try {
			imoveis = new ArrayList<Imovel>();
		
			imoveis = imovelService.findAll();
		} catch (UdimobGenericException e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}

	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

}
