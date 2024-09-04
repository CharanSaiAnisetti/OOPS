package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Abstraction;

public abstract class Parent1 {
    int age;
    final int VALUE;

    public Parent1(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
