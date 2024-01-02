package primeiraclasse;

public class classe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
					pedido pedido = new pedido();
					
					pedido.setCodigo(1);
					pedido.setSubtotal(50.0);
					pedido.setDesconto(10.0);
					
					System.out.println("Pedido de codigo: " 
							+ pedido.getCodigo() 
							+ "\nSubtotal: " + pedido.getSubtotal() 
							+ "\nDesconto: " + pedido.getDesconto() 
							+ "\nTotal: " + pedido.getTotal());

				}

			

	}


