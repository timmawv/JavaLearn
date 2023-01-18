package avlyakulov.timur.epam.chapter_7.strings.replace;
/*
У тексті слово країна замінить Україна!
 */
public class StringReplace {
    public static void main(String[] args) {
        String str = "Наша держава, яка була створена у 1991 році - країна";
        System.out.println("Old string - " + str);
        str = str.replace("країна","Україна");
        System.out.println("New string - " + str);

    }
}