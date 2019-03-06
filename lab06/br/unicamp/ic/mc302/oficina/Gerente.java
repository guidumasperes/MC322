package br.unicamp.ic.mc302.oficina;

public class Gerente extends Funcionario{
	FilaServico fila = new FilaServico();
	
	public Gerente(String nome, String tipo) {
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
		super.setSalCom(30 * 0.15 * mult, 0.15 * mult);
		super.pagamento();
	}
}
