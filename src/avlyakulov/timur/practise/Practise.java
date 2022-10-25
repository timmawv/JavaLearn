package avlyakulov.timur.practise;

import java.io.*;

public class Practise implements Serializable {

    private int id;
    private String name;

    public Practise (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Our person " + id + " , " + name;
    }

    public static void main(String[] args) {
        Practise person1 = new Practise(1,"Nick");
        Practise person2 = new Practise(2,"Johny");
        try {
            FileInputStream fis = new FileInputStream("D:\\Загрузки\\testFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Practise person4 = (Practise) ois.readObject();
            Practise person3 = (Practise) ois.readObject();
            System.out.println(person4);
            System.out.println(person3);
        }
        catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
