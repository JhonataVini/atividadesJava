package jogoacerto2;

import java.util.Scanner;


public class Principal {

  public static void main(String[] args ) {

   Controle jogo = new Controle();
   Scanner leia = new Scanner (System.in);
   int chute =0, op;
 
    
  
  jogo.inicializa(); 
 
  do {
	 
       if (jogo.tentativa()==0)
    	  System.out.print("Chute um numero: ");
       else
          System.out.print("Errou, temte novamente (0 para dica): ");
       
      op = leia.nextInt();
  
     
      if (op == 0) {
    	  jogo.mostradica(chute);
    	  System.out.print("Chute um numero:");
          chute = leia.nextInt();
      
      } else {
    	  chute = op;
      }
      
    } while (!jogo.valida(chute));
  

    System.out.println("*******");
    System.out.println("Parabens, acertou");
    System.out.println("Pontuacao : " + jogo.pontuacao());
    System.out.println("Tentativa(s): " + jogo.tentativa());

    
    
}

  
}