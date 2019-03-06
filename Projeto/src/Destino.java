
public class Destino {
	private String nome;
	private Onibus o;
	private String sit;
	
	public Destino(String nome) {
		sit = "aberto";
		this.nome = nome;
		o = new Onibus();
	}
	
	public void imprime() {
		System.out.println(nome);
		o.imprime();
	}
	
	public boolean reserva(int hor, char fil, int col) {
		if(sit == "fechado") {
			return false;
		} else {
			return o.reserva(hor, fil, col);
		}
	}
	
	public void verificaAssentos(int hor) {
		o.verificaAssentos(hor);
	}
	
	public boolean verificaSit() {
		if(o.verificaSit() == true) {
			sit = "fechado";
			return true;
		}
		return false;
	}
	
	public void mudaSitBus(int num, int dest) {
		o.mudaSit(num, dest);
	}
	
	public void imprime(int hor) {
		o.imprime(hor);
	}
	
	public boolean checaHor(int hor) {
		if (o.checaHor(hor) == false) {
			return false;
		} else {
			return true;
		}
	}
}