package br.com.udimob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.udimob.dao.UsuarioDAO;
import br.com.udimob.dto.Usuario;
import br.com.udimob.exceptions.UdimobGenericException;
import br.com.udimob.service.UsuarioService;

@Service(value = "usuarioService")
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario> implements UsuarioService{

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	protected JpaRepository<Usuario, Integer> getRepository() {
		return usuarioDAO;
	}

	public Usuario findByLoginAndSenha(String login, String senha) throws UdimobGenericException {
		try {
			return usuarioDAO.findByLoginAndSenha(login, senha);
		} catch (Exception e) {
			throw new UdimobGenericException(e.getMessage(), e);
		}
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

}
