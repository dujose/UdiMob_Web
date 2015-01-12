package br.com.udimob.service;

import br.com.udimob.dto.Usuario;
import br.com.udimob.exceptions.UdimobGenericException;

public interface UsuarioService extends GenericService<Usuario>{

	Usuario findByLoginAndSenha(String login, String senha) throws UdimobGenericException;
}
