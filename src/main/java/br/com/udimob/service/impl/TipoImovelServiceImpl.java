package br.com.udimob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.udimob.dao.TipoImovelDAO;
import br.com.udimob.dto.TipoImovel;
import br.com.udimob.service.TipoImovelService;

@Service(value = "tipoImovelService")
public class TipoImovelServiceImpl extends GenericServiceImpl<TipoImovel> implements TipoImovelService {

	@Autowired
	private TipoImovelDAO tipoImovelDAO;
	
	@Override
	protected JpaRepository<TipoImovel, Integer> getRepository() {
		return tipoImovelDAO;
	}

	public void setTipoImovelDAO(TipoImovelDAO tipoImovelDAO) {
		this.tipoImovelDAO = tipoImovelDAO;
	}

}
