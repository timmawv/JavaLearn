package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_12;

/*
Пусть текст содержит миллион символов, необходимо сформировать из
них строку путем конкатенации. Определить время работы кода. Ускорить
процесс, используя класс StringBuilder.
 */
public class AccelerationConcat {
    public static void main(String[] args) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; ++i) {
            //sb.append("car" + ", ");// для сто тысяч символос стринг билдер делает это за 9 миллисекунд
            str.concat("car" + ", "); // обычный стринг делает это за 3800 миллисекунд метод (+=), но метод concat() более оптимизрованый, он на 1 миллисекунду дольше работает за append()
        }

        long end = System.currentTimeMillis() - start;
        System.out.println(end);
    }
}