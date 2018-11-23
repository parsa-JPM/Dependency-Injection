public class EmailServiceInjector implements MessageServiceInjector {
    public Consumer getConsumer() {
        return new EmailConsumer(new EmailService());
    }
}
