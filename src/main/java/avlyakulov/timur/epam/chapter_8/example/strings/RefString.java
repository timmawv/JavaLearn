package avlyakulov.timur.epam.chapter_8.example.strings;

public class RefString {
    //передача строки по ссылке
    public static void changeString(String s) {
        System.out.println(s);
        s.concat(" Certified");
        System.out.println(s);
        s = s.concat(" Certified");
        System.out.println(s);
        s += " Certified";
        System.out.println(s);
    }

    public static void changeNumber(int number) {
        number = number + 2;
        System.out.println("In method " + number);
    }

    public static void main(String[] args) {
        System.out.println("Example with string");
        String str = "Java";
        {
            str = str.concat("14");
            System.out.println(str);
        }
        changeString(str);
        System.out.println(str); //результат всех этих изменений будет Java, то есть ни 1 строка не добавится потому что String immutable class
        System.out.println("Example with int");
        int a = 10;
        changeNumber(a);
        System.out.println(a);
        {
            a = a + 5;
            System.out.println(a);
        }
        System.out.println(a);
    }
}