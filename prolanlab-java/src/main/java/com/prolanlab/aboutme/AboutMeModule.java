package com.prolanlab.aboutme;

import com.prolanlab.Main;

import java.util.Scanner;

/**
 * About Me Module - Information about the Programming Language Lab
 */
public class AboutMeModule {
    private final Scanner scanner = Main.getScanner();
    
    public void start() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("[A] ABOUT PROGRAMMING LANGUAGE LAB");
        System.out.println("=".repeat(60));
        System.out.println();
        System.out.println(">> Welcome to Programming Language Lab!");
        System.out.println();
        System.out.println("This console-based tutorial system was designed to provide");
        System.out.println("comprehensive programming education in an interactive format.");
        System.out.println();
        System.out.println(">> Mission:");
        System.out.println("To make programming education accessible, engaging, and");
        System.out.println("effective through structured learning modules.");
        System.out.println();
        System.out.println(">> Features:");
        System.out.println("* Interactive Tutorials - Step-by-step learning");
        System.out.println("* Multiple Languages - Java, Python & more");
        System.out.println("* Hands-on Practice - Code examples everywhere");
        System.out.println("* Self-paced Learning - Learn at your own speed");
        System.out.println("* Console Interface - Simple and distraction-free");
        System.out.println();
        System.out.println(">> Technical Details:");
        System.out.println("* Built with Java");
        System.out.println("* Compatible with IntelliJ IDEA & VS Code");
        System.out.println("* Cross-platform console application");
        System.out.println("* Modular architecture for easy expansion");
        System.out.println();
        System.out.println(">> Learning Philosophy:");
        System.out.println("\"The best way to learn programming is by doing.\"");
        System.out.println("Each tutorial includes practical examples and");
        System.out.println("encourages hands-on coding practice.");
        System.out.println();
        System.out.println(">> Version: 1.0.0");
        System.out.println(">> Last Updated: April 2026");
        System.out.println();
        System.out.println("Happy coding and enjoy your learning journey!");
        System.out.println("               +===============+");
        System.out.println("               | [LEARN] [CODE] |");
        System.out.println("               +===============+");
    }
}