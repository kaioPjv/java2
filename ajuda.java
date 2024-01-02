import java.util.Scanner;


public class ajuda {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		
		int x;
		
		System.out.println("entre com seu nome");
		
		nome = ler.nextLine();
		
		System.out.println("ola " + nome);
		
		
		x = ler.nextInt();
		
		int dobro = x*2;
		
		System.out.println(" o dobro de x" + dobro);
	}
	
	
}