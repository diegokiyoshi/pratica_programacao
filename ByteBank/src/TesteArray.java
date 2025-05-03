
public class TesteArray {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		idades[0] = 20;
		idades[1] = 30;
		idades[2] = 40;
		idades[3] = 50;
		idades[4] = 60;
		
		int idade = idades[2];
		
		for(int i = 0; i < idades.length; i++) {
			
			while(i == 0) {
				idades[i] = 20;
			}
			
			idades[i] += 10;
			
			System.out.println(idades[i]);
		}
		
		//System.out.println(idade);
		

	}

}
