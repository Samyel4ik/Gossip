package Gossip;

interface Human {

    boolean isTheGossipInteresting(Gossip gossip);
    void readGossip(Gossip gossip);
    Type getType();
}
