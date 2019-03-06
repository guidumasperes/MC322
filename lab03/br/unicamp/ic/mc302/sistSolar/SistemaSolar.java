package br.unicamp.ic.mc302.sistSolar;
import br.unicamp.ic.mc302.corposCel.*;

public class SistemaSolar {

	public static void main(String[] args) {
		Estrela e = new Estrela(20, "Azul", "Delta", 1000, 500);
		Estrela sol = new Estrela(1000, "Amarelo", "Sol", 1300, 900);
		Planeta p = new Planeta(24, 0, "seco");
		Lua l = new Lua(5, 0);
		
		e.imprimirEstrela();
		e.ImprimirDados();
		sol.imprimirEstrela();
		sol.ImprimirDados();
		p.ImprimePlaneta();
		p.ImprimirDados();
		l.ImprimeLua();
		l.ImprimirDados();
		
		e.brilhar();
		l.mudarMesLunar();
		l.Colonizar();
		p.alterarClima(1);
		p.realizaRotacao();
	
		e.imprimirEstrela();
		p.ImprimePlaneta();
		l.ImprimeLua();
	}
}
