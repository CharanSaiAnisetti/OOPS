package Charan.ObjectOrinetedProgramming.StaticExamples;




public class Main {

    public static void main(String[] args) {

//        Human charan = new Human(22, "Charan", 10000, false);
//        Human pramod = new Human(34, "Pramod", 15000, true);
//        Human kiran = new Human(34, "kiran", 15000, true);
//        Human prashanth = new Human(33,"prashanth" , 2000, true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        System.out.println();




    }







    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();

    }
}
