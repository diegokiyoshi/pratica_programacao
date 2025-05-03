package Classes;

public class SistemaInterno {

	Integer senha = 2222;
	
	public void autentica(Autenticavel fa) {
		Boolean autenticou = fa.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("Autorizado a entrar no sistema! ");
		} else {
			System.out.println("Não autorizado a entrar no sistema! ");
		}
	}
}
