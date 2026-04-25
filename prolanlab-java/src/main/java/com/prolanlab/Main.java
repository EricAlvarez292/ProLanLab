package com.prolanlab;

import java.util.Scanner;
import com.prolanlab.tutorials.TutorialModule;
import com.prolanlab.quizzes.QuizModule;
import com.prolanlab.aboutme.AboutMeModule;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TutorialModule tutorialModule = new TutorialModule();
    private static final QuizModule quizModule = new QuizModule();
    private static final AboutMeModule aboutMeModule = new AboutMeModule();
    
    public static void main(String[] args) {
        System.out.println("+======================================================+");
        System.out.println("|        Welcome to Programming Language Lab          |");
        System.out.println("|              Console Tutorial System                |");
        System.out.println("+======================================================+");
        System.out.println();
        
        boolean running = true;
        
        while (running) {
            displayMainMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                case 1:
                    tutorialModule.start();
                    break;
                case 2:
                    quizModule.start();
                    break;
                case 3:
                    aboutMeModule.start();
                    break;
                case 4:
                    System.out.println("\nThank you for using Programming Language Lab!");
                    System.out.println("Happy coding!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            
            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
    
    private static void displayMainMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("                 MAIN MENU");
        System.out.println("=".repeat(50));
        System.out.println("1. [T] Tutorial");
        System.out.println("2. [Q] Quizzes");
        System.out.println("3. [A] About Me");
        System.out.println("4. [X] Exit");
        System.out.println("=".repeat(50));
        System.out.print("Enter your choice (1-4): ");
    }
    
    private static int getUserChoice() {
        try {
            String input = scanner.nextLine().trim();
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    public static Scanner getScanner() {
        return scanner;
    }
}