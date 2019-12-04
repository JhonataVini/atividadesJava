package teste;

import java.util.ArrayList;

import entidade.Aporte;
import entidade.Aposta;
import entidade.Doacao;
import entidade.Investimento;
import entidade.Projeto;

public class Console {
	public static void main(String[] args) {
		//Projetos
		Projeto doapet = new Projeto();
		doapet.nome = "Doacao de Caes";
		
		Projeto pratocheio = new Projeto();
		pratocheio.nome = "Bom prato Grarapiranga";
		
		Projeto semfrio = new Projeto();
		semfrio.nome = "Falo não";
	
		//aportes
		Doacao doa1 = new Doacao();//Tipo, valor antes era
		doa1.setValor(1000);
		
		Investimento inv2 = new Investimento();// valor
		inv2.setValor(500);
		
		Doacao doa3 = new Doacao();// valor
		doa3.setValor(100);
		
		Aposta apo4 = new Aposta();// valor
		apo4.setValor(100);
		
		
		
		
		
		doa1.projeto = pratocheio;
		inv2.projeto = doapet;
		doa3.projeto = semfrio;
		apo4.projeto = semfrio;
		
		
		System.out.println("Aportes\n--------------");
		apresenta(doa1);
		apresenta(inv2);
		apresenta(doa3);
		apresenta(apo4);
		
		semfrio.cancela();;
		

		ArrayList<Projeto> listaProjetos = new ArrayList<Projeto>();
			listaProjetos.add(doapet);
			listaProjetos.add(pratocheio);
			listaProjetos.add(semfrio);
		
		
			pratocheio.conclui();
			
			//relatorio
			apresenta(listaProjetos);
		
		System.out.println("Fim");
		
	}
	
	
	public static void apresenta(ArrayList<Projeto> listaProjetos) {
		//Relatorio
				Projeto	projtemp = new Projeto();
				System.out.println(" ");
				System.out.println("Relatório\n--------------");
				
				for(int i = 0; i < listaProjetos.size(); i++) {
					projtemp = listaProjetos.get(i);	
					System.out.println("["+projtemp.getEstadoStr()+"] "+projtemp.nome);
				}
				System.out.println("\n--------------");
	} 
	
	public static void apresenta(Projeto projeto) {
		
	}
	
    public static void apresenta(Aporte aporte) {  	   	
   	System.out.println("["+aporte.getTipoStr()+"] "+aporte.valor() + "/"+ aporte.saldo() );
	}
    
    
	

}
