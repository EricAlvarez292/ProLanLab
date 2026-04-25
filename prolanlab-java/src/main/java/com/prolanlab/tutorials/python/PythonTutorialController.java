package com.prolanlab.tutorials.python;

import com.prolanlab.tutorials.python.fundamentals.PythonFundamentals;
import com.prolanlab.tutorials.python.controlstructures.PythonControlStructures;
import com.prolanlab.tutorials.python.flowcontrol.PythonFlowControl;
import com.prolanlab.tutorials.python.classesandoop.PythonClassesAndOOP;
import com.prolanlab.tutorials.python.datastructures.PythonDataStructures;
import com.prolanlab.Main;

import java.util.Scanner;

/**
 * Python Tutorial Controller - Main controller for Python tutorials
 */
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
                // Fundamentals (1-15)
                case 1: fundamentals.showPythonIntro(); break;
                case 2: fundamentals.showPythonSyntax(); break;
                case 3: fundamentals.showPythonStatements(); break;
                case 4: fundamentals.showPythonPrintText(); break;
                case 5: fundamentals.showPythonPrintNumbers(); break;
                case 6: fundamentals.showPythonComments(); break;
                case 7: fundamentals.showPythonVariables(); break;
                case 8: fundamentals.showPythonMultipleValues(); break;
                case 9: fundamentals.showPythonOutputVariables(); break;
                case 10: fundamentals.showPythonGlobalVariables(); break;
                case 11: fundamentals.showPythonIdentifiers(); break;
                case 12: fundamentals.showPythonConstants(); break;
                case 13: fundamentals.showPythonDataTypes(); break;
                case 14: fundamentals.showPythonNumbers(); break;
                case 15: fundamentals.showPythonTypeCasting(); break;
                
                // Control Structures (16-32)
                case 16: controlStructures.showPythonOperators(); break;
                case 17: controlStructures.showPythonArithmetic(); break;
                case 18: controlStructures.showPythonAssignment(); break;
                case 19: controlStructures.showPythonComparison(); break;
                case 20: controlStructures.showPythonLogical(); break;
                case 21: controlStructures.showPythonIdentity(); break;
                case 22: controlStructures.showPythonMembership(); break;
                case 23: controlStructures.showPythonBitwise(); break;
                case 24: controlStructures.showPythonPrecedence(); break;
                case 25: controlStructures.showPythonStrings(); break;
                case 26: controlStructures.showPythonSlicing(); break;
                case 27: controlStructures.showPythonConcatenation(); break;
                case 28: controlStructures.showPythonFormatStrings(); break;
                case 29: controlStructures.showPythonEscapeChars(); break;
                case 30: controlStructures.showPythonStringMethods(); break;
                case 31: controlStructures.showPythonMath(); break;
                case 32: controlStructures.showPythonBooleans(); break;
                
                // Flow Control & Collections (33-42)
                case 33: flowControl.showPythonIfElse(); break;
                case 34: flowControl.showPythonWhileLoop(); break;
                case 35: flowControl.showPythonForLoop(); break;
                case 36: flowControl.showPythonNestedLoops(); break;
                case 37: flowControl.showPythonForEach(); break;
                case 38: flowControl.showPythonBreakContinue(); break;
                case 39: flowControl.showPythonTuples(); break;
                case 40: flowControl.showPythonLists(); break;
                case 41: flowControl.showPythonSets(); break;
                case 42: flowControl.showPythonDictionaries(); break;
                
                // Classes & OOP (43-51)
                case 43: classesAndOOP.showPythonOOP(); break;
                case 44: classesAndOOP.showPythonClassesObjects(); break;
                case 45: classesAndOOP.showPythonSelfParameter(); break;
                case 46: classesAndOOP.showPythonMethods(); break;
                case 47: classesAndOOP.showPythonProperties(); break;
                case 48: classesAndOOP.showPythonInheritance(); break;
                case 49: classesAndOOP.showPythonPolymorphism(); break;
                case 50: classesAndOOP.showPythonEncapsulation(); break;
                case 51: classesAndOOP.showPythonInnerClasses(); break;
                
                // Data Structures (52-60)
                case 52: dataStructures.showPythonListsArrays(); break;
                case 53: dataStructures.showPythonStacks(); break;
                case 54: dataStructures.showPythonQueues(); break;
                case 55: dataStructures.showPythonLinkedLists(); break;
                case 56: dataStructures.showPythonHashTables(); break;
                case 57: dataStructures.showPythonTrees(); break;
                case 58: dataStructures.showPythonBinaryTrees(); break;
                case 59: dataStructures.showPythonGraphs(); break;
                case 60: dataStructures.showPythonAlgorithms(); break;
                
                case 61:
                    System.out.println("Returning to tutorial menu...");
                    inPythonTutorial = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            
            if (inPythonTutorial && choice != 61) {
                System.out.println("\n" + "=".repeat(75));
                System.out.println("Press Enter to return to Python tutorial menu...");
                scanner.nextLine();
            }
        }
    }
    
    private void displayPythonMenu() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println("                    [P] PYTHON TUTORIAL");
        System.out.println("=".repeat(75));
        System.out.println(">> FUNDAMENTALS");
        System.out.println(" 1. Intro                  2. Syntax");
        System.out.println(" 3. Statements             4. Print Text");
        System.out.println(" 5. Print Numbers          6. Comments");
        System.out.println(" 7. Variables              8. Multiple Values");
        System.out.println(" 9. Output Variables      10. Global Variables");
        System.out.println("11. Identifiers           12. Constants");
        System.out.println("13. Data Types            14. Numbers");
        System.out.println("15. Type Casting");
        System.out.println();
        System.out.println(">> CONTROL STRUCTURES");
        System.out.println("16. Operators             17. Arithmetic");
        System.out.println("18. Assignment            19. Comparison");
        System.out.println("20. Logical               21. Identity");
        System.out.println("22. Membership            23. Bitwise");
        System.out.println("24. Precedence            25. Strings");
        System.out.println("26. Slicing               27. Concatenation");
        System.out.println("28. Format Strings        29. Escape Chars");
        System.out.println("30. String Methods        31. Math");
        System.out.println("32. Booleans");
        System.out.println();
        System.out.println(">> FLOW CONTROL & COLLECTIONS");
        System.out.println("33. If..Else              34. While Loop");
        System.out.println("35. For Loop              36. Nested Loops");
        System.out.println("37. For-Each              38. Break/Continue");
        System.out.println("39. Tuples                40. Lists");
        System.out.println("41. Sets                  42. Dictionaries");
        System.out.println();
        System.out.println(">> CLASSES & OOP");
        System.out.println("43. OOP                   44. Classes/Objects");
        System.out.println("45. Self Parameter        46. Methods");
        System.out.println("47. Properties            48. Inheritance");
        System.out.println("49. Polymorphism          50. Encapsulation");
        System.out.println("51. Inner Classes");
        System.out.println();
        System.out.println(">> DATA STRUCTURES");
        System.out.println("52. Lists and Arrays      53. Stacks");
        System.out.println("54. Queues                55. Linked Lists");
        System.out.println("56. Hash Tables           57. Trees");
        System.out.println("58. Binary Trees          59. Graphs");
        System.out.println("60. Algorithms");
        System.out.println();
        System.out.println("61. << Back to Tutorial Menu");
        System.out.println("=".repeat(75));
        System.out.print("Enter your choice (1-61): ");
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