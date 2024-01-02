package enviargmail;

import java.awt.AWTException;

public class carteiro {

	public static void main(String[] args) throws AWTException {
		enviargmail.enviar("alexandre.afonso@algaworks.com",
				"Envio de email com commons email", 
				"Se estiver vendo esse email é porque o nosso envio funcionou!");
		
		System.out.println("Fim...");
	}

}


