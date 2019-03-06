package br.unicamp.ic.mc302.sistPlanetario;

public class MainSistemaSolar {

	public static void main(String[] args) {
		SistemaPlanetario solar = new SistemaPlanetario("Solar", "Sol");
		
		solar.criarPlaneta("Mercurio");
		solar.criarPlaneta("Venus");
		solar.criarPlaneta("Terra");
		solar.criarPlaneta("Marte");
		solar.criarPlaneta("Jupiter");
		solar.criarPlaneta("Saturno");
		solar.criarPlaneta("Urano");
		solar.criarPlaneta("Netuno");
		solar.imprime();
		
		solar.destruirPlaneta("Terra");
		solar.destruirPlaneta("Netuno");
		solar.imprime();
	}
	
}
