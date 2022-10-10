package avlyakulov.timur.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practise {
    public static void main(String[] args) throws ReaderException, IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        while (true) {
                int num = Integer.parseInt(reader.readLine());
                if (num !=0)
                    throw new ReaderException("Your num is not null");
        }
    }
}