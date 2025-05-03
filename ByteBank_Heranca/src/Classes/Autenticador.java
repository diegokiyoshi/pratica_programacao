package Classes;

public class Autenticador {
	
	private Integer senha;
	
	public void setSenha(Integer senha) {
		this.senha = senha;
	}
	
	public Boolean autentica(Integer senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
