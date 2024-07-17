package com.Hemantsah._8.OOPs;
//Difference: Encapsulation vs Abstraction
//Encapsulation: Two parts- (i).Data Hiding (ii).Data Abstraction
class Encapsule{
    private int x; //data hiding
    public void setvalue(int x){ //data abstraction
        this.x=x;
    }
    public int getvalue(){
        return x;
    }
}
class encap{
    public static void main(String[] args) {
        Encapsule obj=new Encapsule();
     //   obj.x=20; can't do because x have private access
        obj.setvalue(20);
        System.out.println(obj.getvalue());
    }
}
//Why Encapsulation
//1. It helps to bundle the data (variables) and the methods (functions) into a single unit.
//2. It helps in Data Hiding from unauthorized access, modification, and misuse. Done by Getter and Setter Methods.

//chatGPT Example
//// Encapsulated class
//public class Person {
//    // Private variables
//    private String name;
//    private int age;
//
//    // Public constructor
//    public Person(String name, int age) {
//        this.name = name;
//        setAge(age); // Using setter to ensure validation
//    }
//
//    // Getter method for name
//    public String getName() {
//        return name;
//    }
//
//    // Setter method for name
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    // Getter method for age
//    public int getAge() {
//        return age;
//    }
//
//    // Setter method for age with validation
//    public void setAge(int age) {
//        if (age > 0) {
//            this.age = age;
//        } else {
//            System.out.println("Age must be positive");
//        }
//    }
//}
//
//// Main class to test encapsulation
//public class Main {
//    public static void main(String[] args) {
//        // Creating an object of Person
//        Person person = new Person("John Doe", 30);
//
//        // Accessing data using getter methods
//        System.out.println("Name: " + person.getName());
//        System.out.println("Age: " + person.getAge());
//
//        // Modifying data using setter methods
//        person.setName("Jane Doe");
//        person.setAge(25);
//
//        // Accessing modified data using getter methods
//        System.out.println("Updated Name: " + person.getName());
//        System.out.println("Updated Age: " + person.getAge());
//
//        // Trying to set an invalid age
//        person.setAge(-5);  // Outputs: Age must be positive
//        System.out.println("Age after invalid update: " + person.getAge());
//    }
//}

