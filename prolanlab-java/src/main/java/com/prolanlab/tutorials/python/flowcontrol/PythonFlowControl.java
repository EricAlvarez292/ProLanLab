package com.prolanlab.tutorials.python.flowcontrol;

import java.util.Scanner;
import com.prolanlab.Main;

/**
 * PythonFlowControl - Flow control and collections tutorial for Python
 * Contains methods extracted from PythonTutorial.java (cases 33-42)
 * Includes if statements, loops, collections (tuples, lists, sets, dictionaries)
 */
public class PythonFlowControl {
    private final Scanner scanner = Main.getScanner();
    
    /**
     * Shows Python if-else conditional statements with examples
     */
    public void showPythonIfElse() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON IF...ELSE");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Conditional statements execute code based on conditions.");
        System.out.println();
        System.out.println("1. BASIC IF STATEMENT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| age = 18                                |");
        System.out.println("|                                         |");
        System.out.println("| if age >= 18:                           |");
        System.out.println("|     print('You can vote!')             |");
        System.out.println("|                                         |");
        System.out.println("| # Multiple statements                   |");
        System.out.println("| score = 85                              |");
        System.out.println("| if score >= 60:                        |");
        System.out.println("|     print('Congratulations!')          |");
        System.out.println("|     print('You passed!')               |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. IF-ELSE STATEMENT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| temperature = 25                        |");
        System.out.println("|                                         |");
        System.out.println("| if temperature > 30:                    |");
        System.out.println("|     print('It\\'s hot!')                 |");
        System.out.println("| else:                                   |");
        System.out.println("|     print('It\\'s not too hot')          |");
        System.out.println("|                                         |");
        System.out.println("| # Nested conditions                     |");
        System.out.println("| x = 10                                  |");
        System.out.println("| if x > 0:                               |");
        System.out.println("|     if x % 2 == 0:                      |");
        System.out.println("|         print('Positive and even')      |");
        System.out.println("|     else:                               |");
        System.out.println("|         print('Positive and odd')       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. ELIF (ELSE IF) STATEMENT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| grade = 85                              |");
        System.out.println("|                                         |");
        System.out.println("| if grade >= 90:                         |");
        System.out.println("|     letter = 'A'                        |");
        System.out.println("| elif grade >= 80:                       |");
        System.out.println("|     letter = 'B'                        |");
        System.out.println("| elif grade >= 70:                       |");
        System.out.println("|     letter = 'C'                        |");
        System.out.println("| elif grade >= 60:                       |");
        System.out.println("|     letter = 'D'                        |");
        System.out.println("| else:                                   |");
        System.out.println("|     letter = 'F'                        |");
        System.out.println("|                                         |");
        System.out.println("| print(f'Grade: {letter}')  # Grade: B  |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python while loops with examples and control statements
     */
    public void showPythonWhileLoop() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> WHILE LOOP");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("While loops repeat code as long as a condition is true.");
        System.out.println();
        System.out.println("1. BASIC WHILE LOOP:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Count from 1 to 5                     |");
        System.out.println("| count = 1                               |");
        System.out.println("| while count <= 5:                       |");
        System.out.println("|     print(count)                        |");
        System.out.println("|     count += 1                          |");
        System.out.println("|                                         |");
        System.out.println("| # Output: 1 2 3 4 5                     |");
        System.out.println("|                                         |");
        System.out.println("| # Sum numbers until limit               |");
        System.out.println("| total = 0                               |");
        System.out.println("| num = 1                                 |");
        System.out.println("| while total < 100:                      |");
        System.out.println("|     total += num                        |");
        System.out.println("|     num += 1                            |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. BREAK AND CONTINUE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Using break to exit loop              |");
        System.out.println("| count = 0                               |");
        System.out.println("| while True:                             |");
        System.out.println("|     count += 1                          |");
        System.out.println("|     if count > 3:                       |");
        System.out.println("|         break  # Exit loop              |");
        System.out.println("|     print(count)  # Prints: 1 2 3       |");
        System.out.println("|                                         |");
        System.out.println("| # Using continue to skip iteration     |");
        System.out.println("| num = 0                                 |");
        System.out.println("| while num < 5:                          |");
        System.out.println("|     num += 1                            |");
        System.out.println("|     if num % 2 == 0:                    |");
        System.out.println("|         continue  # Skip even numbers   |");
        System.out.println("|     print(num)  # Prints: 1 3 5         |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. WHILE-ELSE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # else executes when loop completes     |");
        System.out.println("| count = 0                               |");
        System.out.println("| while count < 3:                        |");
        System.out.println("|     print(f'Count: {count}')           |");
        System.out.println("|     count += 1                          |");
        System.out.println("| else:                                   |");
        System.out.println("|     print('Loop completed!')           |");
        System.out.println("|                                         |");
        System.out.println("| # else does NOT run if loop breaks      |");
        System.out.println("| while count < 10:                       |");
        System.out.println("|     if count == 5:                      |");
        System.out.println("|         break                           |");
        System.out.println("|     count += 1                          |");
        System.out.println("| else:                                   |");
        System.out.println("|     print('This will not print')       |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python for loops with examples for ranges and sequences
     */
    public void showPythonForLoop() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> FOR LOOP");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("For loops iterate over sequences (lists, strings, ranges).");
        System.out.println();
        System.out.println("1. ITERATING OVER RANGES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # range(stop)");
        System.out.println("| for i in range(5):                      |");
        System.out.println("|     print(i)  # 0, 1, 2, 3, 4          |");
        System.out.println("|                                         |");
        System.out.println("| # range(start, stop)");
        System.out.println("| for i in range(2, 6):                   |");
        System.out.println("|     print(i)  # 2, 3, 4, 5             |");
        System.out.println("|                                         |");
        System.out.println("| # range(start, stop, step)");
        System.out.println("| for i in range(0, 10, 2):               |");
        System.out.println("|     print(i)  # 0, 2, 4, 6, 8          |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ITERATING OVER SEQUENCES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Iterate over string                   |");
        System.out.println("| for char in 'Python':                   |");
        System.out.println("|     print(char)  # P y t h o n          |");
        System.out.println("|                                         |");
        System.out.println("| # Iterate over list                     |");
        System.out.println("| fruits = ['apple', 'banana', 'cherry']  |");
        System.out.println("| for fruit in fruits:                    |");
        System.out.println("|     print(fruit)                        |");
        System.out.println("|                                         |");
        System.out.println("| # Enumerate for index and value         |");
        System.out.println("| for index, fruit in enumerate(fruits):  |");
        System.out.println("|     print(f'{index}: {fruit}')         |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. NESTED LOOPS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Multiplication table                  |");
        System.out.println("| for i in range(1, 4):                   |");
        System.out.println("|     for j in range(1, 4):               |");
        System.out.println("|         print(f'{i} x {j} = {i*j}')     |");
        System.out.println("|                                         |");
        System.out.println("| # Creating a matrix                     |");
        System.out.println("| matrix = []                             |");
        System.out.println("| for i in range(3):                      |");
        System.out.println("|     row = []                            |");
        System.out.println("|     for j in range(3):                  |");
        System.out.println("|         row.append(i * j)               |");
        System.out.println("|     matrix.append(row)                  |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Shows Python nested loops with patterns and multi-dimensional operations
     */
    public void showPythonNestedLoops() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> NESTED LOOPS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Nested loops are loops inside other loops.");
        System.out.println();
        System.out.println("1. BASIC NESTED LOOPS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Print a 3x3 grid of stars             |");
        System.out.println("| for row in range(3):                    |");
        System.out.println("|     for col in range(3):                |");
        System.out.println("|         print('*', end=' ')             |");
        System.out.println("|     print()  # New line after each row  |");
        System.out.println("|                                         |");
        System.out.println("| # Output:                               |");
        System.out.println("| # * * *                                 |");
        System.out.println("| # * * *                                 |");
        System.out.println("| # * * *                                 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. MULTIPLICATION TABLE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| for i in range(1, 6):                   |");
        System.out.println("|     for j in range(1, 6):               |");
        System.out.println("|         product = i * j                 |");
        System.out.println("|         print(f'{product:3}', end=' ')  |");
        System.out.println("|     print()  # New line after each row  |");
        System.out.println("|                                         |");
        System.out.println("| # Output:                               |");
        System.out.println("| #   1   2   3   4   5                   |");
        System.out.println("| #   2   4   6   8  10                   |");
        System.out.println("| #   3   6   9  12  15                   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. SEARCHING IN 2D LIST:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]] |");
        System.out.println("| target = 5                              |");
        System.out.println("| found = False                           |");
        System.out.println("|                                         |");
        System.out.println("| for i in range(len(matrix)):             |");
        System.out.println("|     for j in range(len(matrix[i])):      |");
        System.out.println("|         if matrix[i][j] == target:       |");
        System.out.println("|             print(f'Found at ({i}, {j})') |");
        System.out.println("|             found = True                 |");
        System.out.println("|             break                        |");
        System.out.println("|     if found:                           |");
        System.out.println("|         break                           |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Shows Python for-each loops for iterating over collections
     */
    public void showPythonForEach() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> FOR-EACH LOOP");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("For-each loops iterate directly over elements in sequences.");
        System.out.println();
        System.out.println("1. ITERATING OVER LISTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| colors = ['red', 'green', 'blue']       |");
        System.out.println("|                                         |");
        System.out.println("| # Direct iteration over elements        |");
        System.out.println("| for color in colors:                    |");
        System.out.println("|     print(f'Color: {color}')           |");
        System.out.println("|                                         |");
        System.out.println("| # With enumerate for index              |");
        System.out.println("| for index, color in enumerate(colors):  |");
        System.out.println("|     print(f'{index + 1}. {color}')     |");
        System.out.println("|                                         |");
        System.out.println("| # Output:                               |");
        System.out.println("| # 1. red                                |");
        System.out.println("| # 2. green                              |");
        System.out.println("| # 3. blue                               |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ITERATING OVER DICTIONARIES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| person = {'name': 'Alice', 'age': 30}   |");
        System.out.println("|                                         |");
        System.out.println("| # Iterate over keys                     |");
        System.out.println("| for key in person:                      |");
        System.out.println("|     print(f'{key}: {person[key]}')     |");
        System.out.println("|                                         |");
        System.out.println("| # Iterate over key-value pairs          |");
        System.out.println("| for key, value in person.items():       |");
        System.out.println("|     print(f'{key}: {value}')           |");
        System.out.println("|                                         |");
        System.out.println("| # Iterate over values only              |");
        System.out.println("| for value in person.values():           |");
        System.out.println("|     print(value)                        |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. MULTIPLE SEQUENCES WITH ZIP:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| names = ['Alice', 'Bob', 'Charlie']     |");
        System.out.println("| ages = [25, 30, 35]                     |");
        System.out.println("| cities = ['NY', 'LA', 'Chicago']        |");
        System.out.println("|                                         |");
        System.out.println("| # Iterate over multiple lists together  |");
        System.out.println("| for name, age, city in zip(names, ages, cities): |");
        System.out.println("|     print(f'{name}, {age}, from {city}') |");
        System.out.println("|                                         |");
        System.out.println("| # Output:                               |");
        System.out.println("| # Alice, 25, from NY                    |");
        System.out.println("| # Bob, 30, from LA                      |");
        System.out.println("| # Charlie, 35, from Chicago             |");
        System.out.println("+-------------------------------------------+");
    }

    /**
     * Shows Python break and continue statements for loop control
     */
    public void showPythonBreakContinue() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> BREAK AND CONTINUE");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Break and continue control loop execution flow.");
        System.out.println();
        System.out.println("1. BREAK STATEMENT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Exit loop when condition met          |");
        System.out.println("| for i in range(10):                     |");
        System.out.println("|     if i == 5:                          |");
        System.out.println("|         break  # Exit loop immediately  |");
        System.out.println("|     print(i)  # Prints: 0 1 2 3 4       |");
        System.out.println("|                                         |");
        System.out.println("| # Finding first match                   |");
        System.out.println("| numbers = [1, 3, 5, 8, 9, 11]          |");
        System.out.println("| for num in numbers:                     |");
        System.out.println("|     if num % 2 == 0:                    |");
        System.out.println("|         print(f'First even: {num}')     |");
        System.out.println("|         break                           |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. CONTINUE STATEMENT:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Skip specific iterations              |");
        System.out.println("| for i in range(10):                     |");
        System.out.println("|     if i % 2 == 0:                      |");
        System.out.println("|         continue  # Skip even numbers   |");
        System.out.println("|     print(i)  # Prints: 1 3 5 7 9       |");
        System.out.println("|                                         |");
        System.out.println("| # Processing valid items only           |");
        System.out.println("| words = ['apple', '', 'banana', '', 'cherry'] |");
        System.out.println("| for word in words:                      |");
        System.out.println("|     if not word:  # Skip empty strings  |");
        System.out.println("|         continue                        |");
        System.out.println("|     print(word.upper())                 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. NESTED LOOPS WITH BREAK/CONTINUE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Break only affects innermost loop     |");
        System.out.println("| for i in range(3):                      |");
        System.out.println("|     print(f'Outer loop: {i}')          |");
        System.out.println("|     for j in range(3):                  |");
        System.out.println("|         if j == 1:                      |");
        System.out.println("|             break  # Only breaks inner loop |");
        System.out.println("|         print(f'  Inner loop: {j}')     |");
        System.out.println("|                                         |");
        System.out.println("| # Using labels (not available in Python) |");
        System.out.println("| # Use flags or functions for complex cases |");
        System.out.println("| found = False                           |");
        System.out.println("| for i in range(3):                      |");
        System.out.println("|     for j in range(3):                  |");
        System.out.println("|         if i == 1 and j == 1:           |");
        System.out.println("|             found = True                |");
        System.out.println("|             break                       |");
        System.out.println("|     if found:                           |");
        System.out.println("|         break                           |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python tuples - ordered, immutable collections
     */
    public void showPythonTuples() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON TUPLES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Tuples are ordered, immutable collections.");
        System.out.println();
        System.out.println("1. CREATING TUPLES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Using parentheses                     |");
        System.out.println("| colors = ('red', 'green', 'blue')       |");
        System.out.println("| numbers = (1, 2, 3, 4, 5)              |");
        System.out.println("|                                         |");
        System.out.println("| # Single element tuple (comma required) |");
        System.out.println("| single = (42,)  # Note the comma        |");
        System.out.println("|                                         |");
        System.out.println("| # Without parentheses (tuple packing)   |");
        System.out.println("| coordinates = 10, 20                    |");
        System.out.println("| print(type(coordinates))  # <class 'tuple'> |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ACCESSING TUPLE ELEMENTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| fruits = ('apple', 'banana', 'cherry')  |");
        System.out.println("|                                         |");
        System.out.println("| # Indexing (0-based)                    |");
        System.out.println("| print(fruits[0])    # 'apple'           |");
        System.out.println("| print(fruits[-1])   # 'cherry' (last)   |");
        System.out.println("|                                         |");
        System.out.println("| # Slicing                               |");
        System.out.println("| print(fruits[0:2])  # ('apple', 'banana') |");
        System.out.println("|                                         |");
        System.out.println("| # Tuple unpacking                       |");
        System.out.println("| first, second, third = fruits           |");
        System.out.println("| print(first)        # 'apple'           |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. TUPLE METHODS AND OPERATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| numbers = (1, 2, 2, 3, 2, 4)           |");
        System.out.println("|                                         |");
        System.out.println("| # Count occurrences                     |");
        System.out.println("| print(numbers.count(2))  # 3            |");
        System.out.println("|                                         |");
        System.out.println("| # Find index                            |");
        System.out.println("| print(numbers.index(3))  # 3            |");
        System.out.println("|                                         |");
        System.out.println("| # Length and membership                 |");
        System.out.println("| print(len(numbers))     # 6             |");
        System.out.println("| print(2 in numbers)     # True          |");
        System.out.println("| print(5 in numbers)     # False         |");
        System.out.println("|                                         |");
        System.out.println("| # Concatenation (creates new tuple)     |");
        System.out.println("| more_numbers = numbers + (5, 6)         |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python lists - ordered, mutable collections
     */
    public void showPythonLists() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON LISTS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Lists are ordered, mutable collections.");
        System.out.println();
        System.out.println("1. CREATING AND MODIFYING LISTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Creating lists                        |");
        System.out.println("| fruits = ['apple', 'banana', 'cherry']  |");
        System.out.println("| numbers = [1, 2, 3, 4, 5]              |");
        System.out.println("| mixed = ['hello', 42, True, 3.14]       |");
        System.out.println("|                                         |");
        System.out.println("| # Modifying elements                    |");
        System.out.println("| fruits[1] = 'blueberry'                 |");
        System.out.println("| print(fruits)  # ['apple', 'blueberry', 'cherry'] |");
        System.out.println("|                                         |");
        System.out.println("| # Adding elements                       |");
        System.out.println("| fruits.append('date')                   |");
        System.out.println("| fruits.insert(0, 'apricot')  # At index 0 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. LIST METHODS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| numbers = [3, 1, 4, 1, 5, 9]           |");
        System.out.println("|                                         |");
        System.out.println("| # Adding and removing                   |");
        System.out.println("| numbers.append(2)       # Add to end    |");
        System.out.println("| numbers.insert(1, 0)    # Insert at index 1 |");
        System.out.println("| numbers.remove(1)       # Remove first 1 |");
        System.out.println("| last = numbers.pop()    # Remove and return last |");
        System.out.println("|                                         |");
        System.out.println("| # Sorting and reversing                 |");
        System.out.println("| numbers.sort()          # Sort in place |");
        System.out.println("| numbers.reverse()       # Reverse in place |");
        System.out.println("|                                         |");
        System.out.println("| # Other useful methods                  |");
        System.out.println("| print(numbers.count(1))  # Count occurrences |");
        System.out.println("| print(numbers.index(4))  # Find index   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. LIST COMPREHENSIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Basic list comprehension              |");
        System.out.println("| squares = [x**2 for x in range(5)]      |");
        System.out.println("| print(squares)  # [0, 1, 4, 9, 16]     |");
        System.out.println("|                                         |");
        System.out.println("| # With condition                        |");
        System.out.println("| evens = [x for x in range(10) if x % 2 == 0] |");
        System.out.println("| print(evens)    # [0, 2, 4, 6, 8]      |");
        System.out.println("|                                         |");
        System.out.println("| # String operations                     |");
        System.out.println("| words = ['hello', 'world', 'python']    |");
        System.out.println("| upper_words = [w.upper() for w in words] |");
        System.out.println("| print(upper_words)  # ['HELLO', 'WORLD', 'PYTHON'] |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python sets - unordered collections of unique elements
     */
    public void showPythonSets() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON SETS");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Sets are unordered collections of unique elements.");
        System.out.println();
        System.out.println("1. CREATING SETS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Using curly braces                    |");
        System.out.println("| colors = {'red', 'green', 'blue'}       |");
        System.out.println("| numbers = {1, 2, 3, 4, 5}              |");
        System.out.println("|                                         |");
        System.out.println("| # From a list (duplicates removed)      |");
        System.out.println("| unique_nums = set([1, 2, 2, 3, 3, 4])   |");
        System.out.println("| print(unique_nums)  # {1, 2, 3, 4}     |");
        System.out.println("|                                         |");
        System.out.println("| # Empty set (must use set())            |");
        System.out.println("| empty_set = set()  # {} creates dict    |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. SET OPERATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| fruits = {'apple', 'banana', 'cherry'}  |");
        System.out.println("|                                         |");
        System.out.println("| # Adding and removing                   |");
        System.out.println("| fruits.add('date')                      |");
        System.out.println("| fruits.remove('banana')  # KeyError if not found |");
        System.out.println("| fruits.discard('orange') # No error if not found |");
        System.out.println("|                                         |");
        System.out.println("| # Membership testing                    |");
        System.out.println("| print('apple' in fruits)     # True    |");
        System.out.println("| print('orange' in fruits)    # False   |");
        System.out.println("|                                         |");
        System.out.println("| # Set length and clearing               |");
        System.out.println("| print(len(fruits))           # 3       |");
        System.out.println("| fruits.clear()  # Empty the set        |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. SET MATHEMATICS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| set1 = {1, 2, 3, 4}                    |");
        System.out.println("| set2 = {3, 4, 5, 6}                    |");
        System.out.println("|                                         |");
        System.out.println("| # Union (all unique elements)           |");
        System.out.println("| print(set1 | set2)  # {1, 2, 3, 4, 5, 6} |");
        System.out.println("|                                         |");
        System.out.println("| # Intersection (common elements)        |");
        System.out.println("| print(set1 & set2)  # {3, 4}           |");
        System.out.println("|                                         |");
        System.out.println("| # Difference (in set1 but not set2)     |");
        System.out.println("| print(set1 - set2)  # {1, 2}           |");
        System.out.println("|                                         |");
        System.out.println("| # Symmetric difference (not in both)    |");
        System.out.println("| print(set1 ^ set2)  # {1, 2, 5, 6}     |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Python dictionaries - collections of key-value pairs
     */
    public void showPythonDictionaries() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> PYTHON DICTIONARIES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Dictionaries store key-value pairs in an ordered collection.");
        System.out.println();
        System.out.println("1. CREATING DICTIONARIES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Using curly braces                    |");
        System.out.println("| person = {                              |");
        System.out.println("|     'name': 'Alice',                    |");
        System.out.println("|     'age': 30,                          |");
        System.out.println("|     'city': 'New York'                  |");
        System.out.println("| }                                       |");
        System.out.println("|                                         |");
        System.out.println("| # Using dict() constructor              |");
        System.out.println("| scores = dict(math=95, science=87)      |");
        System.out.println("|                                         |");
        System.out.println("| # From key-value pairs                  |");
        System.out.println("| items = dict([('a', 1), ('b', 2)])     |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ACCESSING AND MODIFYING:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| # Accessing values                      |");
        System.out.println("| print(person['name'])    # 'Alice'      |");
        System.out.println("| print(person.get('age', 0))  # 30      |");
        System.out.println("| print(person.get('height', 0))  # 0    |");
        System.out.println("|                                         |");
        System.out.println("| # Modifying values                      |");
        System.out.println("| person['age'] = 31                      |");
        System.out.println("| person['country'] = 'USA'  # Add new key |");
        System.out.println("|                                         |");
        System.out.println("| # Removing items                        |");
        System.out.println("| del person['city']                      |");
        System.out.println("| age = person.pop('age', 0)  # Remove & return |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. DICTIONARY METHODS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| student = {'name': 'Bob', 'grade': 'A'}  |");
        System.out.println("|                                         |");
        System.out.println("| # Getting keys, values, and items       |");
        System.out.println("| print(student.keys())    # dict_keys(['name', 'grade']) |");
        System.out.println("| print(student.values())  # dict_values(['Bob', 'A']) |");
        System.out.println("| print(student.items())   # dict_items([('name', 'Bob'), ('grade', 'A')]) |");
        System.out.println("|                                         |");
        System.out.println("| # Copying and clearing                  |");
        System.out.println("| student_copy = student.copy()           |");
        System.out.println("| student.clear()  # Empty the dictionary |");
        System.out.println("|                                         |");
        System.out.println("| # Checking membership                   |");
        System.out.println("| print('name' in student_copy)  # True  |");
        System.out.println("| print('Bob' in student_copy.values()) # True |");
        System.out.println("+-------------------------------------------+");
    }
}