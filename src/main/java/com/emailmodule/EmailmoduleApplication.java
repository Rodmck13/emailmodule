package com.emailmodule;

import com.emailmodule.service.emailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailmoduleApplication {

	@Autowired
	private emailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailmoduleApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail(){
		senderService.sendEmail("emailsendermodule@gmail.com", "Primera prueba", "Hola");
	}

}
