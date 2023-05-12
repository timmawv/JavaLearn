package avlyakulov.timur.epam.chapter_4.file.entity;

/*
Создать объект класса Текстовый файл, используя классы Файл,Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Directory {
    private String path;

    public Directory (String path) {
        this.path = path;
    }
    public String getPath () {
        return path;
    }
}
