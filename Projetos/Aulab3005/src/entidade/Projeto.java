package entidade;

public class Projeto {
	public String nome;
	private int estado; //1 - Active(Ativo), 2 -Concluído, 9 - Cancelar.
	
	
	public Projeto(){
		this.estado = 1;
		
	}
	
	public int getEstadoCode() {
		
		return this.estado;
	}
	
	public String getEstadoStr() {
		
	if(this.estado == 1) {
		return "Ativo";
	}
	if(this.estado == 2) {
		return "Concluído";
	}
	if(this.estado == 9) {
		return "Cancelado";
	}
	
		return "FALHOU!!!";
	}
	
	public void cancela() {
		this.estado = 9;
	}

	
	public void conclui() {
		this.estado = 2;
	}
}
