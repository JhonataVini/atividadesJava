import java.util.ArrayList;

/**
 * MODIFICAR CONFORME NECESSARIO
 */

public class Relatorio {

	
	public void mostra(Pessoa pessoa) {
		
		System.out.println("\n***** Relatório de Avaliação *****");
    	System.out.println("Nome   = " + pessoa.getNome());
    	System.out.println("Peso   = " + pessoa.getPeso());
    	System.out.println("Altura = " + pessoa.getAltura());
  		
  		System.out.println("*****");
  		
  		ArrayList<Avaliacao> lista = pessoa.getAvaliacoes();
  		
		
			
			
  			for(int i = 0; i < lista.size();i++) {
  				
  				Avaliacao temp = lista.get(i);
  				
    	System.out.print("- " + temp.getSituacao());
    	System.out.print(" [" + temp.getImc() + "]");
  			}
		
		
	}
}



