import java.io.Serializable;

public abstract class Conta implements Comparable<Conta>, Serializable{
	
	protected Double saldo = 0.0;
	private Integer numero = 0;
	private Integer agencia = 0;
	private Cliente titular;
	private static Integer totalDeContas = 0;
	
	
	public static Integer getTotalDeContas() {
		return totalDeContas;
	}

	public static void setTotalDeContas(Integer totalDeContas) {
		Conta.totalDeContas = totalDeContas;
	}

	public Conta(Integer numero, Integer agencia) {
		totalDeContas++;
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Criando uma conta");
	}
	
	public void depositar(Double valor) {
		if(valor <= 0) {
			System.out.println("Valor inválido para depósito ");
		}else {
			this.saldo += valor;
		}
	}
	
	public void sacar(Double valor) throws SaldoInsuficienteException{
		
		if(valor <= 0 || saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + "Valor a ser sacado: " + valor);
		}
		
		this.saldo -= valor;
		
	}
		
	
	
	public void transferir(Double valor, Conta destino) throws SaldoInsuficienteException{
		sacar(valor);
		destino.depositar(valor);
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	public Integer getNumero() {
		return this.numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getAgencia() {
		return this.agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return this.saldo;
	}
	
	
}
