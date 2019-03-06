public class CadastroContas {
	// Atributos
	private ContaCor c[]; // vetor de contas

	// Operacoes

	public CadastroContas() { // metodo construtor
		c = new ContaCor[4];
		c[1] = new ContaCor("Ursula", 500, 1, 1);
		System.out.println("Criada conta 1 senha 1 com 500,00");
		c[2] = new ContaCor("Mia", 500, 2, 2);
		System.out.println("Criada conta 2 senha 2 com 500,00");
		c[3] = new ContaCor("Alfredo", 500, 3, 3);
		System.out.println("Criada conta 3 senha 3 com 500,00");
	}

	public ContaCor buscarConta(int numcta) {
		if (numcta < 1 || numcta > 3) // apenas 3 contas no BD
			return (null);
		else
			return (c[numcta]);
	}

}