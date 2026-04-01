public class NotificationApp {
    private MessageService messageService;

    public NotificationApp(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}