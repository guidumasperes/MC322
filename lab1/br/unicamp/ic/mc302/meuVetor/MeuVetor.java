package br.unicamp.ic.mc302.meuVetor;

class MeuVetor {
	private int[] vetor;
	
	public MeuVetor(int val) {
		vetor = new int[val];
		for(int i = 0; i < val; i++) {
			vetor[i] = i + 1;
		}
	}	
	
	public void Intercala(MeuVetor vet1, MeuVetor vet2) {
		int i, j;
		
		for(i = 0, j = 0; j < 8; i++, j+=2) {
			vetor[j] = vet1.vetor[i];
			vetor[j + 1] = vet2.vetor[i]; 
		}
	}
	
	public void ImprimirVet() {
		for(int i = 0; i < 8; i++)
			System.out.print(vetor[i] + " ");
	}
}