package br.com.udimob.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udimob.dto.Imovel;

public interface ImovelDAO extends JpaRepository<Imovel, Integer> {

}
