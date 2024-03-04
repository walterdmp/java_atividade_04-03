package contasPagas;

public class Conta {
	private int idConta;
	private String dataVencimento;
	private String dataPagamento;
	private Produto pro;
	private Cliente cli;
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public Produto getPro() {
		return pro;
	}
	public void setPro(Produto pro) {
		this.pro = pro;
	}
	public Cliente getCli() {
		return cli;
	}
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	
	public void visualizarConta() {
		System.out.println("Identificador: " + getIdConta());
		System.out.println("Produto: " + pro.getDescricaoProduto());
		System.out.println("Cliente: " + cli.getNomeCliente() + " CPF: " + cli.getCpf());
		System.out.println("Valor: " + pro.getValorProduto());
		System.out.println("Data Vencimento: " + getDataVencimento());
		System.out.println("Data Pagamento: " + getDataPagamento());
	}
}
