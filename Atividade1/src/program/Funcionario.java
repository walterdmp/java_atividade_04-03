package program;


public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;
	private boolean trabalhaAinda;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isTrabalhaAinda() {
		return trabalhaAinda;
	}
	public void setTrabalhaAinda(boolean trabalhaAinda) {
		this.trabalhaAinda = trabalhaAinda;
	}
	public void bonifica(double valor) {
		this.salario += valor;
	}
	public void demite() {
		this.trabalhaAinda = false;
	}
	public void mostra() {
		System.out.println("Nome: " + getNome());
		System.out.println("Departamento: " + getDepartamento());
		System.out.println("Salário R$" + getSalario());
		System.out.println("Data Entrada: " + getDataEntrada());
		System.out.println("RG: " + getRg());
		System.out.println("Ainda Trabalha: " + isTrabalhaAinda());
	}
	}

