import java.util.Comparator;

public class TitularComparador implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String titular1 = c1.getTitular().getNome();
		String titular2 = c2.getTitular().getNome();
		
		return titular1.compareTo(titular2);
	}

}
