package Classes;

public class ControleBonificacao {
	
	private Double soma;
	
	public Double getSoma() {
		
		return this.soma;
	}
	
	public void registra(Funcionario funcionario) {
		
		Double total = funcionario.getBonificacao();
		
		this.soma += total;
	}
	

}
