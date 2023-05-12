package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Проверить, является ли строка сильным паролем. Пароль считается сильным,
если его длина больше либо равна 10 символам, он содержит как минимум
одну цифру, одну букву в верхнем и одну букву в нижнем регистре. Пароль
может содержать только латинские буквы и/или цифры, а также символ «_».
 */
public class CheckPassword {
    public static void main(String[] args) {
        System.out.println("Введите ваш пароль ");
        String password = new Scanner(System.in).nextLine();
        Pattern pattern = Pattern.compile("(?=[#$-/:-?{-~!\"^_`\\[\\]a-zA-Z]*([0-9#$-/:-?{-~!\"^_`\\[\\]]))(?=[#$-/:-?{-~!\"^_`\\[\\]a-zA-Z0-9]*[a-zA-Z])[#$-/:-?{-~!\"^_`\\[\\]a-zA-Z0-9]{10,}");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find())
            System.out.println("Your password is correct");
        else System.out.println("Your password is not valid");
    }
}