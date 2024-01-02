
package primeiraclasse;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
          
		System.out.println("o produto que vc deseja compra e um notebook");
		System.out.print("preencha (sim)1 ou (nao) 2");


		Double sim1 = scanner.nextDouble();
		System.out.println("ok efetue o pagamento");
		
		System.out.print("Valor do produto os produtos valem 2000:");
		Double valorProduto = scanner.nextDouble();

		System.out.print("Quantidade do Produto so tem 15 no estoque: ");
		Integer quantidadeProduto = scanner.nextInt();
		
		
		Double subTotal = valorProduto * quantidadeProduto;
		System.out.print("digite sim para pagar(sim)2 ou (nao) 3");
		
		
		Double sim2 = scanner.nextDouble();
		System.out.println("o produto chegara em breve");
		
	}
	
	
}