package entidade;

public class Investimento extends Aporte {


	public double saldo() {		
		 return valor()/2;		
		}
		
		public String getTipoStr() {
			return "Investimento";
		}
}
