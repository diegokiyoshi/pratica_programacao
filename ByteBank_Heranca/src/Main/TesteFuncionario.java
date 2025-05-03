package Main;

import Classes.Administrador;
import Classes.Funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario func1 = new Administrador();
		func1.setNome("Diego");
		func1.setCpf("226.787.878-00");
		func1.setSalario(2800.00);
		
		System.out.println("Nome: " + func1.getNome());
		System.out.println("CPF: " + func1.getCpf());
		System.out.println("Salário: " + func1.getSalario());
		System.out.println("Bonificação: " + func1.getBonificacao());
		
	}
}
