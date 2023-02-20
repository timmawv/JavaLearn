package avlyakulov.timur.practise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Practise {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Слово");
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
        String s = "4";
        System.out.println(1 + 2 + 3 + s + 5 );
        String[] strings = new String[]{"a", "b", "c"};
        int k = 0;
        for (String element : strings) {
            strings[k].concat(String.valueOf(k));
            ++k;
        }
        System.out.print(Arrays.toString(strings));
    }
}