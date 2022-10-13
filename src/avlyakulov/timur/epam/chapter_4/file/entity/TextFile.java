package avlyakulov.timur.epam.chapter_4.file.entity;

/*
Создать объект класса Текстовый файл, используя классы Файл,Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class TextFile extends File {

    public TextFile (String path,String name, String text) {
        super (path,name,text);
    }
}