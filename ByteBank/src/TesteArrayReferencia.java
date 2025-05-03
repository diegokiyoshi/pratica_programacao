
public class TesteArrayReferencia {

	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(123, 456);
		
		ContaCorrente cc2 = new ContaCorrente(789, 312);
		
		contas[0] = cc1;
		
		contas[1] = cc2;
		
		System.out.println(contas[0].getNumero());
			
		

	}

}
