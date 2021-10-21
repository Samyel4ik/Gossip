package Gossip;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        String text = "this boy plays volleyball";
        int i = text.indexOf("boy");
        List<Human> people = new ArrayList<>();

        GossipsBoySAndGirls gossipsBoySAndGirls = new GossipsBoySAndGirls();

        Subscriber boyGossipSubscriber1 = new Subscriber("Вова", Type.ABOUT_BOYS);
        Subscriber boyGossipSubscriber2 = new Subscriber("Инна", Type.ABOUT_BOYS);
        Subscriber girlsGossipSubscriber1 = new Subscriber("Света", Type.ABOUT_GIRLS);
        Subscriber girlsGossipSubscriber2 = new Subscriber("Карина", Type.ABOUT_GIRLS);

        people.add(boyGossipSubscriber1);
        people.add(boyGossipSubscriber2);
        people.add(girlsGossipSubscriber1);
        people.add(girlsGossipSubscriber2);


        gossipsBoySAndGirls.setList(people);

        gossipsBoySAndGirls.tellGossip(text);


        System.out.println(boyGossipSubscriber1.getName() + " получил сплетню " + boyGossipSubscriber1.doesHeKnowGossip().getText());
        System.out.println(girlsGossipSubscriber2.getName() + " получил сплетню " + girlsGossipSubscriber2.doesHeKnowGossip().getText());
//        boyGossipSubscriber2.doesHeKnowGossip();
//        girlsGossipSubscriber1.doesHeKnowGossip();
//        girlsGossipSubscriber2.doesHeKnowGossip();


    }
}
