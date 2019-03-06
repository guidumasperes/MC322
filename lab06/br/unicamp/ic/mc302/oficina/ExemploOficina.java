package br.unicamp.ic.mc302.oficina;

import java.util.Scanner;

public class ExemploOficina {

	public static void main(String[] args) {
		FilaFuncionario fila;
		fila = new FilaFuncionario();
		
		fila.adicionaFuncionario("FuncComum", "Seyi");
		fila.adicionaFuncionario("FuncComum", "Igor");
		fila.adicionaFuncionario("FuncComum", "Gabriel");
		fila.adicionaFuncionario("FuncComum", "Leonardo");
		fila.adicionaFuncionario("FuncComum", "Joao");
		fila.adicionaFuncionario("FuncComum", "Bruno");
		fila.adicionaFuncionario("FuncComum", "Adriano");
		fila.adicionaFuncionario("Gerente", "Guilherme");
		fila.adicionaFuncionario("FuncComum", "Lucas");
		fila.adicionaFuncionario("FuncComum", "Vitor");
		
		Scanner entrada = new Scanner(System.in);
		int index = entrada.nextInt();
		
		fila.infFunc(index-1);
		System.out.println();
		fila.folhaPagamento();
	}

}
