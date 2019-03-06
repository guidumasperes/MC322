package br.unicamp.ic.mc302.meuVetor;

class Principal {
	
	public static void main(String[] args) {
		MeuVetor vetor1 = new MeuVetor(4);
		MeuVetor vetor2 = new MeuVetor(4);
		MeuVetor vetor_intercalado = new MeuVetor(8);
		
		vetor_intercalado.Intercala(vetor1, vetor2);
		vetor_intercalado.ImprimirVet();
	}
}