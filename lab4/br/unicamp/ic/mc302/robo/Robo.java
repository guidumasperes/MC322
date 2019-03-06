package br.unicamp.ic.mc302.robo;

public class Robo {
	String cor;
	String lataria;
	Motor motor;
	Antena antena;
	Roda rodaEsq;
	Roda rodaDir;
	SensorTermico sensorTermico;
	SensorOtico sensorOtico;
	Giroscopio giroscopio;
	
	public Robo(String cor, String lat) {
		this.cor = cor;
		this.lataria = lat;
		motor = new Motor();
		antena = new Antena();
		rodaEsq = new Roda();
		rodaDir = new Roda();
		sensorTermico = new SensorTermico();
		sensorOtico = new SensorOtico();
		giroscopio = new Giroscopio();
	}
	
	public void ligar() {
		motor.ligar();
		giroscopio.ligar();
		antena.ligar();
	}
	
	public void desligar() {
		motor.desligar();
		giroscopio.desligar();
		antena.desligar();
	}
	
	public void andar() {
		motor.acelerar();
	}
	
	public void parar() {
		motor.desacelerar();
	}
	
	public void gravarVideo() {
		sensorOtico.ativar();
	}
	
	public void tiraFoto() {
		sensorOtico.ativarTemporariamente();
	}
	
	public void medeTemperatura() {
		sensorTermico.ativar();
	}
}
