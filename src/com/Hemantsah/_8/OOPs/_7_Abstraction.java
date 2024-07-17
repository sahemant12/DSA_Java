package com.Hemantsah._8.OOPs;
//Why Abstraction
//1.  It hide the complex implementation details of a system and showing only the necessary and essential aspects. The primary goal of abstraction is to reduce complexity and increase efficiency by focusing on what an object does rather than how it does.
//2. It can be achieve by Interfaces and Abstract Class
//3. Benefits: (i). Reduced Complexity, Improved Code Reusability
//4. Imp** Where to use Abstract class and Interface.
public class _7_Abstraction {
}


// Abstraction in Java using Abstract class
//Usage: Abstract classes are used when classes share a common structure or behavior, and you want to provide some common functionality along with the ability to enforce that certain methods are implemented by subclass.
abstract class Animal {  //Abstract class have both abstract and non-abstract method.
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("This animal is sleeping");
    }
}

// Subclass (inherited from Animal)
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass (inherited from Animal)
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to test abstraction
 class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();  // Outputs: Dog barks
        myCat.makeSound();  // Outputs: Cat meows

        myDog.sleep();  // Outputs: This animal is sleeping
        myCat.sleep();  // Outputs: This animal is sleeping
    }
}
//Usage: They are typically used to achieve multiple inheritance and to define capabilities that can be implemented by any class, regardless of where that class is in the inheritance hierarchy.
//Abstraction in Java Using Interfaces: It has only abstract method
interface Vehicle { //interface variable are public, static, and final in Java
    void start(); //Method by default are public and abstract
    void stop();
}

// Implementing the interface in the Car class
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }

    public void stop() {
        System.out.println("Car stops");
    }
}

// Implementing the interface in the Bike class
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts");
    }

    public void stop() {
        System.out.println("Bike stops");
    }
}

// Main class to test abstraction
 class Main2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();  // Outputs: Car starts
        myBike.start(); // Outputs: Bike starts

        myCar.stop();   // Outputs: Car stops
        myBike.stop();  // Outputs: Bike stops
    }
}


