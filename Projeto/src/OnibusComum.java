
public class OnibusComum {
	private int[][] lugares = new int[4][10];
	private String hora;
	private String sit;
	
	public OnibusComum(String hora) {
		this.hora = hora;
		sit = "aberto";
	}
	
	public void imprime(int num) {
		System.out.println("horario "+ num +": " + hora);
		for(int i = 0; i < 4; i++) {
			if(i == 0) {
				System.out.print("D ");
			} else if(i == 1) {
				System.out.print("C ");
			} else if(i == 2) {
				System.out.print("B ");
			} else if(i == 3) {
				System.out.print("A ");
			}
			for(int j = 0; j < 10; j++) {
				if(lugares[i][j] == 0)
					System.out.print(" 0 ");
				if(lugares[i][j] == 1)
					System.out.print(" * ");
			}
			System.out.println(" ");
		}
		System.out.println("   1  2  3  4  5  6  7  8  9  10 ");
	}
	
	public boolean reserva(char fil, int coluna) {
		if(sit == "fechado")
			return false;
		if(fil == 'A') {
			if(lugares[3][coluna-1] == 0) {
				lugares[3][coluna-1] = 1;
				return true;		
			} else {
				return false;
			}
		} else if(fil == 'B') {
			if(lugares[2][coluna-1] == 0) {
				lugares[2][coluna-1] = 1;
				return true;		
			} else {
				return false;
			}
		} else if(fil == 'C') {
			if(lugares[1][coluna-1] == 0) {
				lugares[1][coluna-1] = 1;
				return true;		
			} else {
				return false;
			}
		} else if(fil == 'D') {
			if(lugares[0][coluna-1] == 0) {
				lugares[0][coluna-1] = 1;
				return true;		
			} else {
				return false;
			}
		}
		return true;
	}
	
	public int verificaAssentos() {
		int cnt = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 10; j++) {
				if(lugares[i][j] == 1)
					cnt = cnt + 1;
			}
		}
		if(cnt == 40)
			sit = "fechado";
		return cnt;
	}
	
	public boolean verificaSit() {
		if(sit == "fechado") {
			return true;
		} else { 
			return false;
		}
	}
	
	public void mudaSit() {
		sit = "fechado";
	}
}