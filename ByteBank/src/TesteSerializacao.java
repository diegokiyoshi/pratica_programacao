import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setCpf("1231321");
		cliente.setNome("Diego Kiyoshi");
		cliente.setProfissao("programador");
		
		ContaCorrente cc = new ContaCorrente(12313, 321321);
		cc.setTitular(cliente);
		cc.depositar(1200.00);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contaCorrente.bin"));
		oos.writeObject(cc);
		oos.close();

	}

}
