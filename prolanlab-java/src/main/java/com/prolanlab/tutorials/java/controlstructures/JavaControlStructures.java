package com.prolanlab.tutorials.java.controlstructures;

import java.util.Scanner;
import com.prolanlab.Main;

/**
 * JavaControlStructures - Control structures tutorial for Java
 * Contains methods extracted from JavaTutorial.java (cases 9-16)
 */
public class JavaControlStructures {
    private final Scanner scanner = Main.getScanner();
    
    /**
     * Shows Java Strings tutorial
     */
    public void showJavaStrings() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA STRINGS");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Strings are sequences of characters used for storing text.");
        System.out.println();
        System.out.println("1. STRING CREATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| String txt = \"Hello World\";            |");
        System.out.println("| String name = new String(\"John\");       |");
        System.out.println("| System.out.println(txt.length()); // 11 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. STRING CONCATENATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| String first = \"Java\";                 |");
        System.out.println("| String second = \"Tutorial\";             |");
        System.out.println("| String full = first + \" \" + second;     |");
        System.out.println("| // Result: \"Java Tutorial\"             |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. NUMBERS AND STRINGS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int x = 10;                            |");
        System.out.println("| int y = 20;                            |");
        System.out.println("| String z = \"30\";                       |");
        System.out.println("| System.out.println(x + y);      // 30  |");
        System.out.println("| System.out.println(x + z);      // 1030 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("4. SPECIAL CHARACTERS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| \\n  (newline)     \\t  (tab)           |");
        System.out.println("| \\\"  (quote)       \\\\  (backslash)     |");
        System.out.println("| String txt = \"Say \\\"Hello\\\" to me\";   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("5. COMMON STRING METHODS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| txt.toUpperCase()  // HELLO WORLD      |");
        System.out.println("| txt.toLowerCase()  // hello world      |");
        System.out.println("| txt.indexOf(\"o\")   // 4 (first occurrence) |");
        System.out.println("| txt.substring(6)   // World            |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Java Math tutorial
     */
    public void showJavaMath() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA MATH");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Java Math class provides mathematical functions and constants.");
        System.out.println();
        System.out.println("1. BASIC MATH METHODS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Math.max(5, 10);     // Returns 10     |");
        System.out.println("| Math.min(5, 10);     // Returns 5      |");
        System.out.println("| Math.abs(-4.7);      // Returns 4.7    |");
        System.out.println("| Math.sqrt(64);       // Returns 8.0    |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ROUNDING METHODS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Math.ceil(4.3);      // Returns 5.0    |");
        System.out.println("| Math.floor(4.7);     // Returns 4.0    |");
        System.out.println("| Math.round(4.6);     // Returns 5      |");
        System.out.println("| Math.round(4.4);     // Returns 4      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. POWER AND TRIGONOMETRY:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Math.pow(2, 3);      // Returns 8.0    |");
        System.out.println("| Math.sin(Math.PI/2); // Returns 1.0    |");
        System.out.println("| Math.cos(0);         // Returns 1.0    |");
        System.out.println("| Math.tan(Math.PI/4); // Returns 1.0    |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("4. RANDOM NUMBERS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Math.random();           // 0.0 to 1.0 |");
        System.out.println("| (int)(Math.random() * 101); // 0 to 100 |");
        System.out.println("| (int)(Math.random() * 6) + 1; // 1 to 6 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("5. MATH CONSTANTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Math.PI;              // 3.141592...   |");
        System.out.println("| Math.E;               // 2.718281...   |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Java Booleans tutorial
     */
    public void showJavaBooleans() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA BOOLEANS");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Boolean values represent true or false conditions.");
        System.out.println();
        System.out.println("1. BOOLEAN VARIABLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| boolean isActive = true;               |");
        System.out.println("| boolean isComplete = false;            |");
        System.out.println("| System.out.println(isActive); // true  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. BOOLEAN EXPRESSIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int x = 10;                            |");
        System.out.println("| int y = 9;                             |");
        System.out.println("| System.out.println(x > y); // true     |");
        System.out.println("| System.out.println(x == y); // false   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. REAL WORLD EXAMPLE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int age = 20;                          |");
        System.out.println("| boolean canVote = (age >= 18);         |");
        System.out.println("| System.out.println(canVote); // true   |");
        System.out.println("| if (canVote) {                         |");
        System.out.println("|     System.out.println(\"Can vote!\");   |");
        System.out.println("| }                                      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("4. BOOLEAN LOGIC:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| boolean a = true;                      |");
        System.out.println("| boolean b = false;                     |");
        System.out.println("| System.out.println(a && b); // false   |");
        System.out.println("| System.out.println(a || b); // true    |");
        System.out.println("| System.out.println(!a);     // false   |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Java If-Else tutorial
     */
    public void showJavaIfElse() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(">> JAVA IF-ELSE STATEMENTS");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("If-else statements control the flow of execution based on conditions.");
        System.out.println();
        System.out.println("Syntax:");
        System.out.println("+-----------------------------------------+");
        System.out.println("| if (condition) {                        |");
        System.out.println("|     // code to execute if true         |");
        System.out.println("| } else if (anotherCondition) {         |");
        System.out.println("|     // code to execute if true         |");
        System.out.println("| } else {                                |");
        System.out.println("|     // code to execute if all false   |");
        System.out.println("| }                                       |");
        System.out.println("+-----------------------------------------+");
        System.out.println();
        System.out.println("Example:");
        System.out.println("+-----------------------------------------+");
        System.out.println("| int score = 85;                        |");
        System.out.println("|                                         |");
        System.out.println("| if (score >= 90) {                     |");
        System.out.println("|     System.out.println(\"Grade: A\");     |");
        System.out.println("| } else if (score >= 80) {              |");
        System.out.println("|     System.out.println(\"Grade: B\");     |");
        System.out.println("| } else if (score >= 70) {              |");
        System.out.println("|     System.out.println(\"Grade: C\");     |");
        System.out.println("| } else {                                |");
        System.out.println("|     System.out.println(\"Grade: F\");     |");
        System.out.println("| }                                       |");
        System.out.println("| // Output: Grade: B                    |");
        System.out.println("+-----------------------------------------+");
        System.out.println();
        System.out.println("Comparison Operators:");
        System.out.println("* == (equal to)       * != (not equal)");
        System.out.println("* >  (greater than)   * <  (less than)");
        System.out.println("* >= (greater equal)  * <= (less equal)");
    }
    
    /**
     * Shows Java Switch tutorial
     */
    public void showJavaSwitch() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA SWITCH STATEMENT");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Switch statement allows a variable to be tested against many values.");
        System.out.println();
        System.out.println("1. BASIC SWITCH STATEMENT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int day = 4;                           |");
        System.out.println("| switch (day) {                         |");
        System.out.println("|     case 1:                            |");
        System.out.println("|         System.out.println(\"Monday\");   |");
        System.out.println("|         break;                         |");
        System.out.println("|     case 2:                            |");
        System.out.println("|         System.out.println(\"Tuesday\");  |");
        System.out.println("|         break;                         |");
        System.out.println("|     case 3:                            |");
        System.out.println("|         System.out.println(\"Wednesday\");|");
        System.out.println("|         break;                         |");
        System.out.println("|     default:                           |");
        System.out.println("|         System.out.println(\"Other day\");|");
        System.out.println("| }                                      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. SWITCH WITH STRINGS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| String grade = \"A\";                    |");
        System.out.println("| switch (grade) {                       |");
        System.out.println("|     case \"A\":                          |");
        System.out.println("|         System.out.println(\"Excellent!\");|");
        System.out.println("|         break;                         |");
        System.out.println("|     case \"B\":                          |");
        System.out.println("|         System.out.println(\"Good job!\"); |");
        System.out.println("|         break;                         |");
        System.out.println("|     default:                           |");
        System.out.println("|         System.out.println(\"Try harder\");|");
        System.out.println("| }                                      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Important Notes:");
        System.out.println("* Always use 'break' to prevent fall-through");
        System.out.println("* 'default' case is optional but recommended");
        System.out.println("* Can be used with int, char, String, enum");
    }
    
    /**
     * Shows Java While Loop tutorial
     */
    public void showJavaWhileLoop() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA WHILE LOOPS");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("While loops repeat code as long as a condition is true.");
        System.out.println();
        System.out.println("1. WHILE LOOP:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int i = 0;                             |");
        System.out.println("| while (i < 5) {                       |");
        System.out.println("|     System.out.println(i);            |");
        System.out.println("|     i++;                               |");
        System.out.println("| }                                      |");
        System.out.println("| // Output: 0, 1, 2, 3, 4              |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. DO-WHILE LOOP:");
        System.out.println("   (Executes at least once, even if condition is false)");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int i = 0;                             |");
        System.out.println("| do {                                   |");
        System.out.println("|     System.out.println(\"Count: \" + i);  |");
        System.out.println("|     i++;                               |");
        System.out.println("| } while (i < 3);                      |");
        System.out.println("| // Output: Count: 0, Count: 1, Count: 2 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. PRACTICAL EXAMPLE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Scanner scanner = new Scanner(System.in);|");
        System.out.println("| String input;                          |");
        System.out.println("| do {                                   |");
        System.out.println("|     System.out.print(\"Enter 'quit': \"); |");
        System.out.println("|     input = scanner.nextLine();       |");
        System.out.println("| } while (!input.equals(\"quit\"));      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Key Differences:");
        System.out.println("* while: Tests condition before executing");
        System.out.println("* do-while: Tests condition after executing");
    }
    
    /**
     * Shows Java For Loop tutorial
     */
    public void showJavaForLoop() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA FOR LOOPS");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("For loops are used when you know how many times to repeat.");
        System.out.println();
        System.out.println("1. BASIC FOR LOOP:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| for (int i = 0; i < 5; i++) {          |");
        System.out.println("|     System.out.println(i);            |");
        System.out.println("| }                                      |");
        System.out.println("| // Output: 0, 1, 2, 3, 4              |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. NESTED LOOPS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| for (int i = 1; i <= 3; i++) {        |");
        System.out.println("|     for (int j = 1; j <= 2; j++) {    |");
        System.out.println("|         System.out.println(i + \",\" + j); |");
        System.out.println("|     }                                  |");
        System.out.println("| }                                      |");
        System.out.println("| // Output: 1,1  1,2  2,1  2,2  3,1  3,2 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. FOR-EACH LOOP (Enhanced For Loop):");
        System.out.println("+-------------------------------------------+");
        System.out.println("| String[] cars = {\"BMW\", \"Ford\", \"Mazda\"}; |");
        System.out.println("| for (String car : cars) {             |");
        System.out.println("|     System.out.println(car);          |");
        System.out.println("| }                                      |");
        System.out.println("| // Output: BMW, Ford, Mazda           |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("4. LOOP VARIATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // Count backwards                     |");
        System.out.println("| for (int i = 5; i > 0; i--) {         |");
        System.out.println("|     System.out.println(i);            |");
        System.out.println("| }                                      |");
        System.out.println("| // Step by 2                          |");
        System.out.println("| for (int i = 0; i < 10; i += 2) {     |");
        System.out.println("|     System.out.println(i);            |");
        System.out.println("| }                                      |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Java Break and Continue tutorial
     */
    public void showJavaBreakContinue() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA BREAK AND CONTINUE");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Break and continue statements control loop execution.");
        System.out.println();
        System.out.println("1. BREAK STATEMENT:");
        System.out.println("   (Exits the loop completely)");
        System.out.println("+-------------------------------------------+");
        System.out.println("| for (int i = 0; i < 10; i++) {        |");
        System.out.println("|     if (i == 4) {                     |");
        System.out.println("|         break;                         |");
        System.out.println("|     }                                  |");
        System.out.println("|     System.out.println(i);            |");
        System.out.println("| }                                      |");
        System.out.println("| // Output: 0, 1, 2, 3                 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. CONTINUE STATEMENT:");
        System.out.println("   (Skips current iteration, continues with next)");
        System.out.println("+-------------------------------------------+");
        System.out.println("| for (int i = 0; i < 10; i++) {        |");
        System.out.println("|     if (i == 4) {                     |");
        System.out.println("|         continue;                      |");
        System.out.println("|     }                                  |");
        System.out.println("|     System.out.println(i);            |");
        System.out.println("| }                                      |");
        System.out.println("| // Output: 0, 1, 2, 3, 5, 6, 7, 8, 9  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. BREAK IN WHILE LOOP:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int i = 0;                             |");
        System.out.println("| while (i < 10) {                      |");
        System.out.println("|     System.out.println(i);            |");
        System.out.println("|     i++;                               |");
        System.out.println("|     if (i == 4) {                     |");
        System.out.println("|         break;                         |");
        System.out.println("|     }                                  |");
        System.out.println("| }                                      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("4. PRACTICAL EXAMPLE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // Print only even numbers from 1-10   |");
        System.out.println("| for (int i = 1; i <= 10; i++) {       |");
        System.out.println("|     if (i % 2 != 0) {                 |");
        System.out.println("|         continue; // Skip odd numbers  |");
        System.out.println("|     }                                  |");
        System.out.println("|     System.out.println(i);            |");
        System.out.println("| }                                      |");
        System.out.println("| // Output: 2, 4, 6, 8, 10             |");
        System.out.println("+-------------------------------------------+");
    }
}