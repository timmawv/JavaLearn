package avlyakulov.timur.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = 0;
        try {
             age = Integer.parseInt(reader.readLine());
        }
        catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
        String answer = age >=18 ? "yes more than 18" : "no he is younger";
        System.out.println(answer);
    }
}