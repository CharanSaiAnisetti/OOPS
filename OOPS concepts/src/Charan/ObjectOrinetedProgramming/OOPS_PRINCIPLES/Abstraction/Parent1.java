package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Abstraction;

public abstract class Parent1 {
    int parentAge;
    final int VALUE;

    public Parent1(int parentAge) {
        this.parentAge = parentAge;
        VALUE = 32456789;
    }

    static void hello(){
        System.out.println("hey this is parent1");
    }

    void normal() {
        System.out.println("this is a normal method in parent-");
    }

    public void getParentAge() {
        System.out.println(parentAge);
    }

    abstract void career();
    abstract void partner();
}
