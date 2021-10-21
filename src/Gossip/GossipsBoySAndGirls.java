package Gossip;

import java.util.List;

public class GossipsBoySAndGirls implements Gossips {
    List<Human> list;

    public void setList(List<Human> list) {
        this.list = list;
    }

    @Override
    public Type determineTheTypeOfGossip(String text) {

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("boy")) {
                return Type.ABOUT_BOYS;
            }
        }
        return Type.ABOUT_GIRLS;
    }



    @Override
    public void tellGossip(String text) {
        Gossip gossip = new Gossip(text, determineTheTypeOfGossip(text));

        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).isTheGossipInteresting(gossip)) {
                this.list.get(i).readGossip(gossip);
            } else {
                this.list.get(i).readGossip(new Gossip("ничего не услышал", this.list.get(i).getType()));
            }
        }
    }

    @Override
    public void addHuman(Human human) {
        this.list.add(human);
    }
}
