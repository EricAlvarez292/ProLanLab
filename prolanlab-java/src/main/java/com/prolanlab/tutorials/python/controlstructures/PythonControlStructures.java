package com.prolanlab.tutorials.python.controlstructures;

import java.util.Scanner;
import com.prolanlab.Main;

public class PythonControlStructures {
    private final Scanner scanner = Main.getScanner();
    
    /**
     * Shows Python Operators overview - all operator categories
     */
    public void showPythonOperators() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON OPERATORS OVERVIEW");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Operators perform operations on variables and values.");
        System.out.println();
        System.out.println("1. OPERATOR CATEGORIES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Type         | Examples                |");
        System.out.println("|--------------|-------------------------|");
        System.out.println("| Arithmetic   | +, -, *, /, //, %, **   |");
        System.out.println("| Assignment   | =, +=, -=, *=, /=       |");
        System.out.println("| Comparison   | ==, !=, <, >, <=, >=    |");
        System.out.println("| Logical      | and, or, not            |");
        System.out.println("| Identity     | is, is not              |");
        System.out.println("| Membership   | in, not in              |");
        System.out.println("| Bitwise      | &, |, ^, ~, <<, >>      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. BASIC EXAMPLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 10                                  |");
        System.out.println("| y = 3                                   |");
        System.out.println("|                                         |");
        System.out.println("| print(x + y)    # 13 (addition)        |");
        System.out.println("| print(x > y)    # True (comparison)    |");
        System.out.println("| print(x and y)  # 3 (logical)          |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Arithmetic operators with examples
     */
    public void showPythonArithmetic() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> ARITHMETIC OPERATORS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Arithmetic operators perform mathematical operations.");
        System.out.println();
        System.out.println("1. BASIC ARITHMETIC:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 15                                  |");
        System.out.println("| y = 4                                   |");
        System.out.println("|                                         |");
        System.out.println("| print(x + y)    # 19  Addition         |");
        System.out.println("| print(x - y)    # 11  Subtraction      |");
        System.out.println("| print(x * y)    # 60  Multiplication   |");
        System.out.println("| print(x / y)    # 3.75 Division        |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ADVANCED ARITHMETIC:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| print(x // y)   # 3   Floor division   |");
        System.out.println("| print(x % y)    # 3   Modulus          |");
        System.out.println("| print(x ** y)   # 50625 Exponentiation |");
        System.out.println("|                                         |");
        System.out.println("| # Negative numbers                      |");
        System.out.println("| print(-x)       # -15 Unary minus      |");
        System.out.println("| print(+x)       # 15  Unary plus       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. STRING ARITHMETIC:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # String concatenation                  |");
        System.out.println("| first = 'Hello'                        |");
        System.out.println("| last = 'World'                         |");
        System.out.println("| print(first + ' ' + last)  # Hello World |");
        System.out.println("|                                         |");
        System.out.println("| # String repetition                     |");
        System.out.println("| print('Ha' * 3)  # HaHaHa              |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Assignment operators including compound assignment
     */
    public void showPythonAssignment() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> ASSIGNMENT OPERATORS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Assignment operators assign values to variables.");
        System.out.println();
        System.out.println("1. BASIC ASSIGNMENT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 5              # Simple assignment |");
        System.out.println("| y = x              # Copy value         |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. COMPOUND ASSIGNMENT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 10                                  |");
        System.out.println("|                                         |");
        System.out.println("| x += 3     # Same as x = x + 3  (13)   |");
        System.out.println("| x -= 2     # Same as x = x - 2  (11)   |");
        System.out.println("| x *= 2     # Same as x = x * 2  (22)   |");
        System.out.println("| x /= 4     # Same as x = x / 4  (5.5)  |");
        System.out.println("| x //= 2    # Same as x = x // 2 (2.0)  |");
        System.out.println("| x %= 3     # Same as x = x % 3  (2.0)  |");
        System.out.println("| x **= 3    # Same as x = x ** 3 (8.0)  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. BITWISE ASSIGNMENT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 12     # Binary: 1100               |");
        System.out.println("|                                         |");
        System.out.println("| x &= 7     # AND: x = x & 7   (4)      |");
        System.out.println("| x |= 3     # OR:  x = x | 3   (7)      |");
        System.out.println("| x ^= 5     # XOR: x = x ^ 5   (2)      |");
        System.out.println("| x >>= 1    # Right shift: x = x >> 1 (1) |");
        System.out.println("| x <<= 2    # Left shift: x = x << 2 (4) |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Comparison operators for comparing values
     */
    public void showPythonComparison() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> COMPARISON OPERATORS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Comparison operators compare two values and return True/False.");
        System.out.println();
        System.out.println("1. BASIC COMPARISONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 5                                   |");
        System.out.println("| y = 3                                   |");
        System.out.println("|                                         |");
        System.out.println("| print(x == y)   # False (equal to)     |");
        System.out.println("| print(x != y)   # True  (not equal)    |");
        System.out.println("| print(x > y)    # True  (greater than) |");
        System.out.println("| print(x < y)    # False (less than)    |");
        System.out.println("| print(x >= y)   # True  (greater/equal) |");
        System.out.println("| print(x <= y)   # False (less/equal)   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. STRING COMPARISONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| name1 = 'Alice'                        |");
        System.out.println("| name2 = 'Bob'                          |");
        System.out.println("|                                         |");
        System.out.println("| print(name1 == name2)  # False         |");
        System.out.println("| print(name1 < name2)   # True (A < B)  |");
        System.out.println("|                                         |");
        System.out.println("| # Case-sensitive comparison             |");
        System.out.println("| print('apple' == 'Apple')  # False     |");
        System.out.println("|                                         |");
        System.out.println("| # Length comparison                     |");
        System.out.println("| print(len('cat') < len('dog'))  # False |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. CHAINED COMPARISONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 5                                   |");
        System.out.println("|                                         |");
        System.out.println("| # Multiple comparisons                  |");
        System.out.println("| print(1 < x < 10)   # True             |");
        System.out.println("| print(10 < x < 20)  # False            |");
        System.out.println("| print(x == 5 == 5)  # True             |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Logical operators for combining conditions
     */
    public void showPythonLogical() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> LOGICAL OPERATORS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Logical operators combine conditional statements.");
        System.out.println();
        System.out.println("1. BASIC LOGICAL OPERATORS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = True                                |");
        System.out.println("| y = False                               |");
        System.out.println("|                                         |");
        System.out.println("| print(x and y)    # False              |");
        System.out.println("| print(x or y)     # True               |");
        System.out.println("| print(not x)      # False              |");
        System.out.println("| print(not y)      # True               |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. LOGICAL WITH CONDITIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| age = 25                                |");
        System.out.println("| has_license = True                      |");
        System.out.println("|                                         |");
        System.out.println("| # AND: Both conditions must be true    |");
        System.out.println("| can_drive = age >= 18 and has_license  |");
        System.out.println("| print(can_drive)  # True               |");
        System.out.println("|                                         |");
        System.out.println("| # OR: At least one condition true      |");
        System.out.println("| weekend = True                          |");
        System.out.println("| holiday = False                         |");
        System.out.println("| free_day = weekend or holiday           |");
        System.out.println("| print(free_day)  # True                |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. SHORT-CIRCUIT EVALUATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # 'and' stops at first False           |");
        System.out.println("| result = False and print('Not executed') |");
        System.out.println("|                                         |");
        System.out.println("| # 'or' stops at first True             |");
        System.out.println("| result = True or print('Not executed')  |");
        System.out.println("|                                         |");
        System.out.println("| # Useful for avoiding errors           |");
        System.out.println("| x = [1, 2, 3]                          |");
        System.out.println("| if x and len(x) > 2:  # Safe check     |");
        System.out.println("|     print('List has elements')         |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Identity operators for object comparison
     */
    public void showPythonIdentity() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> IDENTITY OPERATORS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Identity operators test if two variables refer to the same object.");
        System.out.println();
        System.out.println("1. IS vs == OPERATORS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = [1, 2, 3]                          |");
        System.out.println("| y = [1, 2, 3]                          |");
        System.out.println("| z = x                                   |");
        System.out.println("|                                         |");
        System.out.println("| print(x == y)    # True  (same values) |");
        System.out.println("| print(x is y)    # False (different objects) |");
        System.out.println("| print(x is z)    # True  (same object) |");
        System.out.println("| print(x is not y) # True               |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. SPECIAL CASES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Small integers are cached             |");
        System.out.println("| a = 5                                   |");
        System.out.println("| b = 5                                   |");
        System.out.println("| print(a is b)    # True (cached)       |");
        System.out.println("|                                         |");
        System.out.println("| # Large integers are not cached         |");
        System.out.println("| c = 1000                                |");
        System.out.println("| d = 1000                                |");
        System.out.println("| print(c is d)    # False (not cached)  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. NONE COMPARISONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| result = None                           |");
        System.out.println("|                                         |");
        System.out.println("| # Correct way to check for None         |");
        System.out.println("| if result is None:                      |");
        System.out.println("|     print('No result')                 |");
        System.out.println("|                                         |");
        System.out.println("| # Avoid using == with None              |");
        System.out.println("| if result == None:  # Works but not best |");
        System.out.println("|     print('No result')                 |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Membership operators for sequence testing
     */
    public void showPythonMembership() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> MEMBERSHIP OPERATORS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Membership operators test if a value exists in a sequence.");
        System.out.println();
        System.out.println("1. IN OPERATOR:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Lists                                 |");
        System.out.println("| fruits = ['apple', 'banana', 'cherry']  |");
        System.out.println("| print('apple' in fruits)    # True     |");
        System.out.println("| print('orange' in fruits)   # False    |");
        System.out.println("|                                         |");
        System.out.println("| # Strings                               |");
        System.out.println("| text = 'Hello World'                    |");
        System.out.println("| print('Hello' in text)      # True     |");
        System.out.println("| print('hello' in text)      # False    |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. NOT IN OPERATOR:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| numbers = [1, 2, 3, 4, 5]              |");
        System.out.println("| print(6 not in numbers)     # True     |");
        System.out.println("| print(3 not in numbers)     # False    |");
        System.out.println("|                                         |");
        System.out.println("| # Useful for validation                 |");
        System.out.println("| forbidden = ['admin', 'root', 'test']   |");
        System.out.println("| username = 'alice'                      |");
        System.out.println("| if username not in forbidden:           |");
        System.out.println("|     print('Valid username')            |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. DICTIONARY MEMBERSHIP:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| person = {'name': 'Alice', 'age': 30}   |");
        System.out.println("|                                         |");
        System.out.println("| # Check keys                            |");
        System.out.println("| print('name' in person)     # True     |");
        System.out.println("| print('height' in person)   # False    |");
        System.out.println("|                                         |");
        System.out.println("| # Check values                          |");
        System.out.println("| print('Alice' in person.values()) # True |");
        System.out.println("| print(30 in person.values())      # True |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Bitwise operators for bit-level operations
     */
    public void showPythonBitwise() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> BITWISE OPERATORS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Bitwise operators work on bits and perform bit-by-bit operations.");
        System.out.println();
        System.out.println("1. BASIC BITWISE OPERATORS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| a = 12   # Binary: 1100                |");
        System.out.println("| b = 7    # Binary: 0111                |");
        System.out.println("|                                         |");
        System.out.println("| print(a & b)   # 4  (0100) AND         |");
        System.out.println("| print(a | b)   # 15 (1111) OR          |");
        System.out.println("| print(a ^ b)   # 11 (1011) XOR         |");
        System.out.println("| print(~a)      # -13     NOT           |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. SHIFT OPERATORS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = 8    # Binary: 1000                |");
        System.out.println("|                                         |");
        System.out.println("| # Left shift (multiply by 2^n)         |");
        System.out.println("| print(x << 1)  # 16 (10000)            |");
        System.out.println("| print(x << 2)  # 32 (100000)           |");
        System.out.println("|                                         |");
        System.out.println("| # Right shift (divide by 2^n)          |");
        System.out.println("| print(x >> 1)  # 4  (100)              |");
        System.out.println("| print(x >> 2)  # 2  (10)               |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. PRACTICAL USES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Check if number is even               |");
        System.out.println("| def is_even(n):                         |");
        System.out.println("|     return (n & 1) == 0                |");
        System.out.println("|                                         |");
        System.out.println("| # Fast multiplication/division by 2     |");
        System.out.println("| multiply_by_2 = lambda x: x << 1        |");
        System.out.println("| divide_by_2 = lambda x: x >> 1          |");
        System.out.println("|                                         |");
        System.out.println("| # Toggle bit (XOR with 1)               |");
        System.out.println("| toggle_bit = lambda x, pos: x ^ (1 << pos) |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Operator precedence and evaluation order
     */
    public void showPythonPrecedence() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> OPERATOR PRECEDENCE");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Operator precedence determines the order of evaluation.");
        System.out.println();
        System.out.println("1. PRECEDENCE ORDER (HIGH to LOW):");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1. ()           # Parentheses           |");
        System.out.println("| 2. **           # Exponentiation        |");
        System.out.println("| 3. +x, -x, ~x   # Unary operators       |");
        System.out.println("| 4. *, /, //, %  # Multiplication/Division |");
        System.out.println("| 5. +, -         # Addition/Subtraction  |");
        System.out.println("| 6. <<, >>       # Bit shifts            |");
        System.out.println("| 7. &            # Bitwise AND           |");
        System.out.println("| 8. ^            # Bitwise XOR           |");
        System.out.println("| 9. |            # Bitwise OR            |");
        System.out.println("|10. ==, !=, <, > # Comparisons           |");
        System.out.println("|11. is, is not   # Identity              |");
        System.out.println("|12. in, not in   # Membership            |");
        System.out.println("|13. not          # Logical NOT           |");
        System.out.println("|14. and          # Logical AND           |");
        System.out.println("|15. or           # Logical OR            |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. EXAMPLES WITHOUT PARENTHESES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| result = 2 + 3 * 4        # 14 (not 20) |");
        System.out.println("| result = 2 ** 3 ** 2      # 512 (not 64) |");
        System.out.println("| result = 10 > 5 and 3 < 7 # True        |");
        System.out.println("| result = not False or True # True       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. USING PARENTHESES FOR CLARITY:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Make intentions clear                 |");
        System.out.println("| result = (2 + 3) * 4      # 20          |");
        System.out.println("| result = 2 ** (3 ** 2)    # 512         |");
        System.out.println("| result = (2 ** 3) ** 2    # 64          |");
        System.out.println("|                                         |");
        System.out.println("| # Complex expressions                   |");
        System.out.println("| age = 25                                |");
        System.out.println("| valid = (age >= 18) and (age <= 65)    |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Strings creation, indexing, and methods
     */
    public void showPythonStrings() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON STRINGS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Strings are sequences of characters enclosed in quotes.");
        System.out.println();
        System.out.println("1. STRING CREATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Single quotes                         |");
        System.out.println("| name = 'Alice'                          |");
        System.out.println("|                                         |");
        System.out.println("| # Double quotes                         |");
        System.out.println("| message = \"Hello World\"                  |");
        System.out.println("|                                         |");
        System.out.println("| # Triple quotes (multiline)             |");
        System.out.println("| text = '''This is                       |");
        System.out.println("|        a multiline                      |");
        System.out.println("|        string'''                        |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. STRING INDEXING:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| text = 'Python'                         |");
        System.out.println("|                                         |");
        System.out.println("| print(text[0])     # 'P' (first char)  |");
        System.out.println("| print(text[-1])    # 'n' (last char)   |");
        System.out.println("| print(text[1:4])   # 'yth' (slicing)   |");
        System.out.println("| print(text[:3])    # 'Pyt' (start to 3) |");
        System.out.println("| print(text[2:])    # 'thon' (2 to end) |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. STRING METHODS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| text = 'Hello World'                    |");
        System.out.println("|                                         |");
        System.out.println("| print(text.upper())     # HELLO WORLD  |");
        System.out.println("| print(text.lower())     # hello world  |");
        System.out.println("| print(text.title())     # Hello World  |");
        System.out.println("| print(text.replace('World', 'Python'))  |");
        System.out.println("| print(text.split())     # ['Hello', 'World'] |");
        System.out.println("| print(len(text))        # 11 (length)   |");
        System.out.println("|                                         |");
        System.out.println("| # String formatting                     |");
        System.out.println("| name = 'Alice'                          |");
        System.out.println("| age = 30                                |");
        System.out.println("| print(f'Name: {name}, Age: {age}')     |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python String slicing with start:end:step syntax
     */
    public void showPythonSlicing() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> STRING SLICING");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Slicing extracts parts of a string using [start:end:step].");
        System.out.println();
        System.out.println("1. BASIC SLICING:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| text = 'Programming'                    |");
        System.out.println("|                                         |");
        System.out.println("| # [start:end] - end is exclusive        |");
        System.out.println("| print(text[0:4])   # 'Prog'            |");
        System.out.println("| print(text[4:8])   # 'ramm'            |");
        System.out.println("| print(text[-3:])   # 'ing' (last 3)    |");
        System.out.println("|                                         |");
        System.out.println("| # Omitting start or end                 |");
        System.out.println("| print(text[:4])    # 'Prog' (from start) |");
        System.out.println("| print(text[4:])    # 'ramming' (to end) |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. STEP SLICING:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| text = 'abcdefghijk'                    |");
        System.out.println("|                                         |");
        System.out.println("| # [start:end:step]                      |");
        System.out.println("| print(text[::2])   # 'acegik' (every 2nd) |");
        System.out.println("| print(text[1::2])  # 'bdfhj' (every 2nd from 1) |");
        System.out.println("| print(text[::-1])  # 'kjihgfedcba' (reverse) |");
        System.out.println("| print(text[2:8:2]) # 'ceg' (2 to 8, step 2) |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. PRACTICAL EXAMPLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Extract file extension                |");
        System.out.println("| filename = 'document.pdf'               |");
        System.out.println("| extension = filename[-3:]  # 'pdf'     |");
        System.out.println("|                                         |");
        System.out.println("| # Get first and last name              |");
        System.out.println("| full_name = 'John Doe'                 |");
        System.out.println("| space_pos = full_name.find(' ')        |");
        System.out.println("| first = full_name[:space_pos]  # 'John' |");
        System.out.println("| last = full_name[space_pos+1:]  # 'Doe' |");
        System.out.println("|                                         |");
        System.out.println("| # Reverse a string                      |");
        System.out.println("| word = 'hello'                         |");
        System.out.println("| reversed_word = word[::-1]  # 'olleh'  |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python String concatenation methods and performance tips
     */
    public void showPythonConcatenation() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> STRING CONCATENATION");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Concatenation combines multiple strings into one.");
        System.out.println();
        System.out.println("1. BASIC CONCATENATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Using + operator                      |");
        System.out.println("| first = 'Hello'                         |");
        System.out.println("| last = 'World'                          |");
        System.out.println("| message = first + ' ' + last            |");
        System.out.println("| print(message)  # 'Hello World'        |");
        System.out.println("|                                         |");
        System.out.println("| # Using += operator                     |");
        System.out.println("| greeting = 'Hello'                      |");
        System.out.println("| greeting += ' World'                    |");
        System.out.println("| print(greeting)  # 'Hello World'       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. JOIN METHOD:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Joining a list of strings             |");
        System.out.println("| words = ['Python', 'is', 'awesome']     |");
        System.out.println("| sentence = ' '.join(words)              |");
        System.out.println("| print(sentence)  # 'Python is awesome' |");
        System.out.println("|                                         |");
        System.out.println("| # Different separators                  |");
        System.out.println("| items = ['apple', 'banana', 'cherry']   |");
        System.out.println("| print(', '.join(items))  # 'apple, banana, cherry' |");
        System.out.println("| print('-'.join(items))   # 'apple-banana-cherry' |");
        System.out.println("| print(''.join(items))    # 'applebananacherry' |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. PERFORMANCE CONSIDERATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Inefficient way (creates new strings) |");
        System.out.println("| result = ''                             |");
        System.out.println("| for i in range(5):                      |");
        System.out.println("|     result += str(i)  # Slow for many  |");
        System.out.println("|                                         |");
        System.out.println("| # Efficient way (using join)            |");
        System.out.println("| numbers = [str(i) for i in range(5)]    |");
        System.out.println("| result = ''.join(numbers)  # Fast       |");
        System.out.println("|                                         |");
        System.out.println("| # Using list and join for building     |");
        System.out.println("| parts = []                              |");
        System.out.println("| for i in range(5):                      |");
        System.out.println("|     parts.append(str(i))               |");
        System.out.println("| result = ''.join(parts)                 |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Format strings including f-strings and .format()
     */
    public void showPythonFormatStrings() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> FORMAT STRINGS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Format strings allow inserting variables into strings.");
        System.out.println();
        System.out.println("1. F-STRINGS (RECOMMENDED):");
        System.out.println("+-------------------------------------------+");
        System.out.println("| name = 'Alice'                          |");
        System.out.println("| age = 30                                |");
        System.out.println("| score = 95.5                            |");
        System.out.println("|                                         |");
        System.out.println("| # Basic f-string                        |");
        System.out.println("| msg = f'Hello {name}!'                  |");
        System.out.println("| print(msg)  # 'Hello Alice!'           |");
        System.out.println("|                                         |");
        System.out.println("| # Multiple variables                    |");
        System.out.println("| info = f'{name} is {age} years old'     |");
        System.out.println("| print(info)                             |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. F-STRING FORMATTING:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Number formatting                     |");
        System.out.println("| price = 19.99                           |");
        System.out.println("| print(f'Price: ${price:.2f}')  # $19.99 |");
        System.out.println("|                                         |");
        System.out.println("| # Padding and alignment                 |");
        System.out.println("| name = 'Alice'                          |");
        System.out.println("| print(f'{name:>10}')   # '     Alice'  |");
        System.out.println("| print(f'{name:<10}')   # 'Alice     '  |");
        System.out.println("| print(f'{name:^10}')   # '  Alice   '  |");
        System.out.println("|                                         |");
        System.out.println("| # Expressions in f-strings              |");
        System.out.println("| x = 5                                   |");
        System.out.println("| y = 3                                   |");
        System.out.println("| print(f'{x} + {y} = {x + y}')  # 5 + 3 = 8 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. OTHER FORMATTING METHODS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # .format() method                      |");
        System.out.println("| template = 'Hello {}!'                  |");
        System.out.println("| msg = template.format('Bob')            |");
        System.out.println("| print(msg)  # 'Hello Bob!'             |");
        System.out.println("|                                         |");
        System.out.println("| # Named placeholders                    |");
        System.out.println("| template = 'Name: {name}, Age: {age}'   |");
        System.out.println("| msg = template.format(name='Carol', age=25) |");
        System.out.println("|                                         |");
        System.out.println("| # % formatting (older style)            |");
        System.out.println("| msg = 'Hello %s!' % 'Dave'             |");
        System.out.println("| print(msg)  # 'Hello Dave!'            |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Escape characters and raw strings
     */
    public void showPythonEscapeChars() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> ESCAPE CHARACTERS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Escape characters represent special characters using backslash.");
        System.out.println();
        System.out.println("1. COMMON ESCAPE SEQUENCES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| \\n     # Newline (line break)          |");
        System.out.println("| \\t     # Tab character                 |");
        System.out.println("| \\r     # Carriage return               |");
        System.out.println("| \\\\     # Backslash literal             |");
        System.out.println("| \\'     # Single quote                  |");
        System.out.println("| \\\"     # Double quote                  |");
        System.out.println("| \\0     # Null character                |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. PRACTICAL EXAMPLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Newlines and tabs                     |");
        System.out.println("| text = 'Hello\\nWorld\\tPython'          |");
        System.out.println("| print(text)                             |");
        System.out.println("| # Output:                               |");
        System.out.println("| # Hello                                 |");
        System.out.println("| # World    Python                       |");
        System.out.println("|                                         |");
        System.out.println("| # Quotes in strings                     |");
        System.out.println("| quote = 'She said \"Hello\"'             |");
        System.out.println("| path = 'C:\\\\Users\\\\Alice\\\\Documents'    |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. RAW STRINGS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Raw strings ignore escape characters  |");
        System.out.println("| regular = 'C:\\\\Users\\\\Alice'            |");
        System.out.println("| raw_string = r'C:\\Users\\Alice'         |");
        System.out.println("|                                         |");
        System.out.println("| print(regular)    # C:\\Users\\Alice      |");
        System.out.println("| print(raw_string) # C:\\Users\\Alice      |");
        System.out.println("|                                         |");
        System.out.println("| # Useful for regex patterns             |");
        System.out.println("| import re                               |");
        System.out.println("| pattern = r'\\d+\\.\\d+'  # Match decimals  |");
        System.out.println("| text = 'Price: 19.99'                   |");
        System.out.println("| match = re.search(pattern, text)        |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python String methods for manipulation and analysis
     */
    public void showPythonStringMethods() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> STRING METHODS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Python strings have many built-in methods for manipulation.");
        System.out.println();
        System.out.println("1. CASE METHODS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| text = 'Hello World'                    |");
        System.out.println("|                                         |");
        System.out.println("| print(text.upper())     # HELLO WORLD  |");
        System.out.println("| print(text.lower())     # hello world  |");
        System.out.println("| print(text.title())     # Hello World  |");
        System.out.println("| print(text.capitalize()) # Hello world |");
        System.out.println("| print(text.swapcase())  # hELLO wORLD  |");
        System.out.println("|                                         |");
        System.out.println("| # Case checking                         |");
        System.out.println("| print(text.isupper())   # False        |");
        System.out.println("| print(text.islower())   # False        |");
        System.out.println("| print(text.istitle())   # True         |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. SEARCH AND REPLACE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| text = 'Python Programming'             |");
        System.out.println("|                                         |");
        System.out.println("| # Finding substrings                    |");
        System.out.println("| print(text.find('Programming'))  # 7   |");
        System.out.println("| print(text.find('Java'))         # -1  |");
        System.out.println("| print(text.index('Python'))      # 0   |");
        System.out.println("| print(text.count('o'))           # 2   |");
        System.out.println("|                                         |");
        System.out.println("| # Replacing                             |");
        System.out.println("| new_text = text.replace('Python', 'Java') |");
        System.out.println("| print(new_text)  # Java Programming    |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. SPLITTING AND JOINING:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Splitting strings                     |");
        System.out.println("| sentence = 'apple,banana,cherry'        |");
        System.out.println("| fruits = sentence.split(',')            |");
        System.out.println("| print(fruits)  # ['apple', 'banana', 'cherry'] |");
        System.out.println("|                                         |");
        System.out.println("| # Whitespace handling                   |");
        System.out.println("| text = '  Hello World  '                |");
        System.out.println("| print(text.strip())     # 'Hello World' |");
        System.out.println("| print(text.lstrip())    # 'Hello World  ' |");
        System.out.println("| print(text.rstrip())    # '  Hello World' |");
        System.out.println("|                                         |");
        System.out.println("| # Checking string content               |");
        System.out.println("| print('123'.isdigit())      # True     |");
        System.out.println("| print('abc'.isalpha())      # True     |");
        System.out.println("| print('abc123'.isalnum())   # True     |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Math functions and the math module
     */
    public void showPythonMath() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON MATH");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Python provides built-in math functions and the math module.");
        System.out.println();
        System.out.println("1. BUILT-IN FUNCTIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| x = -5.7                                |");
        System.out.println("|                                         |");
        System.out.println("| print(abs(x))       # 5.7 (absolute)  |");
        System.out.println("| print(round(x))     # -6 (rounded)     |");
        System.out.println("| print(round(x, 1))  # -5.7 (1 decimal) |");
        System.out.println("| print(min(1,2,3))   # 1 (minimum)      |");
        System.out.println("| print(max(1,2,3))   # 3 (maximum)      |");
        System.out.println("| print(sum([1,2,3])) # 6 (sum of list)  |");
        System.out.println("| print(pow(2, 3))    # 8 (power)        |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. MATH MODULE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| import math                             |");
        System.out.println("|                                         |");
        System.out.println("| # Constants                             |");
        System.out.println("| print(math.pi)      # 3.141592...      |");
        System.out.println("| print(math.e)       # 2.718281...      |");
        System.out.println("|                                         |");
        System.out.println("| # Functions                             |");
        System.out.println("| print(math.sqrt(16))    # 4.0          |");
        System.out.println("| print(math.ceil(4.3))   # 5 (ceiling)  |");
        System.out.println("| print(math.floor(4.7))  # 4 (floor)    |");
        System.out.println("| print(math.factorial(5)) # 120         |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. TRIGONOMETRY & LOGARITHMS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Trigonometric functions               |");
        System.out.println("| angle = math.pi / 4  # 45 degrees      |");
        System.out.println("| print(math.sin(angle))   # 0.707...    |");
        System.out.println("| print(math.cos(angle))   # 0.707...    |");
        System.out.println("| print(math.tan(angle))   # 1.0         |");
        System.out.println("|                                         |");
        System.out.println("| # Logarithms                            |");
        System.out.println("| print(math.log(math.e))  # 1.0 (ln)    |");
        System.out.println("| print(math.log10(100))   # 2.0 (log10) |");
        System.out.println("| print(math.log2(8))      # 3.0 (log2)  |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python Boolean values, truthy/falsy values, and usage
     */
    public void showPythonBooleans() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON BOOLEANS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Booleans represent True or False values in logical operations.");
        System.out.println();
        System.out.println("1. BOOLEAN VALUES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Direct assignment                     |");
        System.out.println("| is_student = True                       |");
        System.out.println("| is_adult = False                        |");
        System.out.println("|                                         |");
        System.out.println("| # From comparisons                      |");
        System.out.println("| age = 18                                |");
        System.out.println("| can_vote = age >= 18    # True          |");
        System.out.println("| is_minor = age < 18     # False         |");
        System.out.println("|                                         |");
        System.out.println("| # Type checking                         |");
        System.out.println("| print(type(True))       # <class 'bool'> |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. TRUTHY AND FALSY VALUES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Falsy values (evaluate to False)     |");
        System.out.println("| print(bool(0))          # False        |");
        System.out.println("| print(bool(''))         # False (empty) |");
        System.out.println("| print(bool([]))         # False (empty) |");
        System.out.println("| print(bool(None))       # False        |");
        System.out.println("|                                         |");
        System.out.println("| # Truthy values (evaluate to True)     |");
        System.out.println("| print(bool(1))          # True         |");
        System.out.println("| print(bool('hello'))    # True          |");
        System.out.println("| print(bool([1, 2]))     # True          |");
        System.out.println("| print(bool(-5))         # True (non-zero) |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. BOOLEAN IN CONDITIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Using booleans in if statements       |");
        System.out.println("| logged_in = True                        |");
        System.out.println("| if logged_in:                           |");
        System.out.println("|     print('Welcome back!')             |");
        System.out.println("|                                         |");
        System.out.println("| # Boolean functions                     |");
        System.out.println("| def is_even(number):                    |");
        System.out.println("|     return number % 2 == 0              |");
        System.out.println("|                                         |");
        System.out.println("| print(is_even(4))       # True         |");
        System.out.println("| print(is_even(5))       # False        |");
        System.out.println("|                                         |");
        System.out.println("| # Multiple conditions                   |");
        System.out.println("| score = 85                              |");
        System.out.println("| passed = score >= 60 and score <= 100  |");
        System.out.println("| print(passed)           # True         |");
        System.out.println("+-------------------------------------------+");
    }
}