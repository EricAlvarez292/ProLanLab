package com.prolanlab.tutorials.python.fundamentals;

import com.prolanlab.Main;
import java.util.Scanner;

/**
 * Python Fundamentals - Basic Python concepts and syntax
 */
public class PythonFundamentals {
    private final Scanner scanner = Main.getScanner();

    /**
     * Introduction to Python programming language
     */
    public void showPythonIntro() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON INTRO AND CONCEPTS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Python is a high-level, interpreted programming language.");
        System.out.println("Created by Guido van Rossum and released in 1991.");
        System.out.println();
        System.out.println("Key Features:");
        System.out.println("* Simple and readable syntax");
        System.out.println("* Interpreted (no compilation needed)");
        System.out.println("* Cross-platform compatibility");
        System.out.println("* Extensive standard library");
        System.out.println("* Dynamic typing");
        System.out.println("* Object-oriented and functional programming support");
        System.out.println();
        System.out.println("Python Philosophy (PEP 20 - The Zen of Python):");
        System.out.println("* Beautiful is better than ugly");
        System.out.println("* Explicit is better than implicit");
        System.out.println("* Simple is better than complex");
        System.out.println("* Readability counts");
        System.out.println();
        System.out.println("Basic Python Program:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Simple Hello World program           |");
        System.out.println("| print(\"Hello, World!\")                 |");
        System.out.println("|                                         |");
        System.out.println("| # No main function required!           |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Popular Uses:");
        System.out.println("* Web development (Django, Flask)");
        System.out.println("* Data science and machine learning");
        System.out.println("* Automation and scripting");
        System.out.println("* Desktop applications");
    }

    /**
     * Python syntax rules and conventions
     */
    public void showPythonSyntax() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON SYNTAX");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Python syntax is designed to be readable and concise.");
        System.out.println();
        System.out.println("1. INDENTATION (Most Important!):");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Python uses indentation for code blocks|");
        System.out.println("| if 5 > 2:                              |");
        System.out.println("|     print(\"Five is greater than two!\") |");
        System.out.println("|                                         |");
        System.out.println("| # No curly braces { } needed!          |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. BASIC SYNTAX RULES:");
        System.out.println("* Use 4 spaces for indentation (recommended)");
        System.out.println("* No semicolons needed to end statements");
        System.out.println("* Case-sensitive language");
        System.out.println("* Comments start with # symbol");
        System.out.println();
        System.out.println("3. VARIABLE DECLARATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # No need to declare variable types     |");
        System.out.println("| name = \"Alice\"                         |");
        System.out.println("| age = 25                                |");
        System.out.println("| height = 5.6                           |");
        System.out.println("| is_student = True                      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("4. PYTHON vs OTHER LANGUAGES:");
        System.out.println("* No curly braces - use indentation");
        System.out.println("* No semicolons required");
        System.out.println("* Dynamic typing - no variable declarations");
        System.out.println("* Functions and classes defined with keywords");
    }

    /**
     * Python statements and execution
     */
    public void showPythonStatements() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON STATEMENTS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Python statements are instructions that Python interpreter executes.");
        System.out.println();
        System.out.println("1. SIMPLE STATEMENTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Assignment statements                 |");
        System.out.println("| x = 10                                  |");
        System.out.println("| y = x + 5                               |");
        System.out.println("|                                         |");
        System.out.println("| # Expression statements                 |");
        System.out.println("| print(\"Hello\")                         |");
        System.out.println("| len([1, 2, 3])                         |");
        System.out.println("|                                         |");
        System.out.println("| # Import statements                     |");
        System.out.println("| import math                             |");
        System.out.println("| from datetime import date              |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. COMPOUND STATEMENTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # if statement                          |");
        System.out.println("| if x > 0:                               |");
        System.out.println("|     print(\"Positive\")                  |");
        System.out.println("|                                         |");
        System.out.println("| # for loop                              |");
        System.out.println("| for i in range(3):                      |");
        System.out.println("|     print(i)                           |");
        System.out.println("|                                         |");
        System.out.println("| # function definition                   |");
        System.out.println("| def greet(name):                        |");
        System.out.println("|     return f\"Hello, {name}!\"           |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. MULTI-LINE STATEMENTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Line continuation with \\              |");
        System.out.println("| total = 1 + 2 + 3 + \\                  |");
        System.out.println("|         4 + 5 + 6                      |");
        System.out.println("|                                         |");
        System.out.println("| # Implicit line joining                 |");
        System.out.println("| fruits = [\"apple\", \"banana\",           |");
        System.out.println("|           \"cherry\", \"date\"]            |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Printing text output in Python
     */
    public void showPythonPrintText() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON PRINT TEXT");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("The print() function displays output to the console.");
        System.out.println();
        System.out.println("1. BASIC TEXT OUTPUT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| print(\"Hello, World!\")                  |");
        System.out.println("| print('Single quotes work too')        |");
        System.out.println("| print(\"\"\"Triple quotes for             |");
        System.out.println("| multi-line text\"\"\")                    |");
        System.out.println("|                                         |");
        System.out.println("| # Output: Hello, World!                |");
        System.out.println("| # Single quotes work too               |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. PRINT WITH PARAMETERS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Multiple values                       |");
        System.out.println("| print(\"Name:\", \"Alice\", \"Age:\", 25)    |");
        System.out.println("|                                         |");
        System.out.println("| # Custom separator                      |");
        System.out.println("| print(\"A\", \"B\", \"C\", sep=\"-\")          |");
        System.out.println("|                                         |");
        System.out.println("| # Custom ending (no newline)           |");
        System.out.println("| print(\"Hello\", end=\" \")                |");
        System.out.println("| print(\"World\")  # Output: Hello World  |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Printing numbers in Python
     */
    public void showPythonPrintNumbers() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON PRINT NUMBERS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Python prints numbers directly without conversion.");
        System.out.println();
        System.out.println("1. BASIC NUMBER OUTPUT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| print(42)                               |");
        System.out.println("| print(-17)                              |");
        System.out.println("| print(3.14159)                         |");
        System.out.println("| print(2.5e6)  # Scientific notation   |");
        System.out.println("|                                         |");
        System.out.println("| # Mixed output                          |");
        System.out.println("| print(\"Age:\", 25, \"Height:\", 5.8)     |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. FORMATTED OUTPUT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # f-strings (recommended)              |");
        System.out.println("| age = 25                                |");
        System.out.println("| print(f\"I am {age} years old\")         |");
        System.out.println("|                                         |");
        System.out.println("| # Format with precision                 |");
        System.out.println("| pi = 3.14159                           |");
        System.out.println("| print(f\"Pi is {pi:.2f}\")              |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Python comments and documentation
     */
    public void showPythonComments() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON COMMENTS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Comments explain code and are ignored by Python.");
        System.out.println();
        System.out.println("1. SINGLE-LINE COMMENTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # This is a comment                     |");
        System.out.println("| print(\"Hello\")  # End-of-line comment  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. MULTI-LINE COMMENTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| \"\"\"                                     |");
        System.out.println("| Multi-line comment using               |");
        System.out.println("| triple quotes                          |");
        System.out.println("| \"\"\"                                     |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. DOCSTRINGS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| def calculate_area(radius):             |");
        System.out.println("|     \"\"\"Calculate circle area\"\"\"          |");
        System.out.println("|     return 3.14159 * radius ** 2       |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Python variables and naming
     */
    public void showPythonVariables() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON VARIABLES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Variables store data values. No declaration needed!");
        System.out.println();
        System.out.println("1. CREATING VARIABLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 5              # Integer            |");
        System.out.println("| y = \"Hello\"         # String             |");
        System.out.println("| z = 3.14           # Float              |");
        System.out.println("| is_valid = True    # Boolean            |");
        System.out.println("|                                         |");
        System.out.println("| print(type(x))     # <class 'int'>     |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. NAMING RULES:");
        System.out.println("* Start with letter or underscore");
        System.out.println("* Contain letters, numbers, underscores");
        System.out.println("* Case-sensitive (age ≠ Age)");
        System.out.println("* No Python keywords");
        System.out.println();
        System.out.println("3. EXAMPLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Good names                            |");
        System.out.println("| user_name = \"Alice\"                    |");
        System.out.println("| age2 = 25                               |");
        System.out.println("| _private = \"hidden\"                    |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Assigning multiple values to variables
     */
    public void showPythonMultipleValues() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> ASSIGN MULTIPLE VALUES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Python allows efficient multiple assignments.");
        System.out.println();
        System.out.println("1. SAME VALUE TO MULTIPLE VARIABLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = y = z = \"Orange\"                    |");
        System.out.println("| print(x, y, z)  # Orange Orange Orange |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. DIFFERENT VALUES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x, y, z = \"Apple\", \"Banana\", \"Cherry\" |");
        System.out.println("| print(x)  # Apple                      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. UNPACKING COLLECTIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| fruits = [\"apple\", \"banana\", \"cherry\"]  |");
        System.out.println("| x, y, z = fruits                        |");
        System.out.println("|                                         |");
        System.out.println("| # Swap variables easily                 |");
        System.out.println("| a, b = 10, 20                           |");
        System.out.println("| a, b = b, a  # Now a=20, b=10          |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Outputting variables using print()
     */
    public void showPythonOutputVariables() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> OUTPUT VARIABLES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Display variable values using print() function.");
        System.out.println();
        System.out.println("1. BASIC OUTPUT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| name = \"Alice\"                          |");
        System.out.println("| age = 25                                |");
        System.out.println("| print(name)                             |");
        System.out.println("| print(age)                              |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. MULTIPLE VARIABLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| print(name, age)                        |");
        System.out.println("| print(\"Name:\", name, \"Age:\", age)       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. STRING FORMATTING:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # f-strings (best practice)            |");
        System.out.println("| print(f\"My name is {name} and I am {age}\") |");
        System.out.println("|                                         |");
        System.out.println("| # .format() method                      |");
        System.out.println("| print(\"Name: {}, Age: {}\".format(name, age)) |");
        System.out.println("|                                         |");
        System.out.println("| # % formatting (older style)           |");
        System.out.println("| print(\"Name: %s, Age: %d\" % (name, age)) |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Global variables in Python
     */
    public void showPythonGlobalVariables() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> GLOBAL VARIABLES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Global variables are accessible from anywhere in the program.");
        System.out.println();
        System.out.println("1. CREATING GLOBAL VARIABLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Global variable                       |");
        System.out.println("| x = \"awesome\"                           |");
        System.out.println("|                                         |");
        System.out.println("| def my_function():                      |");
        System.out.println("|     print(\"Python is \" + x)            |");
        System.out.println("|                                         |");
        System.out.println("| my_function()  # Python is awesome     |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. THE GLOBAL KEYWORD:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = \"awesome\"                           |");
        System.out.println("|                                         |");
        System.out.println("| def change_global():                    |");
        System.out.println("|     global x                           |");
        System.out.println("|     x = \"fantastic\"                   |");
        System.out.println("|                                         |");
        System.out.println("| change_global()                         |");
        System.out.println("| print(x)  # fantastic                  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. LOCAL vs GLOBAL:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 300  # Global                       |");
        System.out.println("|                                        |");
        System.out.println("| def my_func():                         |");
        System.out.println("|     x = 200  # Local                  |");
        System.out.println("|     print(x)  # Prints 200           |");
        System.out.println("|                                        |");
        System.out.println("| my_func()                              |");
        System.out.println("| print(x)  # Prints 300               |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Python identifiers and naming rules
     */
    public void showPythonIdentifiers() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON IDENTIFIERS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Identifiers are names given to variables, functions, classes, etc.");
        System.out.println();
        System.out.println("1. IDENTIFIER RULES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Valid identifiers                    |");
        System.out.println("| myVariable = 10                        |");
        System.out.println("| _private = 'hidden'                    |");
        System.out.println("| user_name = 'Alice'                    |");
        System.out.println("| age2 = 25                              |");
        System.out.println("|                                         |");
        System.out.println("| # Invalid identifiers                  |");
        System.out.println("| # 2age = 25      # starts with digit  |");
        System.out.println("| # my-var = 5     # contains hyphen     |");
        System.out.println("| # class = 'test' # reserved keyword   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. NAMING CONVENTIONS:");
        System.out.println("* snake_case for variables and functions");
        System.out.println("* PascalCase for classes");
        System.out.println("* UPPER_CASE for constants");
        System.out.println("* _private for internal use");
        System.out.println();
        System.out.println("3. RESERVED KEYWORDS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| and, as, assert, break, class, continue|");
        System.out.println("| def, del, elif, else, except, False    |");
        System.out.println("| finally, for, from, global, if, import |");
        System.out.println("| in, is, lambda, None, not, or, pass    |");
        System.out.println("| raise, return, True, try, while, with  |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Python constants and conventions
     */
    public void showPythonConstants() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON CONSTANTS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Python doesn't have built-in constants, but we use conventions.");
        System.out.println();
        System.out.println("1. CONSTANT CONVENTIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Use UPPER_CASE for constants         |");
        System.out.println("| PI = 3.14159                           |");
        System.out.println("| MAX_SIZE = 100                         |");
        System.out.println("| DATABASE_URL = 'localhost:5432'        |");
        System.out.println("| DEFAULT_TIMEOUT = 30                   |");
        System.out.println("|                                         |");
        System.out.println("| # Constants are still mutable!         |");
        System.out.println("| PI = 2.71  # This works but shouldn't  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. BUILT-IN CONSTANTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| True      # Boolean true value         |");
        System.out.println("| False     # Boolean false value        |");
        System.out.println("| None      # Represents null/no value   |");
        System.out.println("|                                         |");
        System.out.println("| # Examples                              |");
        System.out.println("| is_valid = True                        |");
        System.out.println("| result = None                          |");
        System.out.println("| if result is None:                     |");
        System.out.println("|     print('No result')                 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. FINAL VARIABLES (Python 3.8+):");
        System.out.println("+-------------------------------------------+");
        System.out.println("| from typing import Final               |");
        System.out.println("|                                         |");
        System.out.println("| MAX_CONNECTIONS: Final = 100           |");
        System.out.println("| # Type checker will warn if modified   |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Python data types overview
     */
    public void showPythonDataTypes() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON DATA TYPES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Python has several built-in data types for different values.");
        System.out.println();
        System.out.println("1. BASIC DATA TYPES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Text Type                             |");
        System.out.println("| str: 'Hello', \"World\", '''Text'''      |");
        System.out.println("|                                         |");
        System.out.println("| # Numeric Types                         |");
        System.out.println("| int: 25, -10, 0                        |");
        System.out.println("| float: 3.14, -0.5, 2.0                |");
        System.out.println("| complex: 1+2j, 3-4j                    |");
        System.out.println("|                                         |");
        System.out.println("| # Boolean Type                          |");
        System.out.println("| bool: True, False                      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. COLLECTION TYPES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Sequence Types                        |");
        System.out.println("| list: [1, 2, 3]                        |");
        System.out.println("| tuple: (1, 2, 3)                       |");
        System.out.println("| range: range(6)                        |");
        System.out.println("|                                         |");
        System.out.println("| # Set Types                             |");
        System.out.println("| set: {1, 2, 3}                         |");
        System.out.println("| frozenset: frozenset({1, 2, 3})        |");
        System.out.println("|                                         |");
        System.out.println("| # Mapping Type                          |");
        System.out.println("| dict: {'key': 'value'}                 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. TYPE CHECKING:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 5                                   |");
        System.out.println("| print(type(x))        # <class 'int'>  |");
        System.out.println("| print(isinstance(x, int))  # True      |");
        System.out.println("|                                         |");
        System.out.println("| y = 'Hello'                            |");
        System.out.println("| print(type(y).__name__)  # str         |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Python number types and operations
     */
    public void showPythonNumbers() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON NUMBERS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Python has three numeric types: int, float, and complex.");
        System.out.println();
        System.out.println("1. INTEGER NUMBERS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 1                                   |");
        System.out.println("| y = 35656222554887711                   |");
        System.out.println("| z = -3255522                            |");
        System.out.println("|                                         |");
        System.out.println("| # Different bases                       |");
        System.out.println("| binary = 0b1010     # Binary (10)      |");
        System.out.println("| octal = 0o12        # Octal (10)        |");
        System.out.println("| hex_num = 0xA       # Hexadecimal (10) |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. FLOATING POINT NUMBERS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 1.10                                |");
        System.out.println("| y = 1.0                                 |");
        System.out.println("| z = -35.59                              |");
        System.out.println("|                                         |");
        System.out.println("| # Scientific notation                   |");
        System.out.println("| x = 35e3      # 35000.0                |");
        System.out.println("| y = 12E4      # 120000.0               |");
        System.out.println("| z = -87.7e-3  # -0.0877                |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. COMPLEX NUMBERS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 3+5j                                |");
        System.out.println("| y = 5j                                  |");
        System.out.println("| z = -5j                                 |");
        System.out.println("|                                         |");
        System.out.println("| # Access real and imaginary parts      |");
        System.out.println("| print(x.real)  # 3.0                  |");
        System.out.println("| print(x.imag)  # 5.0                  |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Python type casting and conversion
     */
    public void showPythonTypeCasting() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON TYPE CASTING");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Type casting converts one data type to another.");
        System.out.println();
        System.out.println("1. BASIC TYPE CONVERSION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # To Integer                            |");
        System.out.println("| x = int(1)      # 1                    |");
        System.out.println("| y = int(2.8)    # 2 (truncates)        |");
        System.out.println("| z = int('3')    # 3                    |");
        System.out.println("|                                         |");
        System.out.println("| # To Float                              |");
        System.out.println("| x = float(1)    # 1.0                  |");
        System.out.println("| y = float(2.8)  # 2.8                  |");
        System.out.println("| z = float('3')  # 3.0                  |");
        System.out.println("|                                         |");
        System.out.println("| # To String                             |");
        System.out.println("| x = str('s1')   # 's1'                 |");
        System.out.println("| y = str(2)      # '2'                  |");
        System.out.println("| z = str(3.0)    # '3.0'                |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ADVANCED CONVERSIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # List/Tuple conversions                |");
        System.out.println("| my_list = [1, 2, 3]                    |");
        System.out.println("| my_tuple = tuple(my_list)  # (1, 2, 3) |");
        System.out.println("| back_to_list = list(my_tuple)          |");
        System.out.println("|                                         |");
        System.out.println("| # String to list                        |");
        System.out.println("| chars = list('hello')  # ['h','e','l','l','o'] |");
        System.out.println("| words = 'a b c'.split()  # ['a','b','c'] |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. ERROR HANDLING:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| try:                                    |");
        System.out.println("|     x = int('hello')  # ValueError     |");
        System.out.println("| except ValueError:                      |");
        System.out.println("|     print('Invalid conversion')        |");
        System.out.println("+-------------------------------------------+");
    }
}