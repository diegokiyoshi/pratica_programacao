package br.com.alura.cursoexception.main;

import br.com.alura.cursoexception.modelo.Conexao;

public class TestaConexao {

	public static void main(String[] args) {
		
//		Conexao conexao = null; 
	
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro de conexão");
		}
		
		
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//			//conexao.fecha();
//		} catch(IllegalStateException ex) {
//			System.out.println("Erro de conexão");
//		} finally {
//			conexao.fecha();
//		}

	}

}
