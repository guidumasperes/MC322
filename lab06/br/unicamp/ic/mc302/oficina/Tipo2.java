package br.unicamp.ic.mc302.oficina;

public class Tipo2 extends Servico{
	private int custo = 50;
	private String tipo;
	
	public Tipo2(String tipo) {
		this.tipo = tipo;
	}
	
	
	public int custo() {
		return custo;
	}
	
	public void mostra() {
		System.out.println("Tipo2");
	}
	
	public String tipoServ() {
		return tipo;
	}
}
