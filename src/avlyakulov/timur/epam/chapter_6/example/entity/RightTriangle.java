package avlyakulov.timur.epam.chapter_6.example.entity;

public class RightTriangle extends  AbstractShape {
    private double sideA;
    private double sideB;

    public RightTriangle (double sideA,double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                "} " + super.toString();
    }
}