package avlyakulov.timur.epam.chapter_4.planet.entity;
/*
Создать объект класса Планета, используя классы Материк, Океан,Остров.
Методы: вывести на консоль название материка, планеты, количество материков.
 */

public class Planet {
    private final String name;
    Mainland[] mainlands;
    private int counter;

    public Planet (String name) {
        this.name = name;
        mainlands = new Mainland[3];
    }

    public void addMainland (String name) {
        mainlands[counter] = new Mainland(name);
        ++counter;
    }
    public int getCounter () {
        return counter;
    }

    public String getName () {
        return name;
    }
    public void printMainlands () {
        for (Mainland mainland : mainlands)
            if (mainland != null)
                System.out.println(mainland);
    }
}