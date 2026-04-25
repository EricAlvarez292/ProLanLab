package com.prolanlab.tutorials.java.classesandoop;

/**
 * Java Classes and Object-Oriented Programming (OOP) Tutorial
 * Contains methods covering OOP concepts, classes, objects, and related topics
 */
public class JavaClassesAndOOP {
    
    /**
     * Displays an overview of Object-Oriented Programming concepts
     */
    public void showJavaOOP() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> OBJECT-ORIENTED PROGRAMMING (OOP)");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("OOP is a programming paradigm based on objects and classes.");
        System.out.println("Java is designed around four main OOP principles:");
        System.out.println();
        System.out.println("1. ENCAPSULATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| - Bundling data and methods together     |");
        System.out.println("| - Hiding internal implementation details |");
        System.out.println("| - Using private fields with public       |");
        System.out.println("|   getter/setter methods                   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. INHERITANCE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| - Creating new classes from existing ones|");
        System.out.println("| - Child classes inherit parent properties|");
        System.out.println("| - Promotes code reusability              |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. POLYMORPHISM:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| - Same interface, different implementations|");
        System.out.println("| - Method overriding and overloading      |");
        System.out.println("| - Runtime and compile-time polymorphism  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("4. ABSTRACTION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| - Hiding complex implementation details  |");
        System.out.println("| - Showing only essential features        |");
        System.out.println("| - Using abstract classes and interfaces  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Benefits of OOP:");
        System.out.println("* Code reusability and modularity");
        System.out.println("* Easier maintenance and debugging");
        System.out.println("* Real-world problem modeling");
        System.out.println("* Enhanced security through encapsulation");
    }
    
    /**
     * Explains Java classes and objects with examples
     */
    public void showJavaClassesObjects() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA CLASSES AND OBJECTS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Java is an object-oriented programming language.");
        System.out.println("Classes are templates for objects, and objects are instances of classes.");
        System.out.println();
        System.out.println("1. CREATING A CLASS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class Car {                     |");
        System.out.println("|     // Class attributes (fields)       |");
        System.out.println("|     String brand;                      |");
        System.out.println("|     String model;                      |");
        System.out.println("|     int year;                          |");
        System.out.println("|                                         |");
        System.out.println("|     // Class method                    |");
        System.out.println("|     public void displayInfo() {        |");
        System.out.println("|         System.out.println(brand + \" \" + model); |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. CREATING OBJECTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class Main {                    |");
        System.out.println("|     public static void main(String[] args) { |");
        System.out.println("|         // Create objects              |");
        System.out.println("|         Car car1 = new Car();          |");
        System.out.println("|         Car car2 = new Car();          |");
        System.out.println("|                                         |");
        System.out.println("|         // Set attributes              |");
        System.out.println("|         car1.brand = \"Ford\";            |");
        System.out.println("|         car1.model = \"Mustang\";         |");
        System.out.println("|         car1.year = 1969;              |");
        System.out.println("|                                         |");
        System.out.println("|         car2.brand = \"Audi\";            |");
        System.out.println("|         car2.model = \"A4\";              |");
        System.out.println("|         car2.year = 2020;              |");
        System.out.println("|                                         |");
        System.out.println("|         // Call method                 |");
        System.out.println("|         car1.displayInfo();            |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Key Concepts:");
        System.out.println("* A class is a blueprint for objects");
        System.out.println("* Objects are instances created from a class");
        System.out.println("* Multiple objects can be created from one class");
        System.out.println("* Each object has its own set of attributes");
    }
    
    /**
     * Explains Java class attributes with access modifiers
     */
    public void showJavaAttributes() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA CLASS ATTRIBUTES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Class attributes are variables within a class.");
        System.out.println("They define the properties or characteristics of objects.");
        System.out.println();
        System.out.println("1. DEFINING ATTRIBUTES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class Student {                 |");
        System.out.println("|     // Public attributes               |");
        System.out.println("|     public String name;                |");
        System.out.println("|     public int age;                    |");
        System.out.println("|                                         |");
        System.out.println("|     // Private attributes              |");
        System.out.println("|     private double gpa;                |");
        System.out.println("|     private String studentId;          |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ACCESSING ATTRIBUTES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Student student = new Student();      |");
        System.out.println("|                                         |");
        System.out.println("| // Access public attributes directly   |");
        System.out.println("| student.name = \"Alice\";               |");
        System.out.println("| student.age = 20;                      |");
        System.out.println("| System.out.println(student.name);      |");
        System.out.println("|                                         |");
        System.out.println("| // Cannot access private attributes    |");
        System.out.println("| // student.gpa = 3.8; // ERROR!       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Best Practices:");
        System.out.println("* Use private attributes with public getter/setter methods");
        System.out.println("* Initialize attributes with meaningful default values");
        System.out.println("* Use descriptive names for attributes");
    }
    
    /**
     * Explains Java class methods and their types
     */
    public void showJavaMethodsOOP() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA CLASS METHODS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Class methods define the behavior of objects.");
        System.out.println("They can access and modify class attributes.");
        System.out.println();
        System.out.println("1. INSTANCE METHODS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class Rectangle {               |");
        System.out.println("|     private double width, height;      |");
        System.out.println("|                                         |");
        System.out.println("|     // Setter methods                  |");
        System.out.println("|     public void setWidth(double w) {   |");
        System.out.println("|         width = w;                     |");
        System.out.println("|     }                                   |");
        System.out.println("|                                         |");
        System.out.println("|     // Calculation method              |");
        System.out.println("|     public double calculateArea() {    |");
        System.out.println("|         return width * height;        |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Method Types:");
        System.out.println("* Instance methods: Called on objects, access instance data");
        System.out.println("* Static methods: Called on class, no access to instance data");
        System.out.println("* Getter/Setter methods: Access private attributes safely");
    }
    
    /**
     * Explains Java constructors and their usage
     */
    public void showJavaConstructors() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA CONSTRUCTORS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Constructors are special methods used to initialize objects.");
        System.out.println("They are called automatically when an object is created.");
        System.out.println();
        System.out.println("1. DEFAULT CONSTRUCTOR:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class Person {                  |");
        System.out.println("|     private String name;               |");
        System.out.println("|     private int age;                   |");
        System.out.println("|                                         |");
        System.out.println("|     // Default constructor             |");
        System.out.println("|     public Person() {                  |");
        System.out.println("|         name = \"Unknown\";              |");
        System.out.println("|         age = 0;                       |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. PARAMETERIZED CONSTRUCTOR:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public Person(String n, int a) {       |");
        System.out.println("|     name = n;                          |");
        System.out.println("|     age = a;                           |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Constructor Rules:");
        System.out.println("* Must have the same name as the class");
        System.out.println("* No return type (not even void)");
        System.out.println("* Called automatically when object is created");
    }
    
    /**
     * Explains the 'this' keyword in Java
     */
    public void showJavaThisKeyword() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA 'THIS' KEYWORD");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("The 'this' keyword refers to the current object instance.");
        System.out.println();
        System.out.println("1. AVOIDING NAME CONFLICTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class Student {                 |");
        System.out.println("|     private String name;               |");
        System.out.println("|                                         |");
        System.out.println("|     public void setName(String name) { |");
        System.out.println("|         this.name = name; // 'this' refers to |");
        System.out.println("|         // the instance variable      |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("When to Use 'this':");
        System.out.println("* When parameter names match attribute names");
        System.out.println("* To call another constructor in the same class");
        System.out.println("* To return the current object for method chaining");
    }
    
    /**
     * Explains Java access modifiers
     */
    public void showJavaModifiers() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA ACCESS MODIFIERS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Access modifiers control the visibility of classes, methods, and variables.");
        System.out.println();
        System.out.println("1. ACCESS MODIFIERS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Modifier  | Class | Package | World    |");
        System.out.println("|-----------|-------|---------|----------|");
        System.out.println("| public    |  Yes  |   Yes   |   Yes    |");
        System.out.println("| protected |  Yes  |   Yes   |   No     |");
        System.out.println("| default   |  Yes  |   Yes   |   No     |");
        System.out.println("| private   |  Yes  |   No    |   No     |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. EXAMPLE USAGE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class BankAccount {             |");
        System.out.println("|     public String accountNumber;       |");
        System.out.println("|     private String pin;                |");
        System.out.println("|                                         |");
        System.out.println("|     public void deposit(double amount) { |");
        System.out.println("|         // Public method               |");
        System.out.println("|     }                                   |");
        System.out.println("|                                         |");
        System.out.println("|     private boolean validatePin(String p) { |");
        System.out.println("|         return pin.equals(p);          |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Best Practices:");
        System.out.println("* Use private for internal implementation details");
        System.out.println("* Use public for methods that form the class interface");
        System.out.println("* Use protected for methods used by subclasses");
    }
    
    /**
     * Explains Java inheritance concepts
     */
    public void showJavaInheritance() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA INHERITANCE");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Inheritance allows a class to inherit properties and methods from another class.");
        System.out.println("The 'extends' keyword is used to create inheritance relationships.");
        System.out.println();
        System.out.println("1. BASIC INHERITANCE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // Parent class (Superclass)           |");
        System.out.println("| public class Animal {                   |");
        System.out.println("|     protected String name;              |");
        System.out.println("|                                         |");
        System.out.println("|     public void eat() {                 |");
        System.out.println("|         System.out.println(name + \" eats\"); |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("|                                         |");
        System.out.println("| // Child class (Subclass)              |");
        System.out.println("| public class Dog extends Animal {       |");
        System.out.println("|     public void bark() {                |");
        System.out.println("|         System.out.println(name + \" barks\"); |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. METHOD OVERRIDING:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class Cat extends Animal {       |");
        System.out.println("|     @Override                           |");
        System.out.println("|     public void eat() {                 |");
        System.out.println("|         System.out.println(name + \" eats fish\"); |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Key Rules:");
        System.out.println("* Java supports single inheritance (one parent class)");
        System.out.println("* Use 'super' keyword to access parent class methods");
        System.out.println("* Constructor of parent class is called first");
    }
    
    /**
     * Explains Java polymorphism with examples
     */
    public void showJavaPolymorphism() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA POLYMORPHISM");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Polymorphism allows objects of different types to be treated as instances");
        System.out.println("of the same type through a common interface.");
        System.out.println();
        System.out.println("1. RUNTIME POLYMORPHISM (Method Overriding):");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Animal[] animals = {                    |");
        System.out.println("|     new Dog(\"Buddy\"),                  |");
        System.out.println("|     new Cat(\"Whiskers\")               |");
        System.out.println("| };                                      |");
        System.out.println("|                                         |");
        System.out.println("| for (Animal animal : animals) {         |");
        System.out.println("|     animal.eat(); // Calls appropriate method |");
        System.out.println("| }                                       |");
        System.out.println("| // Output: Buddy eats                  |");
        System.out.println("| //         Whiskers eats fish          |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. COMPILE-TIME POLYMORPHISM (Method Overloading):");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class Calculator {               |");
        System.out.println("|     public int add(int a, int b) {      |");
        System.out.println("|         return a + b;                  |");
        System.out.println("|     }                                   |");
        System.out.println("|                                         |");
        System.out.println("|     public double add(double a, double b) { |");
        System.out.println("|         return a + b;                  |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Benefits:");
        System.out.println("* Code flexibility and reusability");
        System.out.println("* Dynamic method resolution");
        System.out.println("* Cleaner, more maintainable code");
    }
    
    /**
     * Explains Java encapsulation principles
     */
    public void showJavaEncapsulation() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA ENCAPSULATION");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Encapsulation is the bundling of data and methods that operate on that data");
        System.out.println("within a single unit (class) and restricting access to internal details.");
        System.out.println();
        System.out.println("1. PROPER ENCAPSULATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class BankAccount {              |");
        System.out.println("|     // Private fields (data hiding)    |");
        System.out.println("|     private double balance;             |");
        System.out.println("|     private String accountNumber;       |");
        System.out.println("|                                         |");
        System.out.println("|     // Public getter methods           |");
        System.out.println("|     public double getBalance() {        |");
        System.out.println("|         return balance;                |");
        System.out.println("|     }                                   |");
        System.out.println("|                                         |");
        System.out.println("|     // Public setter with validation   |");
        System.out.println("|     public void deposit(double amount) { |");
        System.out.println("|         if (amount > 0) {              |");
        System.out.println("|             balance += amount;         |");
        System.out.println("|         }                              |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. DATA VALIDATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public void setAge(int age) {           |");
        System.out.println("|     if (age >= 0 && age <= 150) {      |");
        System.out.println("|         this.age = age;                |");
        System.out.println("|     } else {                           |");
        System.out.println("|         throw new IllegalArgumentException(|");
        System.out.println("|             \"Invalid age: \" + age);     |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Benefits of Encapsulation:");
        System.out.println("* Data security and integrity");
        System.out.println("* Controlled access to class members");
        System.out.println("* Easier maintenance and debugging");
        System.out.println("* Implementation details can change without affecting client code");
    }
    
    /**
     * Explains Java inner classes and their types
     */
    public void showJavaInnerClasses() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA INNER CLASSES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Inner classes are classes defined inside another class.");
        System.out.println("They provide better encapsulation and logical grouping.");
        System.out.println();
        System.out.println("1. NON-STATIC INNER CLASS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class OuterClass {               |");
        System.out.println("|     private String outerField = \"Outer\"; |");
        System.out.println("|                                         |");
        System.out.println("|     public class InnerClass {           |");
        System.out.println("|         public void display() {         |");
        System.out.println("|             // Can access outer field  |");
        System.out.println("|             System.out.println(outerField); |");
        System.out.println("|         }                               |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. STATIC NESTED CLASS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class OuterClass {               |");
        System.out.println("|     static class StaticNested {         |");
        System.out.println("|         public void display() {         |");
        System.out.println("|             System.out.println(\"Nested class\"); |");
        System.out.println("|         }                               |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("|                                         |");
        System.out.println("| // Usage                               |");
        System.out.println("| OuterClass.StaticNested nested =       |");
        System.out.println("|     new OuterClass.StaticNested();     |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. LOCAL INNER CLASS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public void methodWithLocalClass() {    |");
        System.out.println("|     class LocalInner {                 |");
        System.out.println("|         void display() {               |");
        System.out.println("|             System.out.println(\"Local\"); |");
        System.out.println("|         }                               |");
        System.out.println("|     }                                   |");
        System.out.println("|     LocalInner local = new LocalInner(); |");
        System.out.println("|     local.display();                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Types of Inner Classes:");
        System.out.println("* Member inner class (non-static)");
        System.out.println("* Static nested class");
        System.out.println("* Local inner class (inside methods)");
        System.out.println("* Anonymous inner class");
    }
}