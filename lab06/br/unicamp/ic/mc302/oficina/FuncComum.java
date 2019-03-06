package br.unicamp.ic.mc302.oficina;

public class FuncComum extends Funcionario {
	FilaServico fila = new FilaServico();
	
	public FuncComum(String nome, String tipo) {
		super(nome, tipo);
		fila.adicionaServico("Tipo1");
		fila.adicionaServico("Tipo2");
		fila.adicionaServico("Tipo1");
		fila.adicionaServico("Tipo3");
	}
	
	public void informaServico() {
		fila.calcServico();
	}
	
	public void pagamento() {
		int mult = fila.pagamento();
		super.setSalCom(30 * 0.10 * mult, 0.10 * mult);
		super.pagamento();
	}
}
