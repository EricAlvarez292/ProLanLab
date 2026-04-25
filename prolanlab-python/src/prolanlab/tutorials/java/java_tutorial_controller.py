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
                
            # Control Structures (9-15)
            elif choice == 9:
                self.control_structures.show_java_strings()
            elif choice == 10:
                self.control_structures.show_java_math()
            elif choice == 11:
                self.control_structures.show_java_booleans()
            elif choice == 12:
                self.control_structures.show_java_if_else()
            elif choice == 13:
                self.control_structures.show_java_while_loop()
            elif choice == 14:
                self.control_structures.show_java_for_loop()
            elif choice == 15:
                self.control_structures.show_java_break_continue()
                
            # Basic OOP (16-22)
            elif choice == 16:
                self.classes_and_oop.show_oop_concepts()
            elif choice == 17:
                self.classes_and_oop.show_java_classes_objects()
            elif choice == 18:
                self.classes_and_oop.show_java_attributes()
            elif choice == 19:
                self.classes_and_oop.show_java_methods()
            elif choice == 20:
                self.classes_and_oop.show_java_constructors()
            elif choice == 21:
                self.classes_and_oop.show_java_inheritance()
            elif choice == 22:
                self.classes_and_oop.show_java_modifiers()
                
            # Essential Collections (23-25)
            elif choice == 23:
                self.data_structures.show_java_arrays()
            elif choice == 24:
                self.data_structures.show_java_arraylist()
            elif choice == 25:
                self.data_structures.show_java_collections_basic()
                
            elif choice == 26:
                print("Returning to tutorial menu...")
                in_java_tutorial = False
            else:
                print("Invalid option. Please try again.")
                
            if in_java_tutorial and choice != 26:
                print("\nPress Enter to continue...")
                input()

    def _display_java_menu(self):
        print("\n" + "=" * 75)
        print("                    [JAVA] TUTORIALS (Beginner Focus)")
        print("=" * 75)
        print("\n【FUNDAMENTALS】")
        print(" 1. Java Introduction & Concepts       5. Variables & Naming")
        print(" 2. Java Syntax & Structure            6. Data Types & Primitives")
        print(" 3. Output & Print Statements          7. Type Casting & Conversion")
        print(" 4. Comments & Documentation           8. Operators & Expressions")
        print("\n【CONTROL STRUCTURES】")
        print(" 9. String Manipulation               13. While Loops")
        print("10. Math Operations                   14. For Loops")
        print("11. Boolean Logic                     15. Break & Continue")
        print("12. Conditional Statements (if-else)")
        print("\n【BASIC OOP】")
        print("16. Object-Oriented Programming       20. Constructors & Initialization")
        print("17. Classes/Objects                   21. Basic Inheritance")
        print("18. Attributes                        22. Access Modifiers")
        print("19. Methods & Functions")
        print("\n【ESSENTIAL COLLECTIONS】")
        print("23. Arrays & Basic Operations         25. Basic Collections")
        print("24. ArrayList & Dynamic Arrays")
        print()
        print("26. << Back to Tutorial Menu")
        print("=" * 75)
        print("Enter your choice (1-26): ", end="")

    def _get_user_choice(self):
        try:
            choice = int(input())
            return choice
        except ValueError:
            return -1