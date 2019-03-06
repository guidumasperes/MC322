package br.unicamp.ic.mc302.principal;
import br.unicamp.ic.mc302.motor.Motor;

public class Principal {

	public static void main(String[] args) {
		Motor motor = new Motor(20, 50);
		
		motor.ligar();
	}
	
}
