package hambugueriaDaiane;

public class Teste {

	public static void main(String[] args) {
		User Generico = new User("Generico", "Casa do Generico", "000.000.000-00" );
		
		Sanduiche Baianinho = new Baianinho();
		Sanduiche Candango = new Candango();
		Sanduiche Goiano = new Goiano();
		
		Pedido pedido01 = new Pedido();
		
		pedido01.addPedido(Goiano);
		pedido01.addPedido(Baianinho);
		
		Pedido pedido02 = new Pedido();
		
		pedido02.addPedido(Goiano);
		pedido02.addPedido(Candango);
		
		NotaFiscal notaPedido02 = new NotaFiscal(pedido01, Generico);
		NotaFiscal notaPedido01 = new NotaFiscal(pedido02, Generico);
		
		
	}

}
