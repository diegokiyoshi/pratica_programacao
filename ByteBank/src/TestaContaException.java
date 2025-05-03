

public class TestaContaException {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.depositar(1500.00);
		try {
			conta.sacar(2000.00);
		} catch (SaldoInsuficienteException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Saldo " + conta.getSaldo());

	}

}
