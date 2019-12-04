package View;

import java.util.ArrayList;

import entidade.Avaliacao;
import entidade.Pessoa;

public class Relatorio {

	public void mostra(Pessoa p){
		
		System.out.println("\nRelat�rio....");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Peso: " + p.getPeso());
		System.out.println("Altura: " + p.getAltura());
		System.out.println("\n....");
		
		ArrayList<Avaliacao> lista = p.getAvaliacoes();
		
		if(lista.size()>0) {
			
			
		for(int i = 0; i < lista.size();i++) {
			
			Avaliacao temp = lista.get(i);
			System.out.println("\n....");
			System.out.println("Avalia��o "+i+": "+ temp.getData());
			System.out.println("Indice: "   + temp.getImc());
			System.out.println("Sua avalia��o �: "   + temp.getSituacao());
			
			
			/*for(Avaliacao temp:lista) {
				System.out.println("\n....");
				
				System.out.println("data: "   + temp.getData());
				System.out.println("Indice: "   + temp.getImc());
				System.out.println("Sua avalia��o �: "   + temp.getSituacao());*/
			
			
			
		}
		}else{
			System.out.println("Nenhuma avalia��o cadastrada");
		}
			
		
	}
	
	
}
