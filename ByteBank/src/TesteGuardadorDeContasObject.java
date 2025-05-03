
public class TesteGuardadorDeContasObject {

	public static void main(String[] args) {
		
		GuardadorDeContasObject guardaContaObject = new GuardadorDeContasObject();
		
		ContaCorrente cc1 = new ContaCorrente(123, 456);
		
		ContaCorrente cc2 = new ContaCorrente(789, 456);
		
		guardaContaObject.adiciona(cc1);
		guardaContaObject.adiciona(cc2);
		
		System.out.println("Quantidade de contas: " + guardaContaObject.getQuantidadeDeElementos());
		
		Conta ref = (Conta) guardaContaObject.getReferencia(0);
		
		System.out.println("Conteúdo: " + ref.getSaldo());

	}

}
