package pedidosdevendas;

public class pedidodevendas {


		
			
		Integer produto;
		Double subtotal;
		Double desconto;
		
		
		
		Integer getCodigo() {
			return produto;
		}
		void setCodigo(Integer codigo) {
			this.produto = codigo;
		}
		Double getSubtotal() {
			return subtotal;
		}
		void setSubtotal(Double subtotal) {
			this.subtotal = subtotal;
		}
		Double getDesconto() {
			return desconto;
		}
		void setDesconto(Double desconto) {
			this.desconto = desconto;
		}
		Double getTotal() {
			return (this.subtotal-this.desconto);
		}
		void setTotal(Double total) {
			
		}
		
		
		
		
	}
	 


