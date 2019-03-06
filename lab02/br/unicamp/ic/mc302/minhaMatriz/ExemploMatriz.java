package br.unicamp.ic.mc302.minhaMatriz;

public class ExemploMatriz {

	public static void main(String[] args) {
		MinhaMatriz mat1 = new MinhaMatriz(2, 2);
		MinhaMatriz mat2 = new MinhaMatriz(2, 2);
		MinhaMatriz mat3;
		
		mat3 = mat1.Multiplica(mat2);
		
		mat1.Imprime();
		mat2.Imprime();
		mat3.Imprime();
	}

}
