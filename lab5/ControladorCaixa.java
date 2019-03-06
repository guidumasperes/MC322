public class ControladorCaixa {
	// Atributos
	private CadastroContas dbContas; // Banco de dados das contas
	private Caixa caixa;

	// Operacoes

	public ControladorCaixa(int senhaCaixa) {
		dbContas = new CadastroContas();
		caixa = new Caixa(senhaCaixa);
	}

	public float consultarSaldo(int num, int pwd) {
		ContaCor cta;
		cta = dbContas.buscarConta(num); // obtem referencia para o objeto que
											// representa a conta 'num'
		if (cta == null) // se numero de conta invalido ...
			return -1; // ... retorna -1
		else
			// caso contrario ...
			return cta.obterSaldo(pwd); // efetua consulta
	}

	public boolean efetuarSaque(int num, int pwd, float val) {
		ContaCor cta;
		if (val < 0 || (val % 10) != 0 || val > 200 || val > caixa.obterSaldoCaixa())
			return (false);
		cta = dbContas.buscarConta(num); // obtem a referencia para o objeto que
		// representa a conta 'num'
		if (cta == null) // se número de conta invalido ...
			return (false); // ... retorna false

		if (cta.debitarValor("Saque Automatico", val, pwd) == false) // se saque
																		// recusado
			return (false); // retorna false
		caixa.liberarNotas((int) (val / 10)); // libera pagamento
		return (true);
	}

	public boolean transferencia(int num, int benef, float val, int pwd) {
		ContaCor ctaNum = dbContas.buscarConta(num);
		ContaCor ctaBenef = dbContas.buscarConta(benef);
		if (ctaNum == null || ctaBenef == null)
			return (false);
		if (ctaNum.debitarValor("Transferencia", val, pwd) == false)
			return(false);
		if (ctaBenef.creditarValor(val) == false) {
			if(ctaNum.creditarValor(val) == false) // Devolve o dinheiro se nao for possivel a transferencia
				return(false); //se a conta se tornou inativa a pessoa deve contatar a agencia para reativa-la
		}
		return (true);
	}
	
	public boolean pagamentoBoleto(int num, int bol, int pwd, float val) {
		ContaCor cta = dbContas.buscarConta(num);
		
		if(cta == null)
			return (false);
		if(cta.debitarValor("Pagamento Boleto", val, pwd) == false)
			return (false);
		return (true);
	}
	
	public void recarregar(int pwd) {
		caixa.recarregar(pwd); // caixa recarregado
	}

	public boolean validarSenha(int pwd) {
		return caixa.validarSenha(pwd);
	}

}