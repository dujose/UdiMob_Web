package br.com.udimob.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="imagem_imovel")
public class ImagemImovel implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="id_imagem_imovel", insertable=false, updatable=false)
	private Integer idImagemImovel;
	
	@Column(name="nome_arquivo")
	private String nomeArquivo;
	
	@Column(name="url_arquivo")
	private String urlArquivo;

	public Integer getIdImagemImovel() {
		return idImagemImovel;
	}

	public void setIdImagemImovel(Integer idImagemImovel) {
		this.idImagemImovel = idImagemImovel;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getUrlArquivo() {
		return urlArquivo;
	}

	public void setUrlArquivo(String urlArquivo) {
		this.urlArquivo = urlArquivo;
	}

}