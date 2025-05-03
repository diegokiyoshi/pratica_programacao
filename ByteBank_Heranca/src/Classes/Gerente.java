package Classes;

public class Gerente extends Funcionario implements Autenticavel {

	Autenticador autenticador;
	
	public Gerente() {
		
		this.autenticador = new Autenticador();
	}
	
	public void setSenha(Integer senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public Double getBonificacao() {
		
		return super.getSalario();
	}

	@Override
	public Boolean autentica(Integer senha) {
		
		return this.autenticador.autentica(senha);
		
	}

}
