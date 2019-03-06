package br.unicamp.ic.mc302.contaCor;

public class ExemploDoisConstrutores {
    /*Nesse exemplo temos a dois polimorfismos o de sobrecarga
      e o de coercao*/
	public static void main(String[] args) {
		int saldoInicialChico = 0; /*float*/
		byte numeroChico = 30; /*int*/
		byte senhaChico = 99;  /*int*/

		int saldoInicialChico1 = 1; /*double*/
		byte numeroChico1 = 30; /*int*/
		byte senhaChico1 = 99; /*int*/
		
		ContaCor cc1 = new ContaCor("Chico", saldoInicialChico, numeroChico, senhaChico);
		ContaCor cc2 = new ContaCor("Chico", saldoInicialChico1, numeroChico1, senhaChico1);
		
		cc1.imprime();
		System.out.println();
		cc2.imprime();
	}

}
