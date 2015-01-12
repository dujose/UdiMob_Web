package br.com.udimob.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udimob.dto.TipoImovel;

public interface TipoImovelDAO extends JpaRepository<TipoImovel, Integer> {

}
