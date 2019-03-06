import java.util.Scanner;

public class TerminalReservas {
	private Controlador c;
	private String hora = "05:00";
	
	public TerminalReservas() {
		c = new Controlador();
	}
	
	public void iniOp() {
		Scanner entrada = new Scanner(System.in);
		int op = 8;
		int num = 0;
		
		while(op != 9) {
			System.out.println("Digite 1 para mostrar os destinos e onibus disponiveis");
			System.out.println("Digite 2 para efetuar reserva:");
			System.out.println("Digite 3 para  mudar o horario:");
			System.out.println("Horario atual ---> " + hora);
			op = entrada.nextInt();
			switch (op) {
			case 1:
				c.mostrarDestino(1);
				c.mostrarDestino(2);
				c.mostrarDestino(3);/*Apenas coloca na tela os destinos, os horarios e os tipos de onibus disponiveis*/
				break;
			case 2:
				System.out.println("Digite o numero do destino:");
				int nd = entrada.nextInt();
				c.mostrarDestino(nd);
				if(c.checaDest(nd) == false) {
					System.out.println("Digite o numero do horario:");
					int hr = entrada.nextInt();
					if(c.checaHor(hr, nd) == false) {
						System.out.println("Digite a fileira:");
						char fil = entrada.next().charAt(0);
						System.out.println("Digite a coluna:");
						int col = entrada.nextInt();
						if(c.efetuarReserva(nd, hr-1, fil, col) == false) {
							System.out.println("Assento ocupado! Tente outro");
							c.mostrarOnibus(nd, hr-1);
						} else {
							System.out.println("Reserva efetuada com sucesso!");
							c.mostrarOnibus(nd, hr-1);
							break;
						}
					} else {
						System.out.println("Horario fechado! Tente outro");
					}
				} else {
					System.out.println("Destino lotado! Tente outro");
				}
				break;
			case 3:
				num = num + 1;
				hora = c.mudaHorario(num);
				c.fechaHorario(num);
;				break;
			}
		}
	}
	
	public void simularCasos() {
		char var;
		var = 'A';
		c.efetuarReserva(1, 0, var, 5);
		var = 'A';
		c.efetuarReserva(1, 0, var, 9);
		var = 'B';
		c.efetuarReserva(1, 0, var, 5);
		var = 'A';
		c.efetuarReserva(1, 0, var, 1);
		var = 'B';
		c.efetuarReserva(1, 0, var, 9);
		var = 'D';
		c.efetuarReserva(1, 0, var, 3);
		var = 'A';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(1, 1, var, i+1);
		}
		var = 'B';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(1, 1, var, i+1);
		}
		var = 'C';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(1, 1, var, i+1);
		}
		var = 'D';
		for(int i = 0; i < 9; i++) {
			c.efetuarReserva(1, 1, var, i+1);
		}
		var = 'B';
		c.efetuarReserva(1, 2, var, 1);
		var = 'A';
		c.efetuarReserva(1, 2, var, 2);
		var = 'D';
		c.efetuarReserva(1, 2, var, 4);
		var = 'A';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(2, 1, var, i+1);
		}
		var = 'B';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(2, 1, var, i+1);
		}
		var = 'C';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(2, 1, var, i+1);
		}
		var = 'D';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(2, 1, var, i+1);
		}
		var = 'A';
		for(int i = 0; i < 5; i++) {
			c.efetuarReserva(2, 2, var, i+1);
		}
		var = 'B';
		for(int i = 0; i < 5; i++) {
			c.efetuarReserva(2, 2, var, i+1);
		}
		var = 'C';
		for(int i = 0; i < 5; i++) {
			c.efetuarReserva(2, 2, var, i+1);
		}
		var = 'D';
		for(int i = 0; i < 5; i++) {
			c.efetuarReserva(2, 2, var, i+1);
		}
		var = 'A';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(2, 0, var, i+1);
		}
		var = 'B';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(2, 0, var, i+1);
		}
		var = 'C';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(2, 0, var, i+1);
		}
		var = 'D';
		for(int i = 0; i < 9; i++) {
			c.efetuarReserva(2, 0, var, i+1);
		}
		var = 'A';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(3, 0, var, i+1);
		}
		var = 'B';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(3, 0, var, i+1);
		}
		var = 'C';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(3, 0, var, i+1);
		}
		var = 'D';
		for(int i = 0; i < 10; i++) {
			c.efetuarReserva(3, 0, var, i+1);
		}
	}
}
