package avlyakulov.timur.epam.chapter_6.example.entity;

public class Rectangle extends AbstractShape {
    private double height;
    private double width;

    public Rectangle (double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight () {
        return height;
    }
    public double getWidth () {
        return width;
    }
}