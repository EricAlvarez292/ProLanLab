package com.prolanlab.tutorials;

import com.prolanlab.tutorials.java.JavaTutorialController;
import com.prolanlab.tutorials.python.PythonTutorialController;
import com.prolanlab.Main;

import java.util.Scanner;

public class TutorialModule {
    private final Scanner scanner = Main.getScanner();
    
    public void start() {
        boolean inTutorialModule = true;
        
        while (inTutorialModule) {
            displayTutorialMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                case 1:
                    new JavaTutorialController().start();
                    break;
                case 2:
                    new PythonTutorialController().start();
                    break;
                case 3:
                    System.out.println("Returning to main menu...");
                    inTutorialModule = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            
            if (inTutorialModule && choice != 3) {
                System.out.println("\n" + "=".repeat(75));
                System.out.println("Press Enter to return to tutorial menu...");
                scanner.nextLine();
            }
        }
    }
    
    private void displayTutorialMenu() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println("                    [T] TUTORIALS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println(" 1. Java Tutorial");
        System.out.println(" 2. Python Tutorial");  
        System.out.println();
        System.out.println(" 3. << Back to Main Menu");
        System.out.println();
        System.out.println("=".repeat(75));
        System.out.print("Enter your choice (1-3): ");
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