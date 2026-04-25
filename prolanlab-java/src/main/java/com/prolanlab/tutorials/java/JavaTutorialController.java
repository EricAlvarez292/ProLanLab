package com.prolanlab.tutorials.java;

import com.prolanlab.tutorials.java.fundamentals.JavaFundamentals;
import com.prolanlab.tutorials.java.controlstructures.JavaControlStructures;
import com.prolanlab.tutorials.java.classesandoop.JavaClassesAndOOP;
import com.prolanlab.tutorials.java.datastructures.JavaDataStructures;
import com.prolanlab.Main;

import java.util.Scanner;

public class JavaTutorialController {
    private final Scanner scanner = Main.getScanner();
    private final JavaFundamentals fundamentals = new JavaFundamentals();
    private final JavaControlStructures controlStructures = new JavaControlStructures();
    private final JavaClassesAndOOP classesAndOOP = new JavaClassesAndOOP();
    private final JavaDataStructures dataStructures = new JavaDataStructures();
    
    public void start() {
        boolean inJavaTutorial = true;
        
        while (inJavaTutorial) {
            displayJavaMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                // Fundamentals (1-8)
                case 1:
                    fundamentals.showJavaIntro();
                    break;
                case 2:
                    fundamentals.showJavaSyntax();
                    break;
                case 3:
                    fundamentals.showJavaOutput();
                    break;
                case 4:
                    fundamentals.showJavaComments();
                    break;
                case 5:
                    fundamentals.showJavaVariables();
                    break;
                case 6:
                    fundamentals.showJavaDataTypes();
                    break;
                case 7:
                    fundamentals.showJavaTypeCasting();
                    break;
                case 8:
                    fundamentals.showJavaOperators();
                    break;
                    
                // Control Structures (9-16)
                case 9:
                    controlStructures.showJavaStrings();
                    break;
                case 10:
                    controlStructures.showJavaMath();
                    break;
                case 11:
                    controlStructures.showJavaBooleans();
                    break;
                case 12:
                    controlStructures.showJavaIfElse();
                    break;
                case 13:
                    controlStructures.showJavaSwitch();
                    break;
                case 14:
                    controlStructures.showJavaWhileLoop();
                    break;
                case 15:
                    controlStructures.showJavaForLoop();
                    break;
                case 16:
                    controlStructures.showJavaBreakContinue();
                    break;
                    
                // Classes & OOP (17-27)
                case 17:
                    classesAndOOP.showJavaOOP();
                    break;
                case 18:
                    classesAndOOP.showJavaClassesObjects();
                    break;
                case 19:
                    classesAndOOP.showJavaAttributes();
                    break;
                case 20:
                    classesAndOOP.showJavaMethodsOOP();
                    break;
                case 21:
                    classesAndOOP.showJavaConstructors();
                    break;
                case 22:
                    classesAndOOP.showJavaThisKeyword();
                    break;
                case 23:
                    classesAndOOP.showJavaModifiers();
                    break;
                case 24:
                    classesAndOOP.showJavaInheritance();
                    break;
                case 25:
                    classesAndOOP.showJavaPolymorphism();
                    break;
                case 26:
                    classesAndOOP.showJavaEncapsulation();
                    break;
                case 27:
                    classesAndOOP.showJavaInnerClasses();
                    break;
                    
                // Data Structures (28-41)
                case 28:
                    dataStructures.showJavaDataStructures();
                    break;
                case 29:
                    dataStructures.showJavaCollections();
                    break;
                case 30:
                    dataStructures.showJavaList();
                    break;
                case 31:
                    dataStructures.showJavaArrays();
                    break;
                case 32:
                    dataStructures.showJavaArrayList();
                    break;
                case 33:
                    dataStructures.showJavaLinkedList();
                    break;
                case 34:
                    dataStructures.showJavaSet();
                    break;
                case 35:
                    dataStructures.showJavaHashSet();
                    break;
                case 36:
                    dataStructures.showJavaLinkedHashSet();
                    break;
                case 37:
                    dataStructures.showJavaMap();
                    break;
                case 38:
                    dataStructures.showJavaHashMap();
                    break;
                case 39:
                    dataStructures.showJavaLinkedHashMap();
                    break;
                case 40:
                    dataStructures.showJavaIterator();
                    break;
                case 41:
                    dataStructures.showJavaAlgorithms();
                    break;
                case 42:
                    System.out.println("Returning to tutorial menu...");
                    inJavaTutorial = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            
            if (inJavaTutorial && choice != 42) {
                System.out.println("\n" + "=".repeat(75));
                System.out.println("Press Enter to return to Java tutorial menu...");
                scanner.nextLine();
            }
        }
    }
    
    private void displayJavaMenu() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println("                    [J] JAVA TUTORIAL");
        System.out.println("=".repeat(75));
        System.out.println(">> FUNDAMENTALS");
        System.out.println(" 1. Intro and Concepts     2. Syntax");
        System.out.println(" 3. Output                 4. Comments");
        System.out.println(" 5. Variables              6. Data Types");
        System.out.println(" 7. Type Casting           8. Operators");
        System.out.println();
        System.out.println(">> CONTROL STRUCTURES");  
        System.out.println(" 9. Strings               10. Math");
        System.out.println("11. Booleans              12. If-Else");
        System.out.println("13. Switch                14. While Loop");
        System.out.println("15. For Loop              16. Break/Continue");
        System.out.println();
        System.out.println(">> CLASSES & OOP");
        System.out.println("17. OOP                   18. Classes/Objects");
        System.out.println("19. Attributes            20. Methods");
        System.out.println("21. Constructors          22. this Keyword");
        System.out.println("23. Modifiers             24. Inheritance");
        System.out.println("25. Polymorphism          26. Encapsulation");
        System.out.println("27. Inner Classes");
        System.out.println();
        System.out.println(">> DATA STRUCTURES");
        System.out.println("28. Data Structures       29. Collections");
        System.out.println("30. List                  31. Arrays");
        System.out.println("32. ArrayList             33. LinkedList");
        System.out.println("34. Set                   35. HashSet");
        System.out.println("36. LinkedHashSet         37. Map");
        System.out.println("38. HashMap               39. LinkedHashMap");
        System.out.println("40. Iterator              41. Algorithms");
        System.out.println();
        System.out.println("42. << Back to Tutorial Menu");
        System.out.println("=".repeat(75));
        System.out.print("Enter your choice (1-42): ");
    }
    
    private int getUserChoice() {
        try {
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            return choice;
        } catch (Exception e) {
            scanner.nextLine(); // Clear invalid input
            return -1;
        }
    }
}