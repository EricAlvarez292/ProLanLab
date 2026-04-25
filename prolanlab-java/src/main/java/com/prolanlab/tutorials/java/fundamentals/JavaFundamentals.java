package com.prolanlab.tutorials.java.fundamentals;

/**
 * Java Fundamentals - Basic Java programming concepts and syntax
 */
public class JavaFundamentals {
    
    /**
     * Displays Java introduction and concepts
     */
    public void showJavaIntro() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA INTRO AND CONCEPTS");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Java is a high-level, object-oriented programming language.");
        System.out.println();
        System.out.println("Key Features:");
        System.out.println("* Platform Independent (Write Once, Run Anywhere)");
        System.out.println("* Object-Oriented Programming (OOP)");
        System.out.println("* Robust and Secure");
        System.out.println("* Multithreaded");
        System.out.println("* High Performance");
        System.out.println("* Dynamic and Extensible");
        System.out.println();
        System.out.println("Java Architecture:");
        System.out.println("Source Code (.java) → Bytecode (.class) → JVM → Machine Code");
        System.out.println();
        System.out.println("Basic Java Program Structure:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class HelloWorld {               |");
        System.out.println("|     public static void main(String[] args) { |");
        System.out.println("|         System.out.println(\"Hello World!\"); |");
        System.out.println("|     }                                    |");
        System.out.println("| }                                        |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Displays Java syntax rules and structure
     */
    public void showJavaSyntax() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA SYNTAX");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Java syntax defines the rules for writing Java programs.");
        System.out.println();
        System.out.println("Basic Program Structure:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| public class MyClass {                  |");
        System.out.println("|     public static void main(String[] args) { |");
        System.out.println("|         // Your code here               |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Key Syntax Rules:");
        System.out.println("* Every statement ends with a semicolon (;)");
        System.out.println("* Code blocks are enclosed in curly braces { }");
        System.out.println("* Java is case-sensitive");
        System.out.println("* Class names should start with uppercase letter");
        System.out.println("* Method and variable names start with lowercase");
        System.out.println();
        System.out.println("Example Statements:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int age = 25;                          |");
        System.out.println("| String name = \"John\";                  |");
        System.out.println("| System.out.println(\"Hello World!\");    |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Displays Java output methods and techniques
     */
    public void showJavaOutput() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA OUTPUT");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Java provides several ways to output data to the console.");
        System.out.println();
        System.out.println("1. PRINT TEXT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| System.out.print(\"Hello\");             |");
        System.out.println("| System.out.println(\"World\");           |");
        System.out.println("| // Output: HelloWorld                  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. PRINT NUMBERS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| System.out.println(42);                |");
        System.out.println("| System.out.println(3.14);              |");
        System.out.println("| System.out.println(10 + 20);           |");
        System.out.println("| // Output: 42, 3.14, 30               |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. FORMATTED OUTPUT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| String name = \"Alice\";                 |");
        System.out.println("| int age = 25;                          |");
        System.out.println("| System.out.printf(\"Name: %s, Age: %d\", name, age); |");
        System.out.println("| // Output: Name: Alice, Age: 25        |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Key Differences:");
        System.out.println("* print() - prints without new line");
        System.out.println("* println() - prints with new line");
        System.out.println("* printf() - formatted printing");
    }
    
    /**
     * Displays Java commenting syntax and best practices
     */
    public void showJavaComments() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA COMMENTS");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Comments are used to explain code and make it more readable.");
        System.out.println("Comments are ignored by the compiler.");
        System.out.println();
        System.out.println("1. SINGLE-LINE COMMENTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // This is a single-line comment       |");
        System.out.println("| int x = 5; // Comment at end of line   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. MULTI-LINE COMMENTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| /* This is a multi-line comment        |");
        System.out.println("|    It can span multiple lines          |");
        System.out.println("|    End with star-slash */              |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. DOCUMENTATION COMMENTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| /**                                     |");
        System.out.println("| * This method calculates area           |");
        System.out.println("| * @param radius the radius of circle   |");
        System.out.println("| * @return the area                     |");
        System.out.println("| */                                      |");
        System.out.println("| public double calculateArea(double radius) { |");
        System.out.println("|     return Math.PI * radius * radius;  |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Best Practices:");
        System.out.println("* Use comments to explain WHY, not just WHAT");
        System.out.println("* Keep comments updated with code changes");
        System.out.println("* Use meaningful names to reduce need for comments");
    }
    
    /**
     * Displays Java variables declaration, assignment, and naming rules
     */
    public void showJavaVariables() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA VARIABLES");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Variables are containers for storing data values.");
        System.out.println();
        System.out.println("1. VARIABLE DECLARATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int age;              // Declaration     |");
        System.out.println("| age = 25;            // Assignment      |");
        System.out.println("| int score = 100;     // Declaration + Assignment |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. PRINT VARIABLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| String name = \"John\";                   |");
        System.out.println("| int age = 30;                          |");
        System.out.println("| System.out.println(\"Name: \" + name);    |");
        System.out.println("| System.out.println(\"Age: \" + age);      |");
        System.out.println("| // Output: Name: John, Age: 30         |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. VARIABLE IDENTIFIERS (Naming Rules):");
        System.out.println("* Must start with letter, underscore (_), or dollar sign ($)");
        System.out.println("* Cannot start with a number");
        System.out.println("* Cannot contain spaces");
        System.out.println("* Cannot use Java keywords (int, class, etc.)");
        System.out.println("* Case-sensitive (age and Age are different)");
        System.out.println();
        System.out.println("Good Examples: firstName, user_age, $price");
        System.out.println("Bad Examples: 2names, first name, class");
        System.out.println();
        System.out.println("4. CONSTANTS (Final keyword):");
        System.out.println("+-------------------------------------------+");
        System.out.println("| final int MAX_SIZE = 100;              |");
        System.out.println("| final double PI = 3.14159;             |");
        System.out.println("| // Constants cannot be changed         |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Displays Java data types - primitive and non-primitive
     */
    public void showJavaDataTypes() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(">> JAVA DATA TYPES");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Java has two categories of data types:");
        System.out.println();
        System.out.println("1. PRIMITIVE DATA TYPES:");
        System.out.println("   +---------------------------------------+");
        System.out.println("   | byte    | 8-bit  | -128 to 127     |");
        System.out.println("   | short   | 16-bit | -32,768 to 32,767 |");
        System.out.println("   | int     | 32-bit | -2^31 to 2^31-1   |");
        System.out.println("   | long    | 64-bit | -2^63 to 2^63-1   |");
        System.out.println("   | float   | 32-bit | decimal numbers  |");
        System.out.println("   | double  | 64-bit | decimal numbers  |");
        System.out.println("   | boolean | 1-bit  | true or false   |");
        System.out.println("   | char    | 16-bit | single character |");
        System.out.println("   +---------------------------------------+");
        System.out.println();
        System.out.println("2. NON-PRIMITIVE DATA TYPES:");
        System.out.println("   * String, Arrays, Classes, Interfaces");
        System.out.println();
        System.out.println("Examples:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int age = 25;                          |");
        System.out.println("| double salary = 50000.50;              |");
        System.out.println("| boolean isActive = true;               |");
        System.out.println("| char grade = 'A';                      |");
        System.out.println("| String name = \"John Doe\";              |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Displays Java type casting - widening and narrowing
     */
    public void showJavaTypeCasting() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA TYPE CASTING");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Type casting is converting one data type to another.");
        System.out.println();
        System.out.println("1. WIDENING CASTING (Automatic):");
        System.out.println("   byte -> short -> char -> int -> long -> float -> double");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int myInt = 9;                         |");
        System.out.println("| double myDouble = myInt; // 9.0        |");
        System.out.println("| System.out.println(myDouble);          |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. NARROWING CASTING (Manual):");
        System.out.println("   double -> float -> long -> int -> char -> short -> byte");
        System.out.println("+-------------------------------------------+");
        System.out.println("| double myDouble = 9.78;                |");
        System.out.println("| int myInt = (int) myDouble; // 9       |");
        System.out.println("| System.out.println(myInt);             |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. STRING CONVERSIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int x = 42;                            |");
        System.out.println("| String str = String.valueOf(x);        |");
        System.out.println("| int y = Integer.parseInt(\"123\");       |");
        System.out.println("| double z = Double.parseDouble(\"45.6\"); |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Displays Java operators - arithmetic, assignment, comparison, and logical
     */
    public void showJavaOperators() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA OPERATORS");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Operators are used to perform operations on variables and values.");
        System.out.println();
        System.out.println("1. ARITHMETIC OPERATORS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| + (addition)       5 + 3 = 8           |");
        System.out.println("| - (subtraction)    5 - 3 = 2           |");
        System.out.println("| * (multiplication) 5 * 3 = 15          |");
        System.out.println("| / (division)       5 / 2 = 2           |");
        System.out.println("| % (modulus)        5 % 2 = 1           |");
        System.out.println("| ++ (increment)     x++ or ++x          |");
        System.out.println("| -- (decrement)     x-- or --x          |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ASSIGNMENT OPERATORS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| =   (assign)       x = 5               |");
        System.out.println("| +=  (add assign)   x += 3  // x = x + 3 |");
        System.out.println("| -=  (sub assign)   x -= 2  // x = x - 2 |");
        System.out.println("| *=  (mul assign)   x *= 4  // x = x * 4 |");
        System.out.println("| /=  (div assign)   x /= 2  // x = x / 2 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. COMPARISON OPERATORS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| == (equal to)          5 == 3 (false)  |");
        System.out.println("| != (not equal)         5 != 3 (true)   |");
        System.out.println("| >  (greater than)      5 > 3  (true)   |");
        System.out.println("| <  (less than)         5 < 3  (false)  |");
        System.out.println("| >= (greater or equal)  5 >= 5 (true)   |");
        System.out.println("| <= (less or equal)     3 <= 5 (true)   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("4. LOGICAL OPERATORS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| && (AND)    true && false = false      |");
        System.out.println("| || (OR)     true || false = true       |");
        System.out.println("| !  (NOT)    !true = false              |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("5. OPERATOR PRECEDENCE (High to Low):");
        System.out.println("   1. ++ -- (postfix)  2. ++ -- + - ! (unary)");
        System.out.println("   3. * / %             4. + -");
        System.out.println("   5. < <= > >=         6. == !=");
        System.out.println("   7. &&                8. ||");
        System.out.println("   9. = += -= *= /=     (Use parentheses for clarity!)");
    }
}