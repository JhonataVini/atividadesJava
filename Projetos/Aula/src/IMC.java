


public class IMC {
	
	double indice = 22.5;
	
	double getIndice(double peso, double altura){
		
		double indice;
		
		indice = peso/(altura *altura);
		
		
		
        if(altura == 0) {
        	
			return this.indice;
			
			
		}
        return indice;
	
	}
	
	double getIndice(Pessoa p){
		
		double indice;
		
		indice = p.getPeso()/(p.getAltura() *p.getAltura());
		
	
        if(p.getAltura() == 0) {
        	
			return this.indice;
			
			
		}
        return indice;
	
	}
	
	
String getSituacao(double indice){
		
		String situacao;
		
		if (indice >=30){
			situacao= "Cuidado, acima do peso!";
			
		}else {
			situacao = "Cuidado, abaixo do peso!";	
				}
			
		
		return situacao;
		
	}
}
