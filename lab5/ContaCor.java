public class ContaCor {
	// Constantes
	public static int ATIVA = 1;
	public static int ENCERRADA = 2;

	// Atributos
	private int estado; // 1=Ativa, 2=Encerrada
	private String titular; // nome do titular
	private int numConta; // numero da conta
	private int senha; // senha
	private float saldoAnterior; // saldo anterior
	private String historico[]; // historicos e
	private float valorLanc[]; // valores dos ultimos
	// lancamentos > 0 p/ creditos; < 0 p/ debitos
	private int ultLanc; // topo dos vetores acima
	private float saldoAtual; // saldo atual da conta

	// Operacoes
	public ContaCor(String titular, float saldoAtual, int numConta, int senha) {
		this.estado = ContaCor.ATIVA; // A conta se torna ativa, podendo receber
										// lancamentos.
		this.titular = titular;
		this.saldoAtual = saldoAtual;
		this.numConta = numConta;
		this.senha = senha;

		this.ultLanc = 0; // A conta sem nenhum lancamento.
		this.historico = new String[11]; // cria vetores ...
		this.valorLanc = new float[11]; // ... com 11 elementos
	}

	public float obterSaldo(int pwd) {
		// A conta deve estar ativa
		if (estado != ContaCor.ATIVA) return (-1);
		// A senha de entrada deve ser igual a senha da conta
		if (pwd != senha) return (-1);
		return (saldoAtual); // retorna o saldo atual
	}

	public boolean debitarValor(String hist, float val, int pwd) {
		// A conta deve estar ativa
		if (estado != ContaCor.ATIVA) return (false);
		// A senha de entrada deve ser igual a senha da conta
		if (pwd != senha) return (false);
		// O valor do lancamento deve ser maior que zero
		if (val <= 0) return (false);
		// O valor do lancamento nao pode ser superior ao saldo
		if (val > saldoAtual) return (false);
		if (ultLanc == 10) {// Se ha 10 lancamentos na lista
			saldoAnterior += valorLanc[1]; // atualiza saldo anterior
			for (int i = 1; i < 10; i++) { // remove o primeiro da lista
				historico[i] = historico[i + 1];
				valorLanc[i] = valorLanc[i + 1];
			}
		} else
			ultLanc++;
		historico[ultLanc] = hist; // guarda historico ...
		valorLanc[ultLanc] = -val; // ... e valor do lancamento
		// (com sinal negativo)
		saldoAtual -= val; // debita valor do saldo atual
		if (saldoAtual == 0) // se zerou o saldo ...
			estado = 2; // ... torna a conta inativa
		return (true);
	}
	
	public boolean creditarValor(float val) {
		if (estado != ContaCor.ATIVA) return (false);
		saldoAtual += val;
		return (true);
	}
}