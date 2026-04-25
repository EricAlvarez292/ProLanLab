package com.prolanlab.tutorials.python;

import com.prolanlab.tutorials.python.fundamentals.PythonFundamentals;
import com.prolanlab.tutorials.python.controlstructures.PythonControlStructures;
import com.prolanlab.tutorials.python.flowcontrol.PythonFlowControl;
import com.prolanlab.tutorials.python.classesandoop.PythonClassesAndOOP;
import com.prolanlab.tutorials.python.datastructures.PythonDataStructures;
import com.prolanlab.Main;

import java.util.Scanner;

public class PythonTutorialController {
    private final Scanner scanner = Main.getScanner();
    private final PythonFundamentals fundamentals = new PythonFundamentals();
    private final PythonControlStructures controlStructures = new PythonControlStructures();
    private final PythonFlowControl flowControl = new PythonFlowControl();
    private final PythonClassesAndOOP classesAndOOP = new PythonClassesAndOOP();
    private final PythonDataStructures dataStructures = new PythonDataStructures();
    
    public void start() {
        boolean inPythonTutorial = true;
        
        while (inPythonTutorial) {
            displayPythonMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                // Fundamentals (1-8)
                case 1: fundamentals.showPythonIntro(); break;
                case 2: fundamentals.showPythonSyntax(); break;
                case 3: fundamentals.showPythonStatements(); break;
                case 4: fundamentals.showPythonPrintText(); break;
                case 5: fundamentals.showPythonPrintNumbers(); break;
                case 6: fundamentals.showPythonComments(); break;
                case 7: fundamentals.showPythonVariables(); break;
                case 8: fundamentals.showPythonMultipleValues(); break;
                
                // Control Structures (9-16)
                case 9: controlStructures.showPythonOperators(); break;
                case 10: controlStructures.showPythonArithmetic(); break;
                case 11: controlStructures.showPythonComparison(); break;
                case 12: controlStructures.showPythonLogical(); break;
                case 13: controlStructures.showPythonStrings(); break;
                case 14: controlStructures.showPythonStringMethods(); break;
                case 15: controlStructures.showPythonMath(); break;
                case 16: controlStructures.showPythonBooleans(); break;
                
                // Flow Control & Collections (17-23)
                case 17: flowControl.showPythonIfElse(); break;
                case 18: flowControl.showPythonWhileLoop(); break;
                case 19: flowControl.showPythonForLoop(); break;
                case 20: flowControl.showPythonBreakContinue(); break;
                case 21: flowControl.showPythonLists(); break;
                case 22: flowControl.showPythonDictionaries(); break;
                case 23: flowControl.showPythonTuples(); break;
                
                // Basic OOP (24-25)
                case 24: classesAndOOP.showPythonClassesObjects(); break;
                case 25: classesAndOOP.showPythonInheritance(); break;
                
                case 26:
                    System.out.println("Returning to tutorial menu...");
                    inPythonTutorial = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            
            if (inPythonTutorial && choice != 26) {
                System.out.println("\n" + "=".repeat(75));
                System.out.println("Press Enter to return to Python tutorial menu...");
                scanner.nextLine();
            }
        }
    }
    
    private void displayPythonMenu() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println("                    [P] PYTHON TUTORIAL (Beginner Focus)");
        System.out.println("=".repeat(75));
        System.out.println(">> FUNDAMENTALS");
        System.out.println(" 1. Intro                  2. Syntax");
        System.out.println(" 3. Statements             4. Print Text");
        System.out.println(" 5. Print Numbers          6. Comments");
        System.out.println(" 7. Variables              8. Multiple Values");
        System.out.println();
        System.out.println(">> CONTROL STRUCTURES");
        System.out.println(" 9. Operators             10. Arithmetic");
        System.out.println("11. Comparison            12. Logical");
        System.out.println("13. Strings               14. String Methods");
        System.out.println("15. Math                  16. Booleans");
        System.out.println();
        System.out.println(">> FLOW CONTROL & COLLECTIONS");
        System.out.println("17. If..Else              18. While Loop");
        System.out.println("19. For Loop              20. Break/Continue");
        System.out.println("21. Lists                 22. Dictionaries");
        System.out.println("23. Tuples");
        System.out.println();
        System.out.println(">> BASIC OOP");
        System.out.println("24. Classes/Objects       25. Basic Inheritance");
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