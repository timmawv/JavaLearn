package avlyakulov.timur.practise;

import java.util.ArrayList;
import java.util.List;

//пример дженериков зачем они нужны и что было до них
public class Generics {
    public static void main(String[] args) {
        ///////////////// before java 5 //////////////////
        List animals = new ArrayList();
        
        animals.add("cat");
        animals.add("dog");
        animals.add("owl");

        String animal = (String) animals.get(2); // down casting
        System.out.println(animal);
        //////////////// after java 5 with generics //////////
        List<String> animals2 = new ArrayList<String>();

        animals2.add("cat");
        animals2.add("dog");
        animals2.add("owl");

        animal = animals2.get(2);
        System.out.println(animal);

        //////////////// after java 7 ////////////////////////
        List<String> dogs = new ArrayList<>(); // without String near the type of Object

    }
}
