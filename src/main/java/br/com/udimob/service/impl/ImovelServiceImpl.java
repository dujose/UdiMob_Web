package br.com.udimob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.udimob.dao.ImovelDAO;
import br.com.udimob.dto.Imovel;
import br.com.udimob.exceptions.UdimobGenericException;
import br.com.udimob.service.ImovelService;

@Service(value = "imovelService")
public class ImovelServiceImpl extends GenericServiceImpl<Imovel> implements ImovelService {

	@Autowired
	private ImovelDAO imovelDAO;
	
	@Override
	protected JpaRepository<Imovel, Integer> getRepository() {
		return imovelDAO;
	}

	@Override
	@Transactional(rollbackFor = { Throwable.class })
	public void salvarImovel(Imovel imovel) throws UdimobGenericException {
		try {
			imovelDAO.save(imovel);
		} catch (Exception e) {
			throw new UdimobGenericException(e.getMessage(), e);
		}
	}
	
	public void setImovelDAO(ImovelDAO imovelDAO) {
		this.imovelDAO = imovelDAO;
	}

}
