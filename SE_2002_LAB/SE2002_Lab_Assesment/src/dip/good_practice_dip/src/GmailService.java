
public class GmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending with Gmail: " + message);
    }
}