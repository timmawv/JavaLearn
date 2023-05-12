package avlyakulov.timur.epam.chapter_4.car.entity;


public class Wheel {
    private int condition;

    public Wheel () {
        condition = (int) (Math.random() * 5);
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getCondition () {
        return condition;
    }
}
