package avlyakulov.timur.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends PractiseImprove {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word;
        try {
             word = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(word.length());
        System.out.println(word.contains(" "));
    }
}