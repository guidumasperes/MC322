
public class Onibus {
	private OnibusComum[] oCom = new OnibusComum[2];
	private OnibusOvernight oOver;
	
	public Onibus() {
		oCom[0] = new OnibusComum("06:00");
		oCom[1] = new OnibusComum("12:00");
		oOver = new OnibusOvernight("18:00");	
	}
	
	public void imprime() {
		System.out.println("Onibus Comum");
		oCom[0].imprime(1);
		System.out.println("Onibus Comum ");
		oCom[1].imprime(2);
		System.out.println("Onibus Overnight");
		oOver.imprime(3);
	}
	
	public boolean reserva(int hor, char fil, int col) {
		if(hor < 2) {
			if(oCom[hor].reserva(fil, col) == false) {
				return false;
			} else {
				return true;
			}
		} else {
			if(oOver.reserva(fil, col) == false ) {
				return false;
			} else {
				return true;
			}	
		}
	}
	
	public void imprime(int hor) {
		if(hor < 2) {
			oCom[hor].imprime(hor);
		} else {
			oOver.imprime(3);
		}
	}
	
	public void verificaAssentos(int hor) {
		if(hor < 2) {
			oCom[hor].verificaAssentos();
		} else {
			oOver.verificaAssentos();
		}
	}
	
	public boolean verificaSit() {
		if(oCom[0].verificaSit() == true && oCom[1].verificaSit() == true && oOver.verificaSit() == true) {
			return true;
		}
		return false;
	}
	
	public void mudaSit(int num, int dest) {
		if(num == 1) {
			oCom[0].mudaSit();
			if(oCom[0].verificaAssentos() == 40)
				System.out.println("O onibus das 06:00hs do destino " + dest + " partiu cheio");
		} else if(num == 2) {
			oCom[1].mudaSit();
			if(oCom[1].verificaAssentos() == 40)
				System.out.println("O onibus das 12:00hs do destino " + dest + " partiu cheio");
		} else {
			oOver.mudaSit();
			if(oOver.verificaAssentos() == 20)
				System.out.println("O onibus das 06:00hs do destino " + dest + " partiu cheio");
		}
	}
	
	public boolean checaHor(int hor) {
		if(hor == 1) {
			return oCom[0].verificaSit();
		} else if(hor == 2) {
			return oCom[1].verificaSit();
		} else {
			return oOver.verificaSit();		
		}
	}
}
