package Gossip;

public class Subscriber implements Human{
    String name;
    Gossip gossip;
    Type type;

    public Subscriber(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public boolean isTheGossipInteresting(Gossip gossip) {

        if (this.type.equals(gossip.getType())) {
            return true;
        }
        return false;
    }

    public void readGossip (Gossip gossip) {
        this.gossip = gossip;
    }

    public void doesHeKnowGossip(){
        System.out.println(this.name + " услышал " + this.gossip.getText());
    }
}
