package br.com.diego.javaio.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteJavaIOEscrita {

	public static void main(String[] args) throws IOException {
		
		// Há 2 categorias de leitura de dados (Stream e Reader)
		// Stream serve para ler PDF, imagens, vídeos (lida com bytes) e Reader para ler caracteres.
		
		// As 3 linhas a seguir, em conjunto establecem uma entrada com um arquivo (teste.txt)
//		FileInputStream fis = new FileInputStream("teste.txt"); 
//		InputStreamReader isr = new InputStreamReader(fis); // transforma os bytes em caracteres
//		BufferedReader br = new BufferedReader(isr); // agrupa todos os caracteres em uma linha
		
		//Podemos deixar a criação dos objetos com referências mais genéricas
		OutputStream fos = new FileOutputStream("teste2.txt");
		Writer osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw); 
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
		bw.newLine();
		bw.newLine();
		bw.write("Aramaçã");

		
		
		bw.close();
	}

}
