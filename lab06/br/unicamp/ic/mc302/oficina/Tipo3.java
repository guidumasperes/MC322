package br.unicamp.ic.mc302.oficina;

public class Tipo3 extends Servico {
	private int custo = 40;
	private String tipo;
	
	public Tipo3(String tipo) {
		this.tipo = tipo;
	}
	
	public int custo() {
		return custo;
	}
	
	public void mostra() {
		System.out.println("Tipo3");
	}
	
	public String tipoServ() {
		return tipo;
	}
}
