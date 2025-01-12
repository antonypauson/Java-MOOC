import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add (Message message) {
        if (message.getLength() <= 280) {
            messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public static void main(String[] args) {
        Message firstM = new Message("Me", "WOW");
        Message secondM = new Message("Me", "Piece out");

        MessagingService messagingService = new MessagingService();
        messagingService.add(firstM);
        messagingService.add(secondM);


    }
}
