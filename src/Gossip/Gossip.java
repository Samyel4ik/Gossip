package Gossip;

public class Gossip {
    String text;
    Type type;

    public Gossip(String text, Type type) {
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Gossip{" +
                "text='" + text + '\'' +
                '}';
    }
}