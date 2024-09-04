package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Abstraction;

public class Daughter extends Parent1{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man");
    }
}
