package Gossip;

import java.util.List;
import java.util.NoSuchElementException;

public class GossipsBoySAndGirls implements Gossips {
    List<Human> list;

    public void setList(List<Human> list) {
        this.list = list;
    }

    @Override
    public Type determineTheTypeOfGossip(String text) {
        int t = text.indexOf("boy");

        if (t > 0) {
            return Type.ABOUT_BOYS;
        }
        return Type.ABOUT_GIRLS;
    }


    @Override
    public void tellGossip(String text) {
        
        Gossip gossip = new Gossip(text, determineTheTypeOfGossip(text));

        for (int i = 0; i < this.list.size(); i++) {

            if (this.list.get(i).isTheGossipInteresting(gossip)) {
                this.list.get(i).readGossip(gossip);
            }
        }

    }

    @Override
    public void addHuman(Human human) {
        this.list.add(human);
    }
}
