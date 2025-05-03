import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.event.CaretListener;

public class TesteComparador {

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
		
		//NumeroComparador numeroComparador = new NumeroComparador();
		//TitularComparador titularComparador = new TitularComparador();
		
		for (Conta conta : lista) {
			System.out.println(conta + "  " + conta.getTitular().getNome());
		}
		
		System.out.println("--------------------");
		
		//lista.sort(new TitularComparador());
		Collections.sort(lista);
		
		for (Conta conta : lista) {
			System.out.println(conta + "  " + conta.getTitular().getNome());
		}		

	}
}


