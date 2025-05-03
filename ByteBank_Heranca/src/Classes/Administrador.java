package Classes;

public class Administrador extends Funcionario implements Autenticavel{
	
	private Autenticador autenticador;
	
	public Administrador() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public Double getBonificacao() {
		
		return super.getSalario() + 50;
	}

	@Override
	public void setSenha(Integer senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public Boolean autentica(Integer senha) {
		return this.autenticador.autentica(senha);
	}

}
