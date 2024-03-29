package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_30;

import java.util.Arrays;

/*
Вывести в заданном тексте все слова, расположив их в алфавитном порядке.
 */
public class SortAlphabeticOrder {
    public static void main(String[] args) {
        String text = "Стоял солнечный день. Небо голубое, птицы поют. За зелёными кустами кто-то прятался, было хорошо слышно шелест сочных зелёных листьев. Там сидел маленький крольчонок и мирно пожёвывал травку, одуванчики, клевер и листочки. Заметив меня, он заторопился и, дожевав последний лист, ринулся в сторону леса. Только и видно было, как он заскочил в дальние кусты, слышно было громкий шелест и чириканье, и как множество маленьких птичек выпорхнуло из-за кустов, и эта небольшая стайка скрылась за высокими деревьями.";
        String[] words = text.replaceAll("\\. ",".").replaceAll(", ",",").split("[ ,.!?]");
        Arrays.stream(words).sorted(String::compareToIgnoreCase).forEach(s -> System.out.print(s +", "));
    }
}