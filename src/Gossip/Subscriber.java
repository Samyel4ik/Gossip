package Gossip;

public class Subscriber implements Human {
    String name;
    Gossip gossip;
    Type type;

    public Subscriber(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isTheGossipInteresting(Gossip gossip) {
        return this.type.equals(gossip.getType());
    }

    public void readGossip(Gossip gossip) {
        this.gossip = gossip;
    }

    public Gossip doesHeKnowGossip() {
        return this.gossip;
    }
}
