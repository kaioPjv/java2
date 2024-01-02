package primeiraclasse;

public class Pedid {
	
	static void impressao(String texto) {
		System.out.println(texto);
	}

	public static void main(String[] args) {
		

		Pedid pedid = new Pedid();
		pedid.codigo = 102;
		pedid.subtotal = 300.0;
		pedid.desconto = 20 * (pedid.subtotal/100);
		//pedido.total = pedido.getSubtotal()-pedido.getDesconto();
		
		impressao("Numero do código: " + pedid.getCodigo());
		impressao("Numero do subtotal: " + pedid.getSubtotal());
		impressao("Numero do desconto: " + pedid.getDesconto());
		impressao("Numero do total: " + pedid.getTotal());
	}

}
