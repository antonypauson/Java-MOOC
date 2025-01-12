public class Message {
    private String sender, content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public int getLength() {
        return content.length();
    }
}
