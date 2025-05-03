
public class TestaGuardaContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guardaContas = new GuardadorDeContas();
		Conta cc = new ContaCorrente(123, 987);
		
		guardaContas.adiciona(cc);
		
		Conta cp = new ContaPoupanca(321, 654);
		
		guardaContas.adiciona(cp);
		
		int tamanho = guardaContas.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Conta ref = guardaContas.getReferencia(0);
		
		int infConta = ref.getNumero();
		
		System.out.println(ref);
		System.out.println(infConta);
	}
}

