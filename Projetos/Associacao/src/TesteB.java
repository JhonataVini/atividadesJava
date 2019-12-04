


/**
 * NAO ALTERAR
 */
 
/**
* classe do tipo interface com usuario
* Testa o projeto na versão 1 pra * (entre pessoa e avaliacao)
*/

public class TesteB { 
    
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
    	fulano.adicionaAvaliacao(abril);

    	Avaliacao maio = new Avaliacao(28.9, "SOBREPESO");
    	fulano.adicionaAvaliacao(maio);

    	Avaliacao junho = new Avaliacao(24.4, "NORMAL");
    	fulano.adicionaAvaliacao(junho);

    	Avaliacao julho = new Avaliacao(21.03, "MAGRO");
    	fulano.adicionaAvaliacao(julho);

    	Avaliacao agosto = new Avaliacao(21.03, "MAGRO");
    	fulano.adicionaAvaliacao(agosto);

    	Avaliacao setembro = new Avaliacao(23.87, "NORMAL");
    	fulano.adicionaAvaliacao(setembro);



    	
    	report.mostra(fulano);
    	
    
    }
  
  
  
}