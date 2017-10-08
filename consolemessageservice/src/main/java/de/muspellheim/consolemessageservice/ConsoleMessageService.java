package de.muspellheim.consolemessageservice;

import de.muspellheim.messageservice.*;

public class ConsoleMessageService implements MessageService {

    public void send(String message) {
        System.out.println(message);
    }

}
