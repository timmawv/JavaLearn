package avlyakulov.timur.epam.chapter_8.example.strings;

public class StringTest {
    public static void main(String[] args) {
        //method strip() - убирает пробелы в начале и конце строки
        String str1 = "     " + null + "        4    ";
        System.out.println(str1);
        str1 = str1.strip();// new Object
        System.out.println(str1);

        //method join() - объдиняет строки по delimiter (разделитель), можно передать сколько угодно элементов, возвращает 1 строку
        String str2 = String.join(" ", "java", "14", "Se");
        System.out.println(str2);
        System.out.println("-------------");
        /* Есть несколько возможностей удалить все пробелы в строке, как по краям,
        так и внутри. При использовании метода codePoints() строка преобразуется
        в IntStream, затем из нее убираются все пробелы, и результат выводится в по-
        ток вывода: */
        String str3 = "   Java   14  ";
        System.out.println(str3);
        str3.codePoints()
                .filter(s -> s != ' ')
                .forEach(o -> System.out.print((char) o));
        System.out.println();
        //Аналогично при применении объекта StringBuilder
        System.out.println("Example String Builder");
        StringBuilder sb = new StringBuilder("   Java   14  ");
        sb.codePoints()
                .filter(s -> s != ' ')
                .forEach(s -> sb.append((char) s));
        System.out.println(sb);
        //еще проще эта задача решается методом replace()
        System.out.println("Method replace space");
        String str4 = "   Java   14  ";
        System.out.println("Before change " + str4);
        str4 = str4.replace(" ", "");
        System.out.println("After change " + str4);
    }
}
