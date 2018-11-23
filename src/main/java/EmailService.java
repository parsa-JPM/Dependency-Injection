public class EmailService implements MessageService {

    public void sendMessage(String receiver, String message) {
        //logic to send email
        System.out.println("Email to : " + receiver + " with this message : " + message);
    }
}