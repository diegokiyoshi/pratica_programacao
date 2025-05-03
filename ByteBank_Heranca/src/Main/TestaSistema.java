package Main;

import Classes.Administrador;
import Classes.Cliente;
import Classes.Designer;
import Classes.Funcionario;
import Classes.Gerente;
import Classes.SistemaInterno;

public class TestaSistema {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(gerente);
		si.autentica(adm);
		si.autentica(cliente);
	}
}
