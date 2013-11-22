package de.mindmatters.springexample;

import org.springframework.stereotype.Component;

@Component
public class GoodbyeWorldMessageService implements MessageService {

    public String getMessage() {
        return "Goodbye World!";
    }

}
