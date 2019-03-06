package br.unicamp.ic.mc302.sistSolar;

public class CorpoCeleste {
	private String nome;
	protected double massa;
	protected double diametro;
	
	public CorpoCeleste(String nom) {
		nome = nom;
	}
	public void explodir() {
		massa = 0;
		diametro = 0;
	}
	public void ImprimirDados() {
		System.out.println("nome = " + nome + " massa = " + massa + " diametro = " + diametro);
	}
}
