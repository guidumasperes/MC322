
public class Controlador {
	private Destino[] d = new Destino[3];
	
	public Controlador() {
		d[0] = new Destino("destino1");
		d[1] = new Destino("destino2");
		d[2] = new Destino("destino3");
	}
	
	public boolean efetuarReserva(int dest, int hor, char fil, int col) {
		if(d[dest - 1].reserva(hor, fil, col) == false) {
			return false;
		} else {
			d[dest - 1].verificaAssentos(hor); /*Vai verificar se o onibus esta cheio*/
			d[dest - 1].verificaSit();
			return true;
		}
	}
	
	public void mostrarOnibus(int dest, int hor) {
		d[dest - 1].imprime(hor);
	}
	
	public void mostrarDestino(int dest) {
		d[dest - 1].imprime();
	}
	
	public boolean checaDest(int dest) {
		return d[dest - 1].verificaSit();
	}
	
	public String mudaHorario(int num) {
		if(num == 1) {
			return "06:30";
		} else if(num == 2) {
			return "12:30";
		} else {
			return "18:30";
		}
	}
	
	public void fechaHorario(int num) {
		d[0].mudaSitBus(num, 1);
		d[1].mudaSitBus(num, 2);
		d[2].mudaSitBus(num, 3);
	}
	
	public boolean checaHor(int hor, int dest) {
		if(d[dest - 1].checaHor(hor) == false) {
			return false;
		} else {
			return true;
		}
	}
}
