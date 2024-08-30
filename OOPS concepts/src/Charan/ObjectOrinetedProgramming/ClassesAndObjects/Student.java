package Charan.ObjectOrinetedProgramming.ClassesAndObjects;

public final class Student {


    int rno = 30;
    String name;
    float marks = 40f;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

//    Student  (Student other) {
//        this.name = other.name;
//        this.rno = other.rno;
//        this.marks = other.marks;
//    }



    Student (String name){
        this.name = name;
    }


    // Student charan = new Student(17, "charan", 89.7f);
    // here, this will be replaced with charan
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }


}
