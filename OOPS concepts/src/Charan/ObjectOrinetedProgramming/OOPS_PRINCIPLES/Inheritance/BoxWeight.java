package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Inheritance;


public class BoxWeight extends Box {


    double weight = 22;

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    //    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // used to initialise values present in parent class
        super(l, h, w); // what is this? call the parent class constructor
        this.weight = weight;
    }


}
