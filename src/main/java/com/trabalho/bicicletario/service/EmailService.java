package com.trabalho.bicicletario.service;

import com.trabalho.bicicletario.dto.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender enviarEmail;

    @Value("${spring.mail.username}")
    private String remetente;

    public String enviarEmail(EmailDTO emailDTO){
        try {
            SimpleMailMessage email = new SimpleMailMessage();
            email.setFrom(remetente);
            email.setTo(emailDTO.getEmail());
            email.setSubject(emailDTO.getAssunto());
            email.setText(emailDTO.getMensagem());

            enviarEmail.send(email);
            return "Email enviado com sucesso!";
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
