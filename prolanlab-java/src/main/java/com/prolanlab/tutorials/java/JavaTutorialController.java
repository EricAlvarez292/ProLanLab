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
                    controlStructures.showJavaWhileLoop();
                    break;
                case 14:
                    controlStructures.showJavaForLoop();
                    break;
                case 15:
                    controlStructures.showJavaBreakContinue();
                    break;
                    
                // Basic OOP (16-22)
                case 16:
                    classesAndOOP.showJavaOOP();
                    break;
                case 17:
                    classesAndOOP.showJavaClassesObjects();
                    break;
                case 18:
                    classesAndOOP.showJavaAttributes();
                    break;
                case 19:
                    classesAndOOP.showJavaMethodsOOP();
                    break;
                case 20:
                    classesAndOOP.showJavaConstructors();
                    break;
                case 21:
                    classesAndOOP.showJavaInheritance();
                    break;
                case 22:
                    classesAndOOP.showJavaModifiers();
                    break;
                    
                // Essential Collections (23-25)
                case 23:
                    dataStructures.showJavaArrays();
                    break;
                case 24:
                    dataStructures.showJavaArrayList();
                    break;
                case 25:
                    dataStructures.showJavaCollections();
                    break;
                case 26:
                    System.out.println("Returning to tutorial menu...");
                    inJavaTutorial = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            
            if (inJavaTutorial && choice != 26) {
                System.out.println("\n" + "=".repeat(75));
                System.out.println("Press Enter to return to Java tutorial menu...");
                scanner.nextLine();
            }
        }
    }
    
    private void displayJavaMenu() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println("                    [J] JAVA TUTORIAL (Beginner Focus)");
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
        System.out.println("13. While Loop            14. For Loop");
        System.out.println("15. Break/Continue");
        System.out.println();
        System.out.println(">> BASIC OOP");
        System.out.println("16. OOP Concepts          17. Classes/Objects");
        System.out.println("18. Attributes            19. Methods");
        System.out.println("20. Constructors          21. Basic Inheritance");
        System.out.println("22. Access Modifiers");
        System.out.println();
        System.out.println(">> ESSENTIAL COLLECTIONS");
        System.out.println("23. Arrays                24. ArrayList");
        System.out.println("25. Basic Collections");
        System.out.println();
        System.out.println("26. << Back to Tutorial Menu");
        System.out.println("=".repeat(75));
        System.out.print("Enter your choice (1-26): ");
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