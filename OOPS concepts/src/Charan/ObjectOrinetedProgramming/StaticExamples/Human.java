package Charan.ObjectOrinetedProgramming.StaticExamples;



public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;



    void message1(){

       System.out.println("i am a non static method");
   }



     public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    public Human(){

    }


}
