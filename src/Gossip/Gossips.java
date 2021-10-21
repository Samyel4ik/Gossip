package Gossip;

interface Gossips {
    Type determineTheTypeOfGossip(String text);

    void tellGossip(String text);

    void addHuman(Human human);


}
