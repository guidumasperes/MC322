package br.unicamp.ic.mc302.motor;

public class Motor {
	private Bateria bat;
	private Injetor inj;
	private VelaDeIgnicao vela;
	
	public Motor(int carga, int qtdCombustivel) {
		bat = new Bateria(carga);
		inj = new Injetor(qtdCombustivel);
		vela = new VelaDeIgnicao();
	}
	
	public void ligar() {
		if(bat.verificar()) {
			inj.injetar();
			vela.ignicao(bat.getCarga());
		}
	}
	
}
