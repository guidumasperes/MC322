package br.unicamp.ic.mc302.oficina;

public class FilaServico {
	private Servico servs[];
	private boolean vazia = true;
	private int ultimaPosicao = 0;
	
	public FilaServico() {
		servs = new Servico[5];
	}
	
	public boolean Vazia() {
		return vazia;
	}
	
	public void adicionaServico(String tipo) {
		if (ultimaPosicao <= 5) {
			if (tipo.equalsIgnoreCase("Tipo1")) {
				servs[ultimaPosicao] = new Tipo1(tipo);
			} else {
				if (tipo.equals("Tipo2")) {
					servs[ultimaPosicao] = new Tipo2(tipo);
				} else {
					if (tipo.equals("Tipo3")) {
						servs[ultimaPosicao] = new Tipo3(tipo);
					} else {
						System.out.println("A Fila contém apenas Tipo1, Tipo2 ou Tipo3\n");
					}
				}
			}
		} else {
			System.out.println("O veiculo não poderá ser adicionado, pois a fila está cheia");
		}
		ultimaPosicao++;
		vazia = false;
	}
	
	public void calcServico() {
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		for (int i = 0; i < ultimaPosicao; i++) {
			if("Tipo1" == servs[i].tipoServ()) {
				cnt1 = cnt1 + 1;
			} else if("Tipo2" == servs[i].tipoServ()) {
				cnt2 = cnt2 + 1;
			} else {
				cnt3 = cnt3 + 1;
			}
		}
		System.out.println("O funcionario executou: " + cnt1 + " o servico do Tipo1, " + cnt2 + " o servico do Tipo2 e " + cnt3 + " o servico do Tipo3");
	}
	
	public int pagamento() {
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		for (int i = 0; i < ultimaPosicao; i++) {
			if("Tipo1" == servs[i].tipoServ()) {
				cnt1 = cnt1 + 1;
			} else if("Tipo2" == servs[i].tipoServ()) {
				cnt2 = cnt2 + 1;
			} else {
				cnt3 = cnt3 + 1;
			}
		}
		return ((15 * cnt1) + (50 * cnt2) + (40 * cnt3));
	}
}
