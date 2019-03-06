package br.unicamp.ic.mc302.oficina;

public class Tipo1 extends Servico{
	private int custo = 15;
	private String tipo;
	
	public Tipo1(String tipo) {
		this.tipo = tipo;
	}
	
	public int custo() {
		return custo;
	}
	
	public void mostra() {
		System.out.println("Tipo1");
	}
	
	public String tipoServ() {
		return tipo;
	}
}
