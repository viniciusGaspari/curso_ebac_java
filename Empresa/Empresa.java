package Empresa;

public class Empresa {
	
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String nome1(String nome) {
		this.nome = nome;
		System.out.printf("Nome do colaborador é %s", this.nome);
		return nome;
	}
	
	private double salario;
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double salario1 (double salario) {
		this.salario = salario;
		System.out.printf("Salário do %s é $%.2f", this.nome, this.salario);
		return salario;
	}

	
}
