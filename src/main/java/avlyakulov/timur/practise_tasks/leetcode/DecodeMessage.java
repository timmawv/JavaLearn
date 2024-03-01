package avlyakulov.timur.practise_tasks.leetcode;

import java.util.HashMap;

public class DecodeMessage {
    public String decodeMessage(String key, String message) {
        StringBuilder result = new StringBuilder();
        HashMap<String, Character> map = new HashMap<>();
        int counter = 1;
        key = key.replaceAll("\\s", "");
        char letter = 'a';
        for (int i = 0; i < key.length(); ++i) {
            if (!map.containsKey(key.substring(i, i + 1)))
                map.putIfAbsent(key.substring(i, i + 1), letter++);

        }
        for (int i = 0; i < message.length(); ++i) {
            if (message.charAt(i) == ' ')
                result.append(" ");
            else result.append(map.get(message.substring(i, i + 1)));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        String result = new DecodeMessage().decodeMessage(key, message);
        System.out.println(result);
        char a = 'a';
        System.out.println(a);
        System.out.println(++a);
    }
}