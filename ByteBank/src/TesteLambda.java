import java.util.ArrayList;
import java.util.Collections;
	import java.util.Comparator;
	import java.util.function.Consumer;
	
import javax.swing.event.CaretListener;

public class TesteLambda {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(123, 456);
		Cliente c1 = new Cliente();
		c1.setNome("Diego");
		cc1.depositar(150.00);
		cc1.setTitular(c1);
		
		
		ContaCorrente cc2 = new ContaCorrente(789, 987);
		Cliente c2 = new Cliente();
		c2.setNome("Osmar");
		cc2.depositar(200.00);
		cc2.setTitular(c2);
		
		
		ContaCorrente cc3 = new ContaCorrente(456, 654);
		Cliente c3 = new Cliente();
		c3.setNome("Ana");
		cc3.depositar(100.00);
		cc3.setTitular(c3);
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		
	
		lista.sort((Conta conta1, Conta conta2) -> Integer.compare(conta1.getNumero(), conta2.getNumero())); // lambda
		
//		lista.sort(new Comparator<Conta>() { //Classe Anônima
//
//			@Override
//			public int compare(Conta c1, Conta c2) {
//				return Integer.compare(c1.getNumero(), c2.getNumero());
//			}
//		});
		
							//LAMBDA
		Comparator<Conta> comp = (Conta conta1, Conta conta2) -> {
			String titular1 = conta1.getTitular().getNome();
			String titular2 = conta2.getTitular().getNome();
			return titular1.compareTo(titular2);
			};
		
		
		// Classe Anonima
//		Comparator<Conta> comp = new Comparator<Conta>() {
//			
//			@Override
//			public int compare(Conta c1, Conta c2) {
//				
//				String titular1 = c1.getTitular().getNome();
//				String titular2 = c2.getTitular().getNome();
//				
//				return titular1.compareTo(titular2);
//			}
//		};
							//LAMBDA
		lista.forEach((conta)-> System.out.println(conta + "  " + conta.getTitular().getNome()) ); 
			
			for (Conta conta : lista) { 
			System.out.println(conta + "  " + conta.getTitular().getNome());
		}		

	}
}


