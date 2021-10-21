package Gossip;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "this boy plays volleyball";
        List<Human> people = new ArrayList<>();

        GossipsBoySAndGirls gossipsBoySAndGirls = new GossipsBoySAndGirls();

        Subscriber boyGossipSubscriber1 = new Subscriber("Вова",Type.ABOUT_BOYS);
        Subscriber boyGossipSubscriber2 = new Subscriber("Инна",Type.ABOUT_BOYS);
        Subscriber girlsGossipSubscriber1 = new Subscriber("Света",Type.ABOUT_GIRLS);
        Subscriber girlsGossipSubscriber2 = new Subscriber("Карина",Type.ABOUT_GIRLS);

        people.add(boyGossipSubscriber1);
        people.add(boyGossipSubscriber2);
        people.add(girlsGossipSubscriber1);
        people.add(girlsGossipSubscriber2);


        gossipsBoySAndGirls.setList(people);

        gossipsBoySAndGirls.tellGossip(text);

        boyGossipSubscriber1.doesHeKnowGossip();
        boyGossipSubscriber2.doesHeKnowGossip();
        girlsGossipSubscriber1.doesHeKnowGossip();
        girlsGossipSubscriber2.doesHeKnowGossip();


    }
}
