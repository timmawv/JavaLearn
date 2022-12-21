package avlyakulov.timur.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        List <Human> humans = new ArrayList<>();
        Human human = new Human(1);
        Human human2 = new Human(2);
        Human human3 = new Human(3);
        humans.add(human3);
        humans.add(human);
        humans.add(human2);
        System.out.println(humans);
        Collections.sort(humans, new CompareHumanId());
        System.out.println(humans);

    }



}

class Human implements Comparable<Human>{
    int id;

    public Human (int id) {
        this.id = id;
    }

    @Override
    public int compareTo (Human human) {
        return this.id - human.id;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                '}';
    }
}




class CompareHumanId implements Comparator <Human> {
    @Override
    public int compare (Human hum1, Human hum2) {
        return hum1.id - hum2.id;
    }
}
