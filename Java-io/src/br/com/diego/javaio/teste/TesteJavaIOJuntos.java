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
import java.io.Writer;

public class TesteJavaIOJuntos {

	public static void main(String[] args) throws IOException {
		
		OutputStream ops = new FileOutputStream("testeLeitura.txt");
		Writer ow = new OutputStreamWriter(ops);
		BufferedWriter bw = new BufferedWriter(ow);
		
		bw.write("Vai Corinthians!");
		bw.newLine();
		bw.newLine();
		bw.write("Vai e não para de lutar");
		bw.newLine();
		bw.write("Vai torcida fiel");
		
		bw.close();
		
		InputStream ips = new FileInputStream("testeLeitura.txt");
		InputStreamReader isr = new InputStreamReader(ips);
		BufferedReader bf = new BufferedReader(isr);
		
		String leitura = bf.readLine();
		
		while (leitura != null) {
			System.out.println(leitura);
			
			leitura = bf.readLine();
			
		}
		
		bf.close();
	}
}
