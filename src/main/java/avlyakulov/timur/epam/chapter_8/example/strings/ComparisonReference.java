package avlyakulov.timur.epam.chapter_8.example.strings;

public class ComparisonReference {
    public static void main(String[] args) {
        //сравнение ссылок и объектов
        String s1 = "Java12";
        String s2 = "Ja" + "va" + 12;
        String s3 = new String("Java12");
        String s4 = new String(s1);
        System.out.println(s1 + "==" + s2 + " : " + (s1 == s2)); // true
        System.out.println(s3 + "==" + s4 + " : " + (s3 == s4)); // false
        System.out.println(s1 + "==" + s3 + " : " + (s1 == s3)); // false
        System.out.println(s1 + "==" + s4 + " : " + (s1 == s4)); // false
        System.out.println(s1 + " equals " + s2 + " : " + s1.equals(s2)); // true
        System.out.println(s1 + " equals " + s3 + " : " + s1.equals(s3)); // true

        //Существует возможность сэкономить память и переприсвоить ссылку с объекта на литерал при помощи вызова метода intern().
        System.out.println("Example for method intern()");
        //занесение в пул литералов
        String str1 = "Java";
        String str2 = new String("Java");
        System.out.println(str1 == str2);//false
        str2 = str2.intern();
        System.out.println(str1 == str2);//true
        /* В данной ситуации ссылка str1 инициализируется литералом, обладающим всеми свойствами объекта вплоть до вызова методов.
        Вызов метода intern() организует поиск в «пуле литералов» соответствующего значению объекта s2 литерала
        и при положительном результате возвращает ссылку на найденный литерал,
        а при отрицательном — заносит значение в пул и возвращает ссылку на него. */
    }
}