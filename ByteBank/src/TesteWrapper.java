
public class TesteWrapper {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);
		double idadeInt = idadeRef.doubleValue();
		
		String idadeString = "10";
		
		Double idadeTransformada = Double.valueOf(idadeString);
		
		Integer idadeParseada = Integer.parseInt(idadeString);
		
		System.out.println(idadeInt);
		
		System.out.println(idadeParseada);
		
		System.out.println(idadeTransformada);
		
	}

}
