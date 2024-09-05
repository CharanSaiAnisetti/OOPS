package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Polymorphism;

public class AboutPolymorphism {

    // Notes on Polymorphism in Java

/* Definition:
 Polymorphism is one of the four pillars of Object-Oriented Programming (OOP).
 It allows one object to take multiple forms, enabling methods to perform
 different tasks based on the object they are acting upon.

 Types of Polymorphism:

 1. Compile-time Polymorphism (Static Polymorphism):
    - Achieved through method overloading.
    - The method to be invoked is determined at compile time.

 2. Run-time Polymorphism (Dynamic Polymorphism):
    - Achieved through method overriding.
    - The method to be invoked is determined at runtime.

 */


/* 1. Compile-time Polymorphism (Method Overloading)

 Method Overloading occurs when multiple methods in the same class have the same
 name but different parameters (different number of parameters, types, or both).
 The compiler determines which method to call based on the method signature
 (name and parameter list) during compile time.

 */

  /* class Calculator {
        // Method to add two integers
        int add(int a, int b) {
            return a + b;
        }

        // Method to add three integers
        int add(int a, int b, int c) {
            return a + b + c;
        }

        // Method to add two doubles
        double add(double a, double b) {
            return a + b;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            System.out.println(calc.add(2, 3));          // Calls add(int, int)
            System.out.println(calc.add(2, 3, 4));       // Calls add(int, int, int)
            System.out.println(calc.add(2.5, 3.5));      // Calls add(double, double)
        }
    }

    */

/* Advantages:
 - Improves code readability and reusability by using a single method name for similar functionalities.
 - Easier maintenance since the method logic can be changed in one place.


 2. Run-time Polymorphism (Method Overriding)

 Method Overriding occurs when a subclass has the same method signature
 (method name, parameters, and return type) as the method in its parent class.
 The method that gets called is determined by the type of the object at runtime,
 not the type of reference variable.

 */

   /* class Animal {
        // Method in the parent class
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        // Overriding the parent class method
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    class Cat extends Animal {
        // Overriding the parent class method
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal animal1 = new Dog();   // Dog is treated as Animal
            Animal animal2 = new Cat();   // Cat is treated as Animal

            animal1.sound();  // Outputs: Dog barks (runtime decision)
            animal2.sound();  // Outputs: Cat meows (runtime decision)
        }
    }

    */

/* Advantages:
 - Increases flexibility in code by allowing subclasses to provide specific
   implementations for methods defined in a parent class.
 - Enables loose coupling and dynamic behavior at runtime.


 Key Differences Between Overloading and Overriding

 Feature            | Method Overloading                          | Method Overriding
 -------------------|---------------------------------------------|----------------------------------------------
 Binding Time       | Compile-time                                | Run-time
 Method Signature   | Methods must have different signatures.     | Methods must have the same signature.
 Return Type        | Can differ.                                 | Must be the same as the parent class.
 Inheritance        | Not required.                               | Required (happens between superclass and subclass).
 Access Modifier    | Can be different.                           | Must have the same or more permissive access.
 Use Case           | To perform similar operations with different input. | To change or extend the behavior of the parent class.


 Polymorphism and Inheritance

 Polymorphism relies heavily on inheritance. When a subclass inherits a method
 from its parent class, it can either use the method as is or override it to provide
 specific functionality.


 Benefits of Polymorphism:
 1. Code Reusability: You can use a parent class reference to refer to any child class object,
    which means common functionality can be handled in one place.
 2. Extensibility: New classes can easily introduce their own specific behavior without
    modifying existing code.
 3. Maintainability: When method logic changes, you can override the method in one place,
    and it will automatically affect all related subclasses.

 */


// Polymorphism with Interfaces:

// In Java, polymorphism is also achieved with interfaces. A single class can implement
// multiple interfaces, and the decision about which method to invoke is made at runtime.

   /* interface Drawable {
        void draw();
    }

    class Circle implements Drawable {
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }

    class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Drawable d1 = new Circle();
            Drawable d2 = new Rectangle();

            d1.draw();  // Outputs: Drawing Circle
            d2.draw();  // Outputs: Drawing Rectangle
        }
    }

    */


// Mastering Polymorphism:

// - Understand Inheritance: Since polymorphism is closely tied to inheritance,
//   practice how methods are inherited and overridden.
// - Practice with Interfaces and Abstract Classes: Use polymorphism in various scenarios
//   with interfaces and abstract classes to see how it affects flexibility in code.
// - Real-world Scenarios: Work on real-world projects where polymorphism helps manage
//   multiple object types under a common parent, improving maintainability.

}
