package br.com.udimob.action;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.MessageSource;

import br.com.udimob.service.ImovelService;
import br.com.udimob.service.InformacaoLoginService;
import br.com.udimob.service.TipoImovelService;
import br.com.udimob.service.UsuarioService;
import br.com.udimob.session.SessionConcierge;
import br.com.udimob.session.UsuarioLogado;

import com.opensymphony.xwork2.ActionSupport;

@Configurable(autowire = Autowire.BY_NAME, preConstruction = true)
public abstract class GenericAction extends ActionSupport implements Serializable, ServletRequestAware {

	private static final long serialVersionUID = 1L;

	protected transient UsuarioLogado usuarioLogado;
	
	protected transient SessionConcierge sessionConcierge;
	
	protected transient InformacaoLoginService informacaoLoginService;
	
	protected transient ImovelService imovelService;
	
	protected transient TipoImovelService tipoImovelService;
	
	protected transient UsuarioService usuarioService;
	
	/**
	 * Este metodo deve ser invocado apenas pelo Spring para configurar o objeto
	 * 'usuarioLogado'
	 */
	public void setUsuarioLogado(UsuarioLogado usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	/**
	 * Retorna dados da sessão do usuário logado.
	 */
	public UsuarioLogado getUsuarioLogado() {
		return usuarioLogado;
	}
	
	/**
	 * Este método deve ser invocado apenas pelo Spring para configurar o objeto 'sessionConcierge'
	 */
	public void setSessionConcierge(SessionConcierge sessionConcierge) {
		this.sessionConcierge = sessionConcierge;
	}
	
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	public void setImovelService(ImovelService imovelService) {
		this.imovelService = imovelService;
	}

	public void setTipoImovelService(TipoImovelService tipoImovelService) {
		this.tipoImovelService = tipoImovelService;
	}

	public void setInformacaoLoginService(InformacaoLoginService informacaoLoginService) {
		this.informacaoLoginService = informacaoLoginService;
	}

	/**
	 * Struts
	 */
	
	public static final String MESSAGE = "message";
	
	public static final String MENSAGEM_ERRO_DEFAULT = "Erro de execução do sistema.";
	
	@Autowired
	protected MessageSource messageSource;

	protected HttpServletRequest request;
	
	protected Map<String, Object> jsonData = new LinkedHashMap<String, Object>();
	protected String menuTree;
	protected String titulo = "";

	protected void addJsonActionSuccess(String key) {
		String message = getText(key);
		if (message.equals("Default")) {
			message = key;
		}
		jsonData.put("success", message);
	}

	protected void addJsonActionMessage(String key) {
		String message = getText(key);
		if (message.equals("Default")) {
			message = key;
		}
		jsonData.put("message", message);
	}

	protected void addJsonActionWarning(String key) {
		String message = getText(key);
		if (message.equals("Default")) {
			message = key;
		}
		jsonData.put("warning", message);
	}

	protected void addJsonActionError(String key) {
		String message = getText(key);
		if (message.equals("Default")) {
			message = key;
		}
		jsonData.put("error", message);
	}

	public String getText(String key) {
		return messageSource.getMessage(key, null, "Default", getLocale());
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Map<String, Object> getJsonData() {
		return jsonData;
	}

	public void setJsonData(Map<String, Object> jsonData) {
		this.jsonData = jsonData;
	}

	public boolean isAjax() {
		return "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

}
