package entidade;

/**
 * @author jhonata.lopes.a 
 */
public abstract class Aporte {

	private double valor;
	public Projeto projeto;
	
	
	public void setValor(double v) {		
		 this.valor = v;	
	}
	
	public double valor() {			
		return this.valor;	
	}	
	
	public double saldo() {	
		 return valor();	
		}
	
	public abstract String getTipoStr(); 
}
