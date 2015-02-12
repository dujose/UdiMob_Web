package br.com.udimob.action;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import br.com.udimob.dto.InformacaoLogin;
import br.com.udimob.dto.Usuario;
import br.com.udimob.exceptions.UdimobGenericException;

@Namespace(value="/login")
public class LoginAction extends GenericAction {

	static final long serialVersionUID = 1L;

	private String login;
	
	private String senha;

	private Usuario usuario = new Usuario();

	@Action(value = "fazerLogin", results = {@Result(name = "success", location="/imobiliaria.jsp"),
			                                 @Result(name = "error", location = "/index.jsp")})
	public String fazerLogin() {
		try {
			usuario.setLogin(login);
			usuario.setSenha(senha);
			
			Usuario usuarioValidado = usuarioService.findByLoginAndSenha(usuario.getLogin(), usuario.getSenha());
			usuario.setSenha(null);

			if(usuarioValidado != null) {
				// refaz login
				if(usuarioLogado != null) {
					if(usuarioLogado.getUsuario() != null) {
						this.usuarioLogado.setUsuario(new Usuario());
						this.usuarioLogado.setInformacaoLogin(new InformacaoLogin());
						this.usuarioLogado.setAutenticado(Boolean.FALSE);
					}
				}
				
				HttpSession session = request.getSession();
				sessionConcierge.adicionarUsuarioLogado(usuario.getLogin(), session);

				this.usuarioLogado.setAutenticado(Boolean.TRUE);
				this.usuarioLogado.setUsuario(usuarioValidado);

				InformacaoLogin informacaoLogin = new InformacaoLogin();
				this.usuarioLogado.setInformacaoLogin(informacaoLogin);
				informacaoLogin.setDtLogin(new Date());
				informacaoLogin.setUsuario(usuarioValidado);
				informacaoLogin.setCodSessao(session.getId());
				
//				informacaoLoginService.save(informacaoLogin);
				
				return SUCCESS;
			}
			
		} catch (UdimobGenericException e) {
			e.printStackTrace();
		}
		
		return ERROR;
	}
	
	@Action(value = "fazerLogout", results = {@Result(name = "success", location="/index.jsp"),
											  @Result(name = "error", location = "/index.jsp")})
	public String fazerLogout() {
		return SUCCESS;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
