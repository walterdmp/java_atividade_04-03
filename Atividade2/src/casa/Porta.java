package casa;

public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	public boolean estaAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	public String getCor() {
		return cor;
	}
	public void pinta(String cor) {
		this.cor = cor;
	}
	public double getDimensaoX() {
		return dimensaoX;
	}
	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	public double getDimensaoY() {
		return dimensaoY;
	}
	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	public double getDimensaoZ() {
		return dimensaoZ;
	}
	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	
	public void abre() {
		setAberta(true);
	}
	public void fecha() {
		setAberta(false);
	}
	
	public void mostra() {
		System.out.println("Está aberta: " + estaAberta());
		System.out.println("Cor: " + getCor());
		System.out.println("Dimensão X" + getDimensaoX());
		System.out.println("Dimensão X" + getDimensaoY());
		System.out.println("Dimensão X" + getDimensaoZ());
	}
	
}
