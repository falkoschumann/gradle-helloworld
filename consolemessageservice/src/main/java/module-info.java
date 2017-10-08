module de.muspellheim.consolemessageservice {
    requires de.muspellheim.messageservice;
    provides de.muspellheim.messageservice.MessageService with de.muspellheim.consolemessageservice.ConsoleMessageService;
}
