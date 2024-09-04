package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Abstraction;

public class AboutAbstraction {
//    Definition of Abstract Classes:
//
//    An abstract class in Java is a class that cannot be instantiated directly. This means you cannot create an object of an abstract class.
//    It is used to represent general concepts that are meant to be implemented by concrete subclasses.
//    Abstract classes serve as a blueprint for other classes.
//            2. Abstract Methods:
//
//    An abstract class can have abstract methods—methods that do not have a body and must be implemented by subclasses.
//    Example:
//
//    abstract class Animal {
//        abstract void sound();  // Abstract method
//    }
//
//    The sound() method above is abstract and doesn’t have a body. Any subclass of Animal must provide an implementation for the sound()
//    method.
//            3. Concrete Methods in Abstract Classes:
//
//    Besides abstract methods, an abstract class can also have concrete methods (methods with a body).
//    These methods can provide default behavior that can be inherited by subclasses.
//            Example:
//    java
//    Copy code

//    abstract class Animal {
//        abstract void sound();
//
//        void breathe() {
//            System.out.println("Animal is breathing");
//        }
//    }

//    Here, the breathe() method is a concrete method with a body that can be used by any subclass of Animal.


//            4. Purpose and Usage:
//
//    Abstract classes are used when you have a base class that should not be instantiated on its own,
//    but still contains common methods and fields that all subclasses should inherit.
//    Example Scenario:
//    Suppose you have an abstract class Shape that represents a general concept of a shape.
//    Different shapes like Circle, Rectangle, and Triangle can be subclasses of Shape.
//    Each subclass will provide its own implementation of methods like draw() and area().


//            5. Rules and Characteristics:
//
//    Cannot Instantiate: As mentioned, you cannot create an object of an abstract class. For example:
//    java
//    Copy code
//    Shape shape = new Shape();  // This will give a compilation error
//    Can Have Constructors: An abstract class can have constructors, and these constructors are called when a subclass is instantiated.
//    java
//    Copy code


//    abstract class Shape {
//        String color;
//
//        Shape(String color) {
//            this.color = color;
//        }
//    }


//    class Circle extends Shape {
//        double radius;
//
//        Circle(String color, double radius) {
//            super(color);  // Calls the constructor of Shape
//            this.radius = radius;
//        }
//    }

//    Can Have Fields: Like any other class, an abstract class can have instance variables (fields),
//    and these can be used by subclasses.
//    Can Implement Interfaces: An abstract class can implement interfaces,
//    and it doesn’t need to provide implementations for all methods in the interface.


//            6. When to Use Abstract Classes:
//
//    Use an abstract class when you want to define a common base class for all derived classes but don’t want to allow the base class
//    to be instantiated.
//    Use abstract classes to define a template for other classes where you have some common behavior that should be shared,
//    but the implementation details may vary.


//7. Abstract Class vs Interface:
//
//    Abstract Classes:
//    Can have both abstract methods and concrete methods.
//    Can have constructors and member variables.
//    Use when classes are closely related and share some common code.
//            Interfaces:
//    Can only have abstract methods (Java 8 and later allow default and static methods).
//    Cannot have constructors or instance variables (except for static final variables).
//    Use when you want to specify what a class should do, but not how it does it (behavioral contracts).



//            8. Example of Abstract Class Implementation:

//    java
//    Copy code
//    abstract class Animal {
//        String name;
//
//        Animal(String name) {
//            this.name = name;
//        }
//
//        abstract void sound();
//
//        void eat() {
//            System.out.println(name + " is eating.");
//        }
//    }
//
//    class Dog extends Animal {
//
//        Dog(String name) {
//            super(name);
//        }
//
//        @Override
//        void sound() {
//            System.out.println(name + " says: Woof Woof");
//        }
//    }
//
//    class Cat extends Animal {
//
//        Cat(String name) {
//            super(name);
//        }
//
//        @Override
//        void sound() {
//            System.out.println(name + " says: Meow");
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Animal dog = new Dog("Buddy");
//            dog.sound();  // Outputs: Buddy says: Woof Woof
//            dog.eat();    // Outputs: Buddy is eating.
//
//            Animal cat = new Cat("Whiskers");
//            cat.sound();  // Outputs: Whiskers says: Meow
//            cat.eat();    // Outputs: Whiskers is eating.
//        }
//    }

//    Summary of Key Points:
//    Abstract Classes: Cannot be instantiated and can contain both abstract and concrete methods.
//    Abstract Methods: Must be implemented by subclasses.
//            Usage: Use abstract classes for a common base of closely related classes that share code.
//    Advantages:
//    Encapsulate common behavior and fields.
//    Define a template for subclasses.
//    Reduce code duplication by implementing common logic.
//    This detailed explanation should provide you with a solid understanding of abstract classes in Java, their purpose,
//    and how to use them effectively.
}
