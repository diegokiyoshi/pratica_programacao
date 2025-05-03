package br.com.diego.javaio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteJavaIOCopiaDeArquivo {

	public static void main(String[] args) throws IOException {
		
		InputStream ips = System.in;//new FileInputStream("testeLeitura.txt");
		Reader isr = new InputStreamReader(ips);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out;//new FileOutputStream("testeLeitura3.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
	
		String leitura = br.readLine();
		
		while(leitura != null && !leitura.isEmpty()) {
			bw.write(leitura);
			bw.newLine();
			bw.flush(); // serve para imprimir no console toda vez que pula a linha
			leitura = br.readLine();
		}
		
		br.close();
		bw.close();
	}

}
