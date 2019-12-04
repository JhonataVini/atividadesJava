package view;

import entidade.Clube;
import entidade.Partida;

public class Tela {

	public void executar() {
		//ADM CRUD Clube
		Clube vasco     = new Clube("Vaixxco","Rio de Janeiro");
		Clube athletico = new Clube("Athetico", "Paraná");
		Clube ibis      = new Clube("ibis", "Pernambuco");
		
			
		//ADM CRUD de partida
		Partida p1 = new Partida();
		p1.campeonato = "Copa do Brasil";
		p1.local      = "Mineirão";
		p1.data       = "11/06/2019";
		
		Partida p2 = new Partida();
		p2.campeonato = "Copa do Brasil";
		p2.local      = "Arena da Baixada";
		p2.data       = "10/06/2019";
		p2.host       = athletico;
		p2.visitante  = vasco;
		
		
		this.mostraPartida(p2);
		System.out.println("Fim");
	}
	
	private void mostraPartida(Partida p) {		
		//System.out.println(p);	
		System.out.println(p.campeonato + ", "+ p.local + ", "+ p.data);
		System.out.println("Anfitrião: "+p.host.getNome());
		System.out.println("Visitante: "+p.visitante.getNome());

	}
	
}
