package View;
import java.util.Scanner;

import Rule.IMC;
import entidade.Avaliacao;
import entidade.Pessoa;

public class Console {

	public void executa(){
		//Scanner entrada = new Scanner(System.in);
		IMC imc= new IMC();
		Relatorio report= new Relatorio();
		
		
		Pessoa p = new Pessoa();
		
		//System.out.print("Digite seu Nome: ");
		
		//String novonome = entrada.nextLine();
		p.setNome("Virgulino");
		
		//System.out.print("Digite seu peso: ");
		//double peso = entrada.nextDouble();
		p.setPeso(2);
		
		//System.out.print("Digite sua Altura: ");
		//double altura = entrada.nextDouble();
		p.setAltura(2);
		
		
		double  novoIndice = imc.getIndice(p);
		String novaSituacao = imc.getSituacao(novoIndice);
		
		//double indice= imc.getIndice(p.getPeso() , p.getAltura());
		//double indice= imc.getIndice(p);
		
		Avaliacao abril = new Avaliacao(novoIndice, novaSituacao);
		p.adicionaAvaliacao(abril);
		
		Avaliacao maio = new Avaliacao(23.45, "Gordo");
		p.adicionaAvaliacao(maio);
		
		Avaliacao junho = new Avaliacao(21.45, "Normal");
		p.adicionaAvaliacao(junho);
		
		Avaliacao julho = new Avaliacao(19.45, "Magro");
		p.adicionaAvaliacao(julho);
		
		report.mostra(p);
		
	}
	
	
}
