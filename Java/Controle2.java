package jogoacerto2;

import java.util.Random;

public class Controle {

	
	
	Random sort = new Random();
	private int alvo; 
	private int pontuacao;
	private int tentativa;
	int x;
	
    
	
	 public void inicializa(){
		 
		 alvo = sort.nextInt(10) +1;
        pontuacao = 100;
       
        //System.out.println("["+alvo+"]");
       
	 }
	 
	 
	 public boolean valida (int x) {
	    boolean res;
	    
	    tentativa++;
		
	    if (x != alvo) {
			res = false;
		 pontuacao = pontuacao - (tentativa * 3);
		}else {
			 res = true;
 
		 }
		 
		return res;
	}
	 
	 
	public int  pontuacao(){
	     return pontuacao;
	}
		
	public int  tentativa(){
	     return tentativa;	
	}
	
	
	/**
	 * @deprecated
	 */

	public void mostradica(int chute){
	
    pontuacao = pontuacao -10;
    if(chute > alvo)   
		System.out.println("Alvo � MENOR que " + chute );
	else
	    System.out.println("Alvo � MAIOR que " + chute );		
    
   
	
	}
	 
	 
	 
	 
}