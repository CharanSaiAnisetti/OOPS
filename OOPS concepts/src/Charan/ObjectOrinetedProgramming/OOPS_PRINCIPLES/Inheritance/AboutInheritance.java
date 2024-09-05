package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Inheritance;

public class AboutInheritance {

   /*  * Inheritance in Java

     * Definition: Inheritance is a mechanism in Java by which one class can acquire

     * the properties (fields) and behaviors (methods) of another class.
     * The class that is inherited from is called the superclass (parent),
     * and the class that inherits is called the subclass (child).

    */

// Example 1: Basic Inheritance

   /* class Parent {
        String name;

        // Constructor
        Parent(String name) {
            this.name = name;
        }

        // Parent class method
        void showName() {
            System.out.println("Parent name: " + name);
        }
    }

    class Child extends Parent {
        // Additional field in the child class
        int age;

        // Constructor for child class
        Child(String name, int age) {
            super(name); // Calling the parent class constructor
            this.age = age;
        }

        // Child class method
        void showDetails() {
            System.out.println("Child name: " + name + ", Age: " + age);
        }
    }

    public class MainInheritance {
        public static void main(String[] args) {
            Child child = new Child("John", 10);
            child.showName();     // Accessing parent class method
            child.showDetails();  // Accessing child class method
        }
    }

    /*
     * Key Concepts:
     * - **super** keyword: Used to call the parent class constructor and access methods or fields.
     * - **Method Inheritance**: Child class inherits all non-private methods from the parent class.
     */


// Types of Inheritance

    /*
     * 1. Single Inheritance:
     * - A child class inherits from only one parent class.
     */

   /* class A {
        void display() {
            System.out.println("Class A method");
        }
    }

    class B extends A {
        void print() {
            System.out.println("Class B method");
        }
    }

    */



    /*
     * 2. Multilevel Inheritance:
     * - A class is derived from a class which is also derived from another class.
     */

    /* class C extends B {
        void show() {
            System.out.println("Class C method");
        }
    }

    public class MainMultilevelInheritance {
        public static void main(String[] args) {
            C obj = new C();
            obj.display(); // Accessing method of Class A
            obj.print();   // Accessing method of Class B
            obj.show();    // Accessing method of Class C
        }
    }


    /*
     * 3. Hierarchical Inheritance:
     * - Multiple child classes inherit from a single parent class.
     */

  /*  class Parent1 {
        void greet() {
            System.out.println("Greetings from Parent1");
        }
    }

    class Child1 extends Parent1 {
        void message() {
            System.out.println("Message from Child1");
        }
    }

    class Child2 extends Parent1 {
        void message() {
            System.out.println("Message from Child2");
        }
    }

    public class MainHierarchicalInheritance {
        public static void main(String[] args) {
            Child1 c1 = new Child1();
            c1.greet();   // Accessing parent class method
            c1.message(); // Accessing child class method

            Child2 c2 = new Child2();
            c2.greet();   // Accessing parent class method
            c2.message(); // Accessing child class method
        }
    }

    /*
     * 4. Multiple Inheritance:
     * - Java does not support multiple inheritance with classes, but you can achieve it using interfaces.
     * - A class cannot directly inherit from more than one class.
     */


    /*
     * Accessing Parent Class Methods and Fields:
     * - Use the **super** keyword to refer to the parent class.
     */

// Example 2: Using super to Access Parent Class Fields

   /* class Parent2 {
        int age = 50;

        void display() {
            System.out.println("Parent age: " + age);
        }
    }

    class Child3 extends Parent2 {
        int age = 25;

        void display() {
            super.display(); // Calling parent class method
            System.out.println("Child age: " + age);
        }
    }

    public class MainAccess {
        public static void main(String[] args) {
            Child3 child = new Child3();
            child.display();
        }
    }


    /*
     * Advantages of Inheritance:
     * - **Code Reusability**: Inherited methods and fields can be reused in the subclass without redefining them.
     * - **Extensibility**: The child class can extend the functionality of the parent class by adding new methods or overriding existing ones.
     * - **Maintainability**: Reduces redundancy, making the code easier to maintain and update.
     * - **Polymorphism**: Inheritance enables polymorphism, allowing subclasses to be treated as instances of their parent class.
     */


    /*
     * Overriding in Inheritance:
     * - Method overriding occurs when a subclass provides a specific implementation of a method that is already defined by its parent class.
     * - The method must have the same signature in both the subclass and the parent class.
     */

// Example 3: Method Overriding

   /* class Vehicle {
        void run() {
            System.out.println("The vehicle is running");
        }
    }

    class Car extends Vehicle {
        @Override
        void run() {
            System.out.println("The car is running");
        }
    }

    public class MainOverriding {
        public static void main(String[] args) {
            Vehicle myVehicle = new Car();
            myVehicle.run();  // Outputs: The car is running
        }
    }

    /*
     * Key Points to Master Inheritance:
     * 1. Understand the **super** keyword for accessing parent class members.
     * 2. Practice method overriding to see how subclass methods can replace parent class methods.
     * 3. Know the types of inheritance (single, multilevel, hierarchical) and how they affect class relationships.
     * 4. Learn about access modifiers (private, protected, public) and how they affect inheritance.
     * 5. Study the role of constructors in inheritance and how they are called using **super()**.
     */

}
