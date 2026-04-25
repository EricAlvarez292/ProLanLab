"""
Java Tutorial Controller - Main controller for Java tutorials
"""

from prolanlab.tutorials.java.fundamentals.java_fundamentals import JavaFundamentals
from prolanlab.tutorials.java.controlstructures.java_control_structures import JavaControlStructures
from prolanlab.tutorials.java.classesandoop.java_classes_and_oop import JavaClassesAndOOP
from prolanlab.tutorials.java.datastructures.java_data_structures import JavaDataStructures


class JavaTutorialController:
    def __init__(self):
        self.fundamentals = JavaFundamentals()
        self.control_structures = JavaControlStructures()
        self.classes_and_oop = JavaClassesAndOOP()
        self.data_structures = JavaDataStructures()

    def start(self):
        in_java_tutorial = True
        
        while in_java_tutorial:
            self._display_java_menu()
            choice = self._get_user_choice()
            
            # Fundamentals (1-8)
            if choice == 1:
                self.fundamentals.show_java_intro()
            elif choice == 2:
                self.fundamentals.show_java_syntax()
            elif choice == 3:
                self.fundamentals.show_java_output()
            elif choice == 4:
                self.fundamentals.show_java_comments()
            elif choice == 5:
                self.fundamentals.show_java_variables()
            elif choice == 6:
                self.fundamentals.show_java_data_types()
            elif choice == 7:
                self.fundamentals.show_java_type_casting()
            elif choice == 8:
                self.fundamentals.show_java_operators()
                
            # Control Structures (9-16)
            elif choice == 9:
                self.control_structures.show_java_strings()
            elif choice == 10:
                self.control_structures.show_java_math()
            elif choice == 11:
                self.control_structures.show_java_booleans()
            elif choice == 12:
                self.control_structures.show_java_if_else()
            elif choice == 13:
                self.control_structures.show_java_switch()
            elif choice == 14:
                self.control_structures.show_java_while_loop()
            elif choice == 15:
                self.control_structures.show_java_for_loop()
            elif choice == 16:
                self.control_structures.show_java_break_continue()
                
            # Classes & OOP (17-27)
            elif choice == 17:
                self.classes_and_oop.show_oop_concepts()
            elif choice == 18:
                self.classes_and_oop.show_java_methods()
            elif choice == 19:
                self.classes_and_oop.show_java_constructors()
            elif choice == 20:
                self.classes_and_oop.show_method_overloading()
            elif choice == 21:
                self.classes_and_oop.show_java_inheritance()
            elif choice == 22:
                self.classes_and_oop.show_java_polymorphism()
            elif choice == 23:
                self.classes_and_oop.show_java_encapsulation()
            elif choice == 24:
                self.classes_and_oop.show_java_abstraction()
            elif choice == 25:
                self.classes_and_oop.show_java_static()
            elif choice == 26:
                self.classes_and_oop.show_java_final()
            elif choice == 27:
                self.classes_and_oop.show_java_inner_classes()
                
            # Data Structures (28-41)
            elif choice == 28:
                self.data_structures.show_data_structures_overview()
            elif choice == 29:
                self.data_structures.show_java_arrays()
            elif choice == 30:
                self.data_structures.show_java_multi_arrays()
            elif choice == 31:
                self.data_structures.show_java_arraylist()
            elif choice == 32:
                self.data_structures.show_java_hashmap()
            elif choice == 33:
                self.data_structures.show_java_hashset()
            elif choice == 34:
                self.data_structures.show_java_linkedlist()
            elif choice == 35:
                self.data_structures.show_java_stack()
            elif choice == 36:
                self.data_structures.show_java_queue()
            elif choice == 37:
                self.data_structures.show_java_tree()
            elif choice == 38:
                self.data_structures.show_java_heap()
            elif choice == 39:
                self.data_structures.show_java_graph()
            elif choice == 40:
                self.data_structures.show_algorithm_complexity()
            elif choice == 41:
                self.data_structures.show_java_collections_summary()
                
            elif choice == 42:
                print("Returning to tutorial menu...")
                in_java_tutorial = False
            else:
                print("Invalid option. Please try again.")
                
            if in_java_tutorial and choice != 42:
                print("\nPress Enter to continue...")
                input()

    def _display_java_menu(self):
        print("\n" + "=" * 75)
        print("                    [JAVA] TUTORIALS")
        print("=" * 75)
        print("\n【FUNDAMENTALS】")
        print(" 1. Java Introduction & Concepts       9. String Manipulation")
        print(" 2. Java Syntax & Structure          10. Math Operations")
        print(" 3. Output & Print Statements        11. Boolean Logic")
        print(" 4. Comments & Documentation         12. Conditional Statements (if-else)")
        print(" 5. Variables & Naming               13. Switch Statements")
        print(" 6. Data Types & Primitives          14. While Loops")
        print(" 7. Type Casting & Conversion        15. For Loops")
        print(" 8. Operators & Expressions          16. Break & Continue")
        print("\n【CLASSES & OOP】")
        print("17. Object-Oriented Programming      25. Static Members")
        print("18. Methods & Functions              26. Final Keyword")
        print("19. Constructors & Initialization    27. Inner Classes")
        print("20. Method Overloading")
        print("21. Inheritance & Extends")
        print("22. Polymorphism & Overriding")
        print("23. Encapsulation & Access Modifiers")
        print("24. Abstraction & Abstract Classes")
        print("\n【DATA STRUCTURES】")
        print("28. Data Structures Overview         35. Stack & LIFO Operations")
        print("29. Arrays & Basic Operations        36. Queue & FIFO Operations")
        print("30. Multi-dimensional Arrays        37. Tree Structures")
        print("31. ArrayList & Dynamic Arrays      38. Heap Data Structure")
        print("32. HashMap & Key-Value Storage     39. Graph Representations")
        print("33. HashSet & Unique Collections    40. Algorithm Complexity")
        print("34. LinkedList & Node-based         41. Collections Summary")
        print()
        print("42. << Back to Tutorial Menu")
        print("=" * 75)
        print("Enter your choice (1-42): ", end="")

    def _get_user_choice(self):
        try:
            choice = int(input())
            return choice
        except ValueError:
            return -1