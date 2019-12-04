package entidade;

import java.util.Date;

public class Avaliacao {
	
	private double imc;
	private String situacao;
	private Date data;
	
	
	

	public Avaliacao(double imc, String situacao) {
		this.imc = imc;
		this.situacao = situacao;
		this.data = new Date();
		
	}

	public double getImc() {
		return imc;
	}
	
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public Date getData() {
		return data;
	}
	
}
