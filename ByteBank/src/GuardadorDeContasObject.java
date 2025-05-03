
public class GuardadorDeContasObject {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContasObject() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Object ref) {
		this.referencias[posicaoLivre] = ref;
		posicaoLivre ++;
		
	}

	public int getQuantidadeDeElementos() {
		
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		
		return this.referencias[pos];
	}
}
