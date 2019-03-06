package br.unicamp.ic.mc302.corposCel;
import br.unicamp.ic.mc302.sistSolar.*;

public class Lua extends CorpoCeleste {
	private int numeroMesesLunares;
	private int numeroEclipses;
	private boolean colonizada;
	
	public Lua(int numMesLun, int numEclipse) {
		super("Omega");
		numeroMesesLunares = numMesLun;
		numeroEclipses = numEclipse;
		colonizada = false;
		massa = 10000;
		diametro = 700;
	}
	public void realizarEclipse() {
		numeroEclipses = numeroEclipses + 1;
	}
	public void mudarMesLunar() {
		numeroMesesLunares = numeroMesesLunares + 1;
	}
	public void Colonizar() {
		colonizada = true;
		massa = massa + 1;
	}
	public void ImprimeLua() {
		System.out.println("numeroMesesLunares = " + numeroMesesLunares + " numeroEclipses = " + numeroEclipses + " colonizada = " + colonizada);
	}
}
