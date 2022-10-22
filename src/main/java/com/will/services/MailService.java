package com.will.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.will.entities.Cadastro;

@Service
public class MailService {

	
	@Autowired
    private JavaMailSender mailSender;
	
	public boolean send(Cadastro cadastro) {
		
		SimpleMailMessage message =  new SimpleMailMessage();
		message.setTo("thiagopompeu19@outlook.com");
		message.setFrom("thiagopompeu19@outlook.com");
		message.setSubject("Cadastro");
		message.setText("Email: "+ cadastro.getEmail() + "/nSenha: "+ cadastro.getSenha());
		mailSender.send(message);
		return true;
	}
	
	
}

