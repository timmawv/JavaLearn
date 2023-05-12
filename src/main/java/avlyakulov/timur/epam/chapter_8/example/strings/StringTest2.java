package avlyakulov.timur.epam.chapter_8.example.strings;

public class StringTest2 {
    public static void main(String[] args) {
        // method substring() - задаем индексы начального и конечного эелемента и обрезаем строку
        String test = "Impressive";
        String test1 = new String("Impressive");
        System.out.println(test == test1);
        test1 = test1.intern();
        System.out.println(test == test1);
        System.out.println("Look out StringBuilder and StringBuffer equals");
        StringBuilder builder = new StringBuilder("Java");
        StringBuffer buffer = new StringBuffer("Java");
        System.out.println("Equals with equals()");
        System.out.println(builder.equals(buffer));
        System.out.println(buffer.equals(builder));
        System.out.println("Equals with toString().equals()");
        System.out.println(builder.toString().equals(buffer.toString()));

    }
}
