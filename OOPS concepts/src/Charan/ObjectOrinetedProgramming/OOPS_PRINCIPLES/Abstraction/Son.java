package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Abstraction;

public class Son extends Parent1{
    int age;

    public Son(int age, int parentAge) {
        super(parentAge);
        this.age = age;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }

}
