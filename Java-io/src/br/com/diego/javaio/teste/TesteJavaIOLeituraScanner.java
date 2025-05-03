package br.com.diego.javaio.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteJavaIOLeituraScanner {

	public static void main(String[] args) throws IOException {
		
		// Há 2 categorias de leitura de dados (Stream e Reader)
		// Stream serve para ler PDF, imagens, vídeos (lida com bytes) e Reader para ler caracteres.
		
		// As 3 linhas a seguir, em conjunto establecem uma entrada com um arquivo (teste.txt)
//		FileInputStream fis = new FileInputStream("teste.txt"); 
//		InputStreamReader isr = new InputStreamReader(fis); // transforma os bytes em caracteres
//		BufferedReader br = new BufferedReader(isr); // agrupa todos os caracteres em uma linha
		
		//Podemos deixar a criação dos objetos com referências mais genéricas
		InputStream fis = new FileInputStream("teste.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr); 
		
		String leitura = br.readLine();
		
		while(leitura != null) {
			
			System.out.println(leitura);
			leitura = br.readLine();
		}
		
		
		br.close();
	}

}
