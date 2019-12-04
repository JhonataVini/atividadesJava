package entidade;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private double peso;
	private double altura;
	
	private ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	
	
	public void setNome(String s){	
		nome = s;	
	}
    public  String getNome(){

		return nome;	
	}
    
    
	public void setPeso(double p){	
		peso = p;	
	}
	
   public double getPeso(){

		return peso;	
	}
    
    
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
    
	public void adicionaAvaliacao(Avaliacao a){	
		avaliacoes.add(a);	
	}
	
    public  ArrayList<Avaliacao> getAvaliacoes(){

		return avaliacoes;	
	}
}
