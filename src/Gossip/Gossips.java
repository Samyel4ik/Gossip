package Gossip;

interface Gossips {
    Type determineTheTypeOfGossip(String text);

    void tellGossip(String text) throws Exception;

    void addHuman(Human human);


}
