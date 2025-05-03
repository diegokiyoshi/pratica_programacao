

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(Integer numero, Integer agencia) {
		super(numero, agencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		
		return "Número Conta Corrente: " + super.getNumero() + "\n" + 
				"Agência Conta Corrente: " + super.getAgencia();
	}

}
