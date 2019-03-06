import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;

public class TrmCxAut {
	// Constantes
	public static int MODO_SUPERVISOR = 0;
	public static int MODO_CLIENTE = 1;

	// Atributos
	private ControladorCaixa controladorCaixa; // caixa que processa as
												// transacoes
	private int modoAtual; // modo de operacao atual: 0=supervisor, 1=cliente

	// Operacoes
	public TrmCxAut(int senhaCaixa, int modoOperacao) {
		controladorCaixa = new ControladorCaixa(senhaCaixa);
		modoAtual = modoOperacao;
	}

	public void iniciarOperacao() {
		int op; // codigo da operacao solicitada
		op = getOp();
		while (op != 9) {
			switch (op) {
			case 1:
				float saldo = controladorCaixa.consultarSaldo(getInt("numero da conta"),
						getInt("senha"));
				if (saldo == -1) // testa se consulta foi rejeitada
					System.out.println("conta/senha invalida");
				else
					System.out.println("Saldo atual: " + saldo);
				break;
			case 2:
				boolean b = controladorCaixa.efetuarSaque(getInt("numero da conta"),
						getInt("senha"), getInt("valor"));
				if (b) // testa se saque foi aceito
					System.out.println("Pode retirar o dinheiro");
				else
					System.out.println("Pedido de saque recusado");
				break;
			case 3:
				controladorCaixa.recarregar(getInt("senha"));
				break;
			case 4:
				boolean b1 = controladorCaixa.transferencia(getInt("numero da sua conta"), getInt("numero da conta a receber"), getInt("valor"),  getInt("senha"));
				if (b1)
					System.out.println("Transferencia realizada com sucesso");
				else
					System.out.println("Pedido de transferencia recusado");
				break;
			case 5:
				boolean b2 = controladorCaixa.pagamentoBoleto(getInt("numero da conta"), getInt("numero do boleto"), getInt("senha"), getInt("valor"));
				if (b2)
					System.out.println("Pagamento com boleto realizado com sucesso");
				else
					System.out.println("Pedido de pagamento com boleto recusado");
				break;
			case 8:
				this.alternarModo(getInt("senha do supervisor"));
				break;
			}
			op = getOp();
		}
	}

	void alternarModo(int senhaSupervisor) {
		if (this.controladorCaixa.validarSenha(senhaSupervisor)) {
			if (this.modoAtual == TrmCxAut.MODO_SUPERVISOR)
				this.modoAtual = TrmCxAut.MODO_CLIENTE;
			else
				this.modoAtual = TrmCxAut.MODO_SUPERVISOR;
		}

	}

	private int getOp() {
		int op;
		do {
			if (modoAtual == TrmCxAut.MODO_CLIENTE) { // modo cliente
				op = getInt("opcao: 1 = consulta saldo, 2 = saque, 4 = transferencia, 5 = pagamento bolelto, 8 = modo supervisor, 9 = sai");
				if (op != 1 && op != 2 && op != 4 && op != 5 && op != 8 && op != 9) op = 0;
			} else { // modo supervisor
				op = getInt("opcao: 3 = recarrega, 8 = modo cliente, 9 = sai");
				if (op != 3 && op != 8 && op != 9) op = 0;
			}
		} while (op == 0);
		return (op);
	}

	private int getInt(String str) {
		Reader r = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(r);

		System.out.println("Entre com " + str);
		try {
			st.nextToken();
		} catch (IOException e) {
			System.out.println("Erro na leitura do teclado");
			return (0);
		}
		return ((int) st.nval);
	}

}