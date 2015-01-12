package br.com.udimob.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Imobiliaria
 */
@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="id_usuario", insertable=false, updatable=false)
	private Integer idUsuario;
	
	@Column(name="login", nullable=false)
	private String login;
	
	@Column(name="senha", nullable=false)
	private String senha;
	
	@Column(name="nome_imobiliaria")
	private String nomeImobiliaria;
	
	@Column(name="cnpj")
	private String cnpj;
	
	@Column(name="razao_social")
	private String razaoSocial;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="email")
	private String email;
	
	@Column(name="nome_proprietario")
	private String nomeProprietario;
	
	@Column(name="cpf_proprietario")
	private String cpfProprietario;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="bairro")
	private String bairro;

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeImobiliaria() {
		return nomeImobiliaria;
	}

	public void setNomeImobiliaria(String nomeImobiliaria) {
		this.nomeImobiliaria = nomeImobiliaria;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getCpfProprietario() {
		return cpfProprietario;
	}

	public void setCpfProprietario(String cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

}
