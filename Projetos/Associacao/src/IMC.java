

/**
 * NAO ALTERAR
 */
 
public class IMC {

	private double indice = 22.5;

	public double getIndice(double peso, double altura) {
		double indice;

		indice = this.calculaIMCBasico(peso, altura);

		if (altura == 0)
			return this.indice;

		return indice;
	}

	public double getIndice(Pessoa p) {
		double indice;

		indice = this.calculaIMCBasico(p.getPeso(), p.getAltura());

		if (p.getAltura() == 0)
			return this.indice;

		return indice;
	}

	public String getSituacao(double indice) {
		if (indice < 18)
			return "MAGRO";
		
		else if (indice > 28)
			return "GORDO";

		return "NORMAL";

	}

	private double calculaIMCBasico(double p, double a) {
		return p / (a * a);
	}

}

