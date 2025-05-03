
public class CalculadorDeImposto {

	private Double totalImposto;
	
	public void registra(Tributavel t) {
		Double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public Double getTotalImposto() {
		return totalImposto;
	}
}
