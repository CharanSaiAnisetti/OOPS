package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Abstraction;

public abstract class Parent2 {
    int age;
    final int VALUE;

    public Parent2(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello(){
        System.out.println("hey this is parent2");
    }

    void normal() {
        System.out.println("this is a normal method in parent2");
    }

    abstract void career();
    abstract void partner();
}
