

/**
 * NAO ALTERAR
 */

/**
* classe do tipo interface com usuario
* Testa o projeto na versão 1 pra 1 (entre pessoa e avaliacao)
*/

public class TesteA {
    
   public static void executa(){
    	IMC imc = new IMC();
    	Relatorio report = new Relatorio();
    	
      Pessoa fulano = new Pessoa();
    	fulano.setNome("Fulano da Silva");
    	fulano.setPeso(80);
    	fulano.setAltura(1.75);
    	
    	
    	double novoIndice = imc.getIndice(fulano);
    	String novaSituacao = imc.getSituacao(novoIndice);

    	Avaliacao abril = new Avaliacao(novoIndice, novaSituacao);
    	fulano.avaliacao = abril;




    	
    	report.mostra(fulano);
    	
    
    }
  
  
  
}
