public class TextMessage implements Readable {

    private String sender;
    private String content;

    public TextMessage(String sender, String content) {
        this.content = content;
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String read() {
        return this.content;
    }
}
