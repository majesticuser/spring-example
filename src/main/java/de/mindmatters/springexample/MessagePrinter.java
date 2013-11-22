package de.mindmatters.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class MessagePrinter {

    @Autowired
    @Qualifier("goodbyeWorldMessageService")
    //@Qualifier("annonymousClassMessageService")
    private MessageService service;

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
