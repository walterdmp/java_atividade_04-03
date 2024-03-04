package contasPagas;

public class Programa {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente();
		
		cli1.setNomeCliente("Yara");
		cli2.setNomeCliente("Walter");
		cli1.setCpf("0123456789");
		cli2.setCpf("9876543210");
		
		Produto prod1 = new Produto();
		Produto prod2 = new Produto();
		prod1.setDescricaoProduto("TV");
		prod2.setDescricaoProduto("Celular");
		prod1.setValorProduto(1000);
		prod2.setValorProduto(1750);
		
		Conta cont1 = new Conta();
		Conta cont2 = new Conta();
		
		cont1.setCli(cli1);
		cont2.setCli(cli2);
		cont1.setPro(prod1);
		cont2.setPro(prod2);
		cont1.setIdConta(1);
		cont2.setIdConta(2);
		cont1.setDataVencimento("15/03/2024");
		cont2.setDataVencimento("06/03/2024");
		cont1.setDataPagamento("03/03/2024");
		cont2.setDataPagamento("05/03/2024");
		
		cont1.visualizarConta();
		cont2.visualizarConta();
		
		
		

	}

}
