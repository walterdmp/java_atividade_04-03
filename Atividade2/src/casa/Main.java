package casa;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Yara");
		pessoa.setIdade(25);
		
		pessoa.fazAniver();
		pessoa.fazAniver();
		
		System.out.println("Idade: " + pessoa.getIdade());
		
		Porta porta = new Porta();
		
		porta.abre();
		porta.fecha();
		porta.pinta("Verde");
		porta.pinta("Vermelha");
		porta.pinta("Rosa");
		porta.setDimensaoX(10);
		porta.setDimensaoY(5);
		porta.setDimensaoZ(2);
		porta.estaAberta();
		porta.mostra();
		
		Casa casa = new Casa();
		
		casa.pinta("Vermelho");
		
		Porta novaPorta1 = new Porta();
		Porta novaPorta2 = new Porta();
		Porta novaPorta3 = new Porta();
		
		casa.setPorta1(novaPorta1);
		casa.setPorta2(novaPorta2);
		casa.setPorta3(novaPorta3);
		
		novaPorta1.abre();
		novaPorta2.fecha();
		novaPorta3.abre();
		
		System.out.println(casa.quantasPortasEstaoAbertas());
		
		
	}
}
