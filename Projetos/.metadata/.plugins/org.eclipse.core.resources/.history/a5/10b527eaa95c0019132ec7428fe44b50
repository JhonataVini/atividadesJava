package principal;
import java.util.Scanner;

public class Console {

	void executa(){
		Scanner entrada = new Scanner(System.in);
		IMC imc= new IMC();
		
		Pessoa p = new Pessoa();
		
		System.out.print("Digite seu Nome: ");
		
		String novonome = entrada.nextLine();
		p.setNome(novonome);
		
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		p.setPeso(peso);
		
		System.out.print("Digite sua Altura: ");
		double altura = entrada.nextDouble();
		p.setAltura(altura);
		
		//double indice= imc.getIndice(p.getPeso() , p.getAltura());
		//double indice= imc.getIndice(p);
		imc.atualiza(p);
		
		
		
		
		System.out.println("\nRelatório....");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Peso: " + p.getPeso());
		System.out.println("Altura: " + p.getAltura());
		System.out.println("Seu IMC é: "+ p.getImc());
		System.out.println("Sua avaliação é: "+p.getSituacao());
		
	}
	
	
}
