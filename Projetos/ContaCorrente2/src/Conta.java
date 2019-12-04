


class Conta {
  
  private Cliente cliente;
  private int numero;
  private int tipo;
  private double saldo;
  
  //INCLUIR AQUI SUA SOLUÇÃO
  //DESENVOLVA OS MÉTODOS NECESSÁRIOS CONFORME DESCRIÇÃO PARA CLASSE CONTA
  //E EXEMPLO DE MANIULAÇÃO ATRAVÉS DA CLASSE
  public Conta(int tipo, int numero) {
		saldo = 0;
		this.tipo = tipo;
		this.numero = numero;
	 }

public Cliente getCliente(){
  return cliente;
}
public void setCliente(Cliente cliente){
  this.cliente = cliente;
}

	public int getNumero() {
		return numero;
	}

	public int getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		
		saldo = saldo + valor;
		
	}

	public void retira(double valor) {
	  
	  if(saldo >= valor)
		saldo = saldo - valor;
		else
		saldo = saldo - (valor + valor * 10/100 );

	}
}
  
  
  
  
  

