public class Caixa {
	// Atributos
	private float saldoCaixa; // saldo no caixa, em R$
	private int senhaCaixa;

	// Operacoes
	public Caixa(int senhaCaixa) {
		this.senhaCaixa = senhaCaixa;
		this.saldoCaixa = 0;
	}

	public void recarregar(int pwd) {
		if (this.senhaCaixa == pwd) {
			this.saldoCaixa = 1000; // caixa recarregado (R$ 1000,00)
			System.out.println("Caixa recarregado!");
		} else
			System.out.println("Senha incorreta!");
	}

	void liberarNotas(int qtd) {
		this.saldoCaixa -= qtd * 10; // notas de R$10
		while (qtd-- > 0)
			System.out.println("===/ R$10,00 /===>");
	}

	public float obterSaldoCaixa() {
		return this.saldoCaixa;
	}

	public boolean validarSenha(int pwd) {
		if (this.senhaCaixa == pwd)
			return true;
		else
			return false;
	}
}