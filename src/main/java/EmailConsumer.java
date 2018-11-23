public class EmailConsumer implements Consumer {
    private MessageService service;

    EmailConsumer(MessageService service) {
        this.service = service;
    }

    public void proccessMessage(String msg, String rec) {
        this.service.sendMessage(rec, msg);
    }
}
