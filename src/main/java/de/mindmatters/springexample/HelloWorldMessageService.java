package de.mindmatters.springexample;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessageService implements MessageService {

    public String getMessage() {
        return "Hello World!";
    }
}
