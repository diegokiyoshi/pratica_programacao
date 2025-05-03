package br.com.alura.cursoexception.main;

import br.com.alura.cursoexception.modelo.Conta;
import br.com.alura.cursoexception.modelo.MinhaExcecao;

public class TestaExcecao {

	public static void main(String[] args) {
		Conta conta = new Conta();
		try {
			conta.deposita();
		}catch (MinhaExcecao e) {
			System.out.println("Teste exceção...");
		}
		
	}
}
