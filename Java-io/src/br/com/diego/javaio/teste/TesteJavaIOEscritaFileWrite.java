package br.com.diego.javaio.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteJavaIOEscritaFileWrite {

	public static void main(String[] args) throws IOException {
		
		
//		OutputStream fos = new FileOutputStream("teste2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//O CODIGO ACIMA PODE SER SUBSTITUÍDO PELO CÓDIGO ABAIXO
		
		FileWriter fw = new FileWriter("testeFileWriter");
		BufferedWriter bw = new BufferedWriter(fw);
		
		// Pode ser usado desta forma com o FileWriter, com quebras de linhas, mas o mais elegante seria utilizar o BufferedWriter para
		// quebra de linha, pois possui um código de mais alto nível que utiliza o método newLine()
		
//		fw.write("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write("fim da linha");

		bw.write("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("fim da linha");
		
		bw.close();
	}

}
