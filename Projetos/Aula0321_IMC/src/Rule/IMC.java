package Rule;

import entidade.Pessoa;

public class IMC {
	
	double indice = 22.5;
	
public	double getIndice(double peso, double altura){
		
		double indice;
		
		//calculo
		indice = this.calculaIMC(peso, altura);
		
        if(altura == 0) {
        	
			return this.indice;
			
			
		}
        return indice;
	
	}
	
public double getIndice(Pessoa p){
		
		double indice;
		
		//calculo
		indice = this.calculaIMC(p.getPeso(), p.getAltura());
		
	
        if(p.getAltura() == 0) {
        	
			return this.indice;
			
			
		}
        return indice;
	
	}
	
	
public String getSituacao(double indice){
		
		
		
		if (indice <18)		
		return "MAGRO!!!";		
		else if(indice >28)				
			return "GORDO!!!";
			
	
		return "NORMAL :3";
		
	}



//vai ser o metodo para usar nos outros métodos
private double calculaIMC(Double p, double a){


	return  p / (a *a);
 	}

}
