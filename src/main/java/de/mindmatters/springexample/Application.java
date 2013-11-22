package de.mindmatters.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import java.util.Arrays;

@Configuration
@ComponentScan
public class Application {

    @Bean(name = "annonymousClassMessageService")
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "annonymous class message";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        System.out.println("Bean definition names: " + Arrays.toString(context.getBeanDefinitionNames()));

        MessagePrinter printer = context.getBean(MessagePrinter.class);
        //MessagePrinter printer = new MessagePrinter(); // No DI
        printer.printMessage();
    }
}