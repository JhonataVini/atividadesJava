package rule;

import entidade.Pessoa;

public class IMC {
	
	double indice = 22.5;
	
public static double getIndice(double peso, double altura){
		
		double indice;
		
		//calculo
		indice = calculaIMC(peso, altura);
		
        if(altura == 0) {
        	
			return indice;
			
			
		}
        return indice;
	
	}
	
public static double getIndice(Pessoa p){
		
		double indice;
		
		//calculo
		indice = calculaIMC(p.getPeso(), p.getAltura());
		
	
        if(p.getAltura() == 0) {
        	
			return indice;
			
			
		}
        return indice;
	
	}
	
	
public static String getSituacao(double indice){
		
		
		
		if (indice <18)		
		return "MAGRO!!!";		
		else if(indice >28)				
			return "GORDO!!!";
			
	
		return "NORMAL :3";
		
	}



//vai ser o metodo para usar nos outros métodos
private static double calculaIMC(Double p, double a){


	return  p / (a *a);
 	}

}
