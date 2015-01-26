package br.com.udimob.service;

import br.com.udimob.dto.TipoImovel;
import br.com.udimob.exceptions.UdimobGenericException;

public interface TipoImovelService extends GenericService<TipoImovel> {

	TipoImovel findByDescricao(String descricao) throws UdimobGenericException;
}
