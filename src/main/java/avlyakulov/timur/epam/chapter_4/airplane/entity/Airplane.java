package avlyakulov.timur.epam.chapter_4.airplane.entity;

/*
Создать объект класса Самолет, используя классы Крыло, Шасси, Двигатель.
Методы: летать, задавать маршрут, вывести на консоль маршрут.
 */
public class Airplane extends EngineAirplane {
    String position;
    String destination;
    Wing wing;
    Chassis chassis;

    public Airplane(String position) {
        this.position = position;
        wing = new Wing();
        chassis = new Chassis();
    }

    public void fly() {
        if (position.equals(destination) || destination == null)
            System.out.println("Your plane at the moment stay at destination that you choose or you dont choose it, please change it");
        else {
            System.out.println("Flying...");
            System.out.println("The plane has arrived to " + destination);
            this.position = destination;
        }
    }

    public void setRoute(String destination) {
        this.destination = destination;
    }

    public void printRoute() {
        System.out.println("Our route starts with " + position + " and arrive to " + destination);
    }
}
