package avlyakulov.timur.practise;

import java.util.stream.Collectors;

public class Practise {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Слово");
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

    }
}