package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Interfaces.InterfaceExamples;

public class AboutInterfaces {
/*
     Definition of Interfaces:

     An interface in Java is a reference type that is similar to a class. It is a collection of abstract methods (methods without a body)
     and constant variables (static and final by default).
     Interfaces define a contract that a class must adhere to. When a class implements an interface,
     it agrees to implement all the abstract methods defined in the interface.



             2. Abstract Methods in Interfaces:

     All methods in an interface are abstract by default, meaning they do not have a body and must be implemented by any class
     that implements the interface.
     Example:
     java
     Copy code
     interface Animal {
         void sound();  // Abstract method
     }

     The sound() method above is abstract and must be implemented by any class that implements the Animal interface.




             3. Default and Static Methods in Interfaces (Java 8+):

     Starting with Java 8, interfaces can have default methods and static methods.

     Default Methods: Methods with a default implementation. These can be overridden by implementing classes if needed.

     Static Methods: Methods that belong to the interface itself and can be called without an instance of the class.

     Example:
     java
     Copy code
     interface Animal {
         void sound();  // Abstract method

         default void sleep() {
             System.out.println("Animal is sleeping");
         }

         static void breathe() {
             System.out.println("Animal is breathing");
         }
     }



     Here, sleep() is a default method that provides a common implementation for all implementing classes,

     and breathe() is a static method that can be called using Animal.breathe().


             4. Multiple Inheritance with Interfaces:

     One of the key advantages of interfaces is that a class can implement multiple interfaces, allowing for multiple inheritance.
     This is not possible with classes since Java does not support multiple inheritance with classes.
             Example:
     java
     Copy code
     interface Flyable {
         void fly();
     }

     interface Swimmable {
         void swim();
     }

     class Duck implements Flyable, Swimmable {
         @Override
         public void fly() {
             System.out.println("Duck is flying");
         }

         @Override
         public void swim() {
             System.out.println("Duck is swimming");
         }
     }

     The Duck class implements both Flyable and Swimmable interfaces,
     inheriting the abstract methods from both and providing implementations for them.



 5. Purpose and Usage:

     Interfaces are used to achieve abstraction and to define a contract for what a class can do, without specifying how it does it.
     They are especially useful when you want to ensure that a class adheres to a particular set of behaviors,
     regardless of where it appears in the class hierarchy.



             6. Rules and Characteristics:

     Cannot Contain Instance Fields: Unlike classes, interfaces cannot have instance variables.
     All variables in an interface are implicitly public, static, and final.
     Must Implement All Methods: A class that implements an interface must implement all its abstract methods,
     unless the class is abstract itself.
     No Constructors: Interfaces cannot have constructors because they are not meant to instantiate objects directly.
     Can Extend Multiple Interfaces: An interface can extend multiple other interfaces, allowing for a combination of multiple behaviors.
             java
     Copy code
     interface A {
         void methodA();
     }

     interface B {
         void methodB();
     }

     interface C extends A, B {
         void methodC();
     }
     The C interface inherits methods from both A and B interfaces.


             7. When to Use Interfaces:

     Use interfaces when you need to define a contract that multiple classes can implement,
     especially when those classes are unrelated by inheritance.
     Interfaces are ideal for defining plug-and-play behaviors,
     where classes can be swapped out easily as long as they implement the same interface.



             8. Interface vs Abstract Class:

     Interfaces:
     Can have abstract methods, default methods, and static methods.
     Cannot have constructors or instance fields.
     Allow multiple inheritance through the implementation of multiple interfaces.
     Abstract Classes:
     Can have both abstract and concrete methods.
     Can have instance fields and constructors.
     Use when classes are closely related and share some common code.
     Use interfaces when you want to specify what a class should do,
     and abstract classes when you want to share some common implementation among related classes.


             9. Example of Interface Implementation:

     java
     Copy code

     interface Animal {
         void sound();  // Abstract method

         default void sleep() {
             System.out.println("Animal is sleeping");
         }
     }

     interface Flyable {
         void fly();  // Abstract method
     }

     class Bird implements Animal, Flyable {

         @Override
         public void sound() {
             System.out.println("Bird is chirping");
         }

         @Override
         public void fly() {
             System.out.println("Bird is flying");
         }
     }

     public class Main {
         public static void main(String[] args) {
             Bird bird = new Bird();
             bird.sound();   // Outputs: Bird is chirping
             bird.fly();     // Outputs: Bird is flying
             bird.sleep();   // Outputs: Animal is sleeping

             Animal.breathe(); // Outputs: Animal is breathing (Static method call)
         }
     }

     Summary of Key Points:
     Interfaces: Define a contract for classes to implement, consisting of abstract methods and optionally default and static methods.
     Abstract Methods: Must be implemented by any class that implements the interface.
     Default Methods: Provide a default implementation that can be overridden by implementing classes.
     Static Methods: Belong to the interface itself and can be called without an instance.
     Usage: Use interfaces to define common behavior across unrelated classes or to enforce a specific contract.


             Advantages:
     Allow for multiple inheritance in Java.
     Provide flexibility by defining a contract that multiple classes can implement.
     Encourage loose coupling and high cohesion in code design.
     This detailed explanation should give you a comprehensive understanding of interfaces in Java, their purpose,
     and how to use them effectively.
*/


}
