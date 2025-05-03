import java.util.Comparator;

public class NumeroComparador implements Comparator<Conta> {

		@Override
		public int compare(Conta c1, Conta c2) {
			
//			if(c1.getNumero() < c2.getNumero()) {
//				return -1;
//			}
//			
//			if(c1.getNumero() > c2.getNumero()) {
//				return 1;
//			}
			
//						ou
			
//			return c1.getNumero() - c2.getNumero();
			
//						ou
						
			return Integer.compare(c1.getNumero(), c2.getNumero());			
		}
		
		
	}
