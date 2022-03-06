package com.example.gestionPost.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
@AllArgsConstructor
public class MailContentBuilder {

    private  final TemplateEngine templateEngine;

    String builder(String message)
    {
        Context context= new Context();
        context.setVariable("message", message);
        return  templateEngine.process("mailTemplate", context);
    }
}
