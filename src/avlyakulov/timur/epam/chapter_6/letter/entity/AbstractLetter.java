package avlyakulov.timur.epam.chapter_6.letter.entity;

import java.util.Date;

/*
Письма. Возможности: создать/удалить письмо, добавить/удалить отправи-
теля; добавить текст письма; добавить/удалить приложения к письму; поста-
вить дату отправки; отправить/принять письмо; проверить адресат на суще-
ствование. Добавить специализированные методы для Заказного письма.
 */
public class AbstractLetter {
    String text;

    public void setText(String text) {
        this.text = text;
    }
    public String getText () {
        return text;
    }
}