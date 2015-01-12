package br.com.udimob.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_imovel")
public class TipoImovel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="id_tipo_imovel", insertable=false, updatable=false)
	private Integer idTipoImovel;
	
	@Column(name="descricao")
	private String descricao;

	public Integer getIdTipoImovel() {
		return idTipoImovel;
	}

	public void setIdTipoImovel(Integer idTipoImovel) {
		this.idTipoImovel = idTipoImovel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
