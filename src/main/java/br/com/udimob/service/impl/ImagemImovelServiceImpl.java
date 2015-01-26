package br.com.udimob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.udimob.dao.ImagemImovelDAO;
import br.com.udimob.dto.ImagemImovel;
import br.com.udimob.service.ImagemImovelService;

@Service(value = "imagemImovelService")
public class ImagemImovelServiceImpl extends GenericServiceImpl<ImagemImovel> implements ImagemImovelService  {

	@Autowired
	private ImagemImovelDAO imagemImovel;
	
	@Override
	protected JpaRepository<ImagemImovel, Integer> getRepository() {
		return imagemImovel;
	}

	public void setImagemImovel(ImagemImovelDAO imagemImovel) {
		this.imagemImovel = imagemImovel;
	}

}
