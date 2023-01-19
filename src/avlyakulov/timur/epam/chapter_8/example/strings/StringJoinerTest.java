package avlyakulov.timur.epam.chapter_8.example.strings;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(":", "<<", ">>");
        String result = joiner.add("blanc").add("rouge").add("blanc").toString();
        System.out.println(result);
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                "<book>\n" +
                " <name>Java from EPAM</name>\n" +
                " <author id=\"777\">Blinov</author>\n" +
                "</book>\n";
        //Три двойные кавычки подряд в начале и конце строки гарантируют ее идентичное сохранение:
        String xmlBlock = """
                <?xml version="1.0" encoding="UTF-8" standalone="no"?>
                <book>
                <name>Java from EPAM</name>
                <author id="777">Blinov</author>
                </book>
                """;
        System.out.println(xml);
        System.out.println(xmlBlock);
    }
}