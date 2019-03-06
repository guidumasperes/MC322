package br.unicamp.ic.mc302.sistPlanetario;

import java.util.ArrayList;

class SistemaPlanetario {
	private ArrayList<String> planetas;
	private String nome;
	private String estrelaOrbitada;
	
	public SistemaPlanetario(String nom, String estrOrb) {
		nome = nom;
		estrelaOrbitada = estrOrb;
		planetas = new ArrayList<String>();
	}
	public void criarPlaneta(String nom) {
		planetas.add(nom);
	}
	public void destruirPlaneta(String nom) {
		planetas.remove(nom);
	}
	public void imprime() {
		System.out.println("Nome do sistema = " + nome);
		System.out.println("Estrela orbitada = " + estrelaOrbitada);
		System.out.println(planetas);
	}
}
