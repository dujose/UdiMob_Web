package br.com.udimob.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udimob.dto.InformacaoLogin;

public interface InformacaoLoginDAO extends JpaRepository<InformacaoLogin, Integer> {

}
