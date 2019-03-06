package br.unicamp.ic.mc302.corposCel;
import br.unicamp.ic.mc302.sistSolar.*;

public class Estrela extends CorpoCeleste {
	private int intensidadeDeLuz;
	private String tipo;
	
	public Estrela(int intLuz, String tip, String nome, double mass, double dim) {
		super(nome);
		intensidadeDeLuz = intLuz;
		tipo = tip;
		massa = mass;
		diametro = dim;
	}
	public void brilhar() {
		intensidadeDeLuz = intensidadeDeLuz + 1;
	}
	public void imprimirEstrela() {
		System.out.println("intensidadeDeLuz = " + intensidadeDeLuz + " tipo = " + tipo);
	}
}