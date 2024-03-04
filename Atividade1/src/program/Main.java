package program;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Fiodor");
		f1.setSalario(100);
		f1.bonifica(50);
		
		System.out.println("Salário Atual: " + f1.getSalario());
		
		f1.mostra();
	}

}
