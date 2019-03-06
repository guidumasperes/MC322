package br.unicamp.ic.mc302.oficina;

public class Funcionario {
	private String nome;
	private String tipo;
	private double salario;
	private double comissao;
	
	public Funcionario(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
		salario = 0;
		comissao = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void informaTipo() {
		System.out.println("Este funcionario e: " + tipo);
	}
	
	public void informaServico() {
		
	}
	
	public void setSalCom(double sal, double com) {
		salario = sal;
		comissao = com;
	}
	
	public void pagamento() {
		System.out.println("O funcionario: " + nome + " do tipo " + tipo + " vai receber " + comissao + " de comissao e " + salario + " no mes");
	}
}
