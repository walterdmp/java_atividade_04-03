package casa;

public class Casa {
	private String cor;
	private Porta porta1;
	private Porta porta2;
	private Porta porta3;
	
	public String getCor() {
		return cor;
	}
	public void pinta(String cor) {
		this.cor = cor;
	}
	public Porta getPorta1() {
		return porta1;
	}
	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}
	public Porta getPorta2() {
		return porta2;
	}
	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}
	public Porta getPorta3() {
		return porta3;
	}
	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}
	
	public int quantasPortasEstaoAbertas() {
		int abert = 0;
		if(porta1.estaAberta() == true) {
			abert++;
		}
		if(porta2.estaAberta() == true) {
			abert++;
		}
		if(porta3.estaAberta() == true) {
			abert++;
		}
		return abert;
	}
}
