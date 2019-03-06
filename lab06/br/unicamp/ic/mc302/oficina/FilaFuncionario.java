package br.unicamp.ic.mc302.oficina;

public class FilaFuncionario {
	private Funcionario funcs[];
	private boolean vazia = true;
	private int ultimaPosicao = 0;
	
	public FilaFuncionario() {
		funcs = new Funcionario[10];
	}
	
	public boolean Vazia() {
		return vazia;
	}
	
	public void adicionaFuncionario(String tipo, String nome) {
		if (ultimaPosicao <= 10) {
			if (tipo.equalsIgnoreCase("FuncComum")) {
				funcs[ultimaPosicao] = new FuncComum(nome, tipo);
			} else {
				if (tipo.equals("Gerente")) {
					funcs[ultimaPosicao] = new Gerente(nome, tipo);
				} else {
					System.out.println("A Fila contém apenas Funcionarios Comuns ou Gerente\n");
				}
			}
		} else {
			System.out.println("O funcionario não poderá ser adicionado, pois a fila está cheia");
		}
		ultimaPosicao++;
		vazia = false;
	}
	
	public void infFunc(int index) {
		funcs[index].informaTipo();
		funcs[index].informaServico();
	}
	
	public void folhaPagamento() {
		for(int i = 0; i < ultimaPosicao; i++) {
			funcs[i].pagamento();
		}
	}
}