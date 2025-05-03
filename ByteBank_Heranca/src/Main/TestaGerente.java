package Main;

import Classes.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Raquel");
		gerente1.setCpf("221.987.963-87");
		gerente1.setSalario(10000.00);
		gerente1.setSenha(123654);
		
			System.out.println(gerente1.getBonificacao());
		
		
	}
	
	

}
