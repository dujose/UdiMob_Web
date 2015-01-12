package br.com.udimob.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udimob.dto.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
	
	Usuario findByLoginAndSenha(String login, String senha);
	
}
