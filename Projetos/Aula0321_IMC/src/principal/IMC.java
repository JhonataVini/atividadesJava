package principal;
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
		
		String situacao;
		
		if (indice >=30){
			situacao= "Cuidado, acima do peso!";
			
		}else {
			situacao = "Cuidado, abaixo do peso!";	
				}
			
		
		return situacao;
		
	}


public void atualiza(Pessoa p){
	
	//calculo
	double imc = this.calculaIMC(p.getPeso(), p.getAltura());
	p.setImc(imc);
	if (imc >=30){
		p.setSituacao("Cuidado, acima do peso!");
		
	}else {
		p.setSituacao("Cuidado, abaixo do peso!");
			}
	
	
}

//vai ser o metodo para usar nos outros métodos
private double calculaIMC(Double p, double a){


	return  p / (a *a);
 	}

}
