package entidade;

public class Aposta extends Aporte {

	
	
	
	
	
	
	
	
	public double saldo() {
		if(projeto.getEstadoCode()== 9)//Cancelado
	       return valor() * -2;
		
		else if(projeto.getEstadoCode()== 2)//Concluido
			
		       return valor() * 2;
		
		 return valor();//Estado do projeto Ativo
		
	}
	
	public String getTipoStr() {		
		return "Aposta";
	}

	
}