package avlyakulov.timur.epam.chapter_4.file.entity;

/*
Создать объект класса Текстовый файл, используя классы Файл,Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class File extends Directory {
    private String name;
    private String text;

    public File(String path, String name, String text) {
        super(path);
        this.name = name;
        this.text = text;
    }

    public void rename(String name) {
        setName(name);
    }

    public void printToConsole() {
        System.out.println(text);
    }

    public void addToFile(String text) {
        this.text += " " + text;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "File {" +
                "text='" + text + '\'' +
                " name='" + name + '\'' +
                " path='" + super.getPath() + '\'' +
                " }";
    }
}