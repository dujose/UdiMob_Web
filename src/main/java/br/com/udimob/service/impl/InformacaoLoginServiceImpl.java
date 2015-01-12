package br.com.udimob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.udimob.dao.InformacaoLoginDAO;
import br.com.udimob.dto.InformacaoLogin;
import br.com.udimob.service.InformacaoLoginService;

@Service(value = "informacaoLoginService")
public class InformacaoLoginServiceImpl extends GenericServiceImpl<InformacaoLogin> implements InformacaoLoginService {

	@Autowired
	private InformacaoLoginDAO informacaoLoginDAO;
	
	@Override
	protected JpaRepository<InformacaoLogin, Integer> getRepository() {
		return informacaoLoginDAO;
	}

	public void setInformacaoLoginDAO(InformacaoLoginDAO informacaoLoginDAO) {
		this.informacaoLoginDAO = informacaoLoginDAO;
	}

}
