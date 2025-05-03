
public class TestaConta {

	public static void main(String[] args) {
		
		//Conta c1 = new Conta();
//		ContaCorrente c1 = new ContaCorrente(1234, 32165);
//		Cliente cliente1 = new Cliente();
//		cliente1.setNome("Diego");
//		cliente1.setCpf("226.787.878-00");
//		cliente1.setProfissao("Programador");
//		c1.setTitular(cliente1);
//		c1.depositar(1000.00);
		
		
		ContaCorrente c1 = new ContaCorrente(1233, 3221);
		c1.depositar(1000.00);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		
		ci.registra(sv);
		ci.registra(c1);
		
		System.out.println(ci.getTotalImposto());
		
		//c1.getTitular().setNome("Raquel");
//		
////		System.out.println(cliente1.getNome() + " " + c1.getNumero() + " "
//				+ c1.getAgencia());
		
		Conta c2 = new ContaCorrente(9874, 123545);
//		c1.transferir(250.00, c2);
		Conta c3 = new ContaCorrente(9874, 123545);
		
	//	c1.sacar(250.00);
		
		Conta c4 = new ContaCorrente(2370, 12345);
		Cliente cliente4 = new Cliente();
		
//		c4.setTitular(cliente4);
//		
//		cliente4.setCpf("123456789");
//		cliente4.setNome("Diego");
//		cliente4.setProfissao("Programador");
//		
//		System.out.println("Nome: " + c4.getTitular().getNome());
//		System.out.println("Profissão: " + c4.getTitular().getProfissao());
//		System.out.println("Nome: " + c4.getTitular().getCpf());
	
	
		
//		System.out.println("Saldo final de C1: " + c1.getSaldo());
//		System.out.println("Saldo C2: " + c2.getSaldo());
		
//		System.out.println(Conta.getTotalDeContas());
		
	}

}
