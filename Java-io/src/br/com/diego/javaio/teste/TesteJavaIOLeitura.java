package br.com.diego.javaio.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteJavaIOLeitura {

	public static void main(String[] args) throws IOException {
	
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		
		while(scanner.hasNext()) {
			String leitura = scanner.nextLine();
			System.out.println(leitura);
			
			Scanner leituraScanner = new Scanner(leitura);
			leituraScanner.useDelimiter(",");
			leituraScanner.useLocale(Locale.US); // Como o SO está em Português, é preciso usar o useLocale(Locale.US) para deixar no formato dos EUA, pois 
			// a variável valor5 é um número decimal.
			
			String valor1 = leituraScanner.next();
			int valor2 = leituraScanner.nextInt();
			int valor3 = leituraScanner.nextInt();
			String valor4 = leituraScanner.next();	
			double valor5 = leituraScanner.nextDouble();
			
			System.out.format(new Locale("pt", "BR"),"%s" , valor1 + valor2 + valor3 + valor4 + valor5);
			
			//System.out.println(valorFormatado);
			
			leituraScanner.close();
		}
		
		
		scanner.close();
	}

}
