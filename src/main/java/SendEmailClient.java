public class SendEmailClient {

    public static void main(String[] args) {
        String msg = "This is DI";
        String rec = "Parsa";
        MessageServiceInjector injector = null;

        //send email
        injector = new EmailServiceInjector();
        injector.getConsumer().proccessMessage(msg, rec);
    }
}
