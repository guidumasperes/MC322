package br.unicamp.ic.mc302.corposCel;
import br.unicamp.ic.mc302.sistSolar.*;

public class Planeta extends CorpoCeleste {
	private int duracaoDia;
	private int numeroDeAnos;
	private String atmosfera;
	
	public Planeta(int durDia, int NumAnos, String atm) {
		super("Terra");
		duracaoDia = durDia;
		numeroDeAnos = NumAnos;
		atmosfera = atm;
		massa = 41300000;
		diametro = 486590;
	}
	public void realizarTranslacao() {
		numeroDeAnos = numeroDeAnos + 1;
	}
	public void realizaRotacao() {
		duracaoDia = duracaoDia - 1;
	}
	public void alterarClima(int tipo) {
		if(tipo == 1)
			atmosfera = "chuvosa";
		else
			atmosfera = "seca";
	}
	public void ImprimePlaneta() {
		System.out.println("duracaoDia = " + duracaoDia + " NumeroDeAnos = " + numeroDeAnos + " atmosfera = " + atmosfera);
	}
}
