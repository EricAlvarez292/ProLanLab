from prolanlab.tutorials.python.fundamentals.python_fundamentals import PythonFundamentals
from prolanlab.tutorials.python.controlstructures.python_control_structures import PythonControlStructures
from prolanlab.tutorials.python.flowcontrol.python_flow_control import PythonFlowControl
from prolanlab.tutorials.python.classesandoop.python_classes_and_oop import PythonClassesAndOOP
from prolanlab.tutorials.python.datastructures.python_data_structures import PythonDataStructures


class PythonTutorialController:
    def __init__(self):
        self.fundamentals = PythonFundamentals()
        self.control_structures = PythonControlStructures()
        self.flow_control = PythonFlowControl()
        self.classes_and_oop = PythonClassesAndOOP()
        self.data_structures = PythonDataStructures()

    def start(self):
        in_python_tutorial = True
        
        while in_python_tutorial:
            self._display_python_menu()
            choice = self._get_user_choice()
            
            # Fundamentals (1-8)
            if choice == 1:
                self.fundamentals.show_python_intro()
            elif choice == 2:
                self.fundamentals.show_python_syntax()
            elif choice == 3:
                self.fundamentals.show_python_statements()
            elif choice == 4:
                self.fundamentals.show_python_print()
            elif choice == 5:
                self.fundamentals.show_python_numbers()
            elif choice == 6:
                self.fundamentals.show_python_comments()
            elif choice == 7:
                self.fundamentals.show_python_variables()
            elif choice == 8:
                self.fundamentals.show_python_multiple_values()
                
            # Control Structures (9-16)
            elif choice == 9:
                self.control_structures.show_python_operators()
            elif choice == 10:
                self.control_structures.show_python_arithmetic()
            elif choice == 11:
                self.control_structures.show_python_comparison()
            elif choice == 12:
                self.control_structures.show_python_logical()
            elif choice == 13:
                self.control_structures.show_python_strings()
            elif choice == 14:
                self.control_structures.show_python_string_methods()
            elif choice == 15:
                self.control_structures.show_python_math_module()
            elif choice == 16:
                self.control_structures.show_python_booleans()
                
            # Flow Control & Collections (17-23)
            elif choice == 17:
                self.flow_control.show_python_conditions()
            elif choice == 18:
                self.flow_control.show_python_while()
            elif choice == 19:
                self.flow_control.show_python_for()
            elif choice == 20:
                self.flow_control.show_python_break_continue()
            elif choice == 21:
                self.flow_control.show_python_lists()
            elif choice == 22:
                self.flow_control.show_python_dictionaries()
            elif choice == 23:
                self.flow_control.show_python_tuples()
                
            # Basic OOP (24-25)
            elif choice == 24:
                self.classes_and_oop.show_python_classes()
            elif choice == 25:
                self.classes_and_oop.show_python_inheritance()
                
            elif choice == 26:
                print("Returning to tutorial menu...")
                in_python_tutorial = False
            else:
                print("Invalid option. Please try again.")
                
            if in_python_tutorial and choice != 26:
                print("\nPress Enter to continue...")
                input()

    def _display_python_menu(self):
        print("\n" + "=" * 75)
        print("                   [PYTHON] TUTORIALS (Beginner Focus)")
        print("=" * 75)
        print("\n【FUNDAMENTALS】")
        print(" 1. Python Introduction & Philosophy   5. Number Output & Formatting")
        print(" 2. Syntax & Indentation Rules         6. Comments & Documentation")
        print(" 3. Statements & Execution             7. Variables & Assignment")
        print(" 4. Print Functions                    8. Multiple Value Assignments")
        print("\n【CONTROL STRUCTURES】")
        print(" 9. Operators Overview                13. String Creation")
        print("10. Arithmetic Operations             14. String Methods")
        print("11. Comparison Operators              15. Math Module & Functions")
        print("12. Logical Operators                 16. Boolean Operations")
        print("\n【FLOW CONTROL & COLLECTIONS】")
        print("17. Conditional Statements            21. Lists & Mutable Sequences")
        print("18. While Loops & Control             22. Dictionaries & Key-Value")
        print("19. For Loops & Iteration             23. Tuples & Immutable Sequences")
        print("20. Break & Continue Statements")
        print("\n【BASIC OOP】")
        print("24. Classes & Objects                 25. Basic Inheritance")
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