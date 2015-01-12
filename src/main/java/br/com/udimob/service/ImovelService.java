package br.com.udimob.service;

import br.com.udimob.dto.Imovel;
import br.com.udimob.exceptions.UdimobGenericException;

public interface ImovelService extends GenericService<Imovel>{

	void salvarImovel(Imovel imovel) throws UdimobGenericException;
}
