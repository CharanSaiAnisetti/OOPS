package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Abstraction;

public class Main {

    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();

        Parent1 daughter = new Daughter(28);
        daughter.career();

        Parent1.hello();
//        Parent1 mom = new Parent1(45);
    }
}
