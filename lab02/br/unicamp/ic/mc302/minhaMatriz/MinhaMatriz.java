package br.unicamp.ic.mc302.minhaMatriz;

public class MinhaMatriz {
	private int lin;
	private int col;
	private int[][] dados;
	
	public MinhaMatriz(int l, int c) {
		lin = l;
		col = c;
		dados = new int[l][c];
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				dados[i][j] = (i+1)*(j+2);
			}
		}
	}
	
	public MinhaMatriz(int n) {
		lin = n;
		col = n;
		dados = new int[n][n];
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				dados[i][j] = 0;
			}
		}
	}
	
	public MinhaMatriz Multiplica(MinhaMatriz matriz) {
		MinhaMatriz resultado = new MinhaMatriz(matriz.lin);
		for(int i = 0; i < matriz.lin; i++) {
			for(int j = 0; j < matriz.col; j++) {
				for(int k = 0; k < matriz.lin; k++) {
					resultado.dados[i][j] = resultado.dados[i][j] + (dados[i][k] * matriz.dados[k][j]);
				}
			}
		}
		return resultado;
	}
	
	public void Imprime() {
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) { 
				System.out.print(dados[i][j] + " ");
            }
			System.out.println();
        }
	}
}