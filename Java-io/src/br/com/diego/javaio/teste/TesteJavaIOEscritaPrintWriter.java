package br.com.diego.javaio.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteJavaIOEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("teste2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw); 
		
		PrintWriter ps = new PrintWriter("testeLeituraPrintWriter");
		ps.println("Vamos, vamos Corinthians!!");
		ps.println("Esta noite");
		ps.println("teremos que ganhar");
		ps.println();
		ps.println();
		ps.println("Eu sou Corinthians");
		
		
//		bw.write("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
//		bw.newLine();
//		bw.newLine();
//		bw.write("fim da linha");
		long milisegundos = System.currentTimeMillis();
		System.out.println(milisegundos);
		ps.close();
		//bw.close();
	}

}
