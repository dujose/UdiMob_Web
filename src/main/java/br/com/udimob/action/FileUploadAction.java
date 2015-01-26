package br.com.udimob.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import br.com.udimob.dto.Imovel;
import br.com.udimob.dto.TipoImovel;

public class FileUploadAction extends GenericAction {

	private static final long serialVersionUID = 1L;

	private File fileUpload;
	private String fileUploadContentType;
	private String fileUploadFileName;
 
	public String getFileUploadContentType() {
		return fileUploadContentType;
	}
 
	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}
 
	public String getFileUploadFileName() {
		return fileUploadFileName;
	}
 
	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}
 
	public File getFileUpload() {
		return fileUpload;
	}
 
	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}
 
	public String execute() throws Exception{

		if(fileUpload != null) {
			
			FileInputStream stream = new FileInputStream(fileUpload);
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader br = new BufferedReader(reader);
			String linha = br.readLine();
			String[] celulas;
			while(linha != null) {
				celulas = linha.split(";");
				
				Imovel imovel = new Imovel();
				
				TipoImovel tipoImovel = new TipoImovel();
//				tipoImovel = tipoImovelService.findOne(Integer.valueOf(celulas[4]));
				tipoImovel = tipoImovelService.findByDescricao(celulas[0]);
				
				if(tipoImovel != null) {
					imovel.setUsuario(usuarioLogado.getUsuario());
					imovel.setDescricaoImovel(celulas[4]);
					imovel.setLogradouro(celulas[1]);
					imovel.setNumero(Integer.valueOf(celulas[2]));
					imovel.setBairro(celulas[3]);
					imovel.setTipoImovel(tipoImovel);
					imovel.setPreco(Double.valueOf(celulas[5]));
					
					imovelService.salvarImovel(imovel);
				}
				linha = br.readLine();
			}
			
			br.close();
			reader.close();
			stream.close();
		}
		return SUCCESS;
	}
 
	public String display() {
		return NONE;
	}
}
