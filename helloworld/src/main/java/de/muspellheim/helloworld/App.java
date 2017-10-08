package de.muspellheim.helloworld;

import de.muspellheim.messageservice.*;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Optional<MessageService> messageService = ServiceLoader.load(MessageService.class).findFirst();
        messageService.ifPresentOrElse(
                s -> s.send("Hello World!"),
                () -> System.out.println("No message service available.")
        );
    }

}
