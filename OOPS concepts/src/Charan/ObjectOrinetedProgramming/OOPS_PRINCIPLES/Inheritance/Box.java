package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Inheritance;

public class Box  {
    private double l ;
    double h;
    double w;
//    double weight = 33;


    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

   protected double getl() {
        return l;
    }

    public double getL() {
        return l;
    }

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {
        // super(); Object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
