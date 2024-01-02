package listatarefas;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

import enviargmail.EmailException;

public class EnvioDeMensagem {

	static void enviar (String para, String assunto, String msg ) throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.office365.com");
		email.setSmtpPort(587);
		email.setAuthenticator(newDefaultAuthenticator("username","password" ));
		email.setFrom("username");
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para);
		email.setStartTLSEnabled(true);
		email.send();	
	}