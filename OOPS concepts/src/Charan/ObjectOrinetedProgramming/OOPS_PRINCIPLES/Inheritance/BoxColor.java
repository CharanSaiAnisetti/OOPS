package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Inheritance;

public class BoxColor extends BoxWeight{

    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BoxColor(double l, double h, double w, double weight, String color) {
        super(l, h, w, weight);
        this.color = color;
    }

    public BoxColor() {
        super();
    }
}
