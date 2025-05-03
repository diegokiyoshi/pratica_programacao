import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contaCorrente.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		System.out.println("Saldo " + cc.getSaldo()); 
		System.out.println("Nome: " + cc.getTitular().getNome());		
		ois.close();

	}

}
