"""
Python Tutorial Controller - Main controller for Python tutorials
"""

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
            
            # Fundamentals (1-15)
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
            elif choice == 9:
                self.fundamentals.show_python_output_variables()
            elif choice == 10:
                self.fundamentals.show_python_global_local()
            elif choice == 11:
                self.fundamentals.show_python_identifiers()
            elif choice == 12:
                self.fundamentals.show_python_constants()
            elif choice == 13:
                self.fundamentals.show_python_data_types()
            elif choice == 14:
                self.fundamentals.show_python_number_types()
            elif choice == 15:
                self.fundamentals.show_python_type_casting()
                
            # Control Structures (16-32)
            elif choice == 16:
                self.control_structures.show_python_operators()
            elif choice == 17:
                self.control_structures.show_python_arithmetic()
            elif choice == 18:
                self.control_structures.show_python_assignment()
            elif choice == 19:
                self.control_structures.show_python_comparison()
            elif choice == 20:
                self.control_structures.show_python_logical()
            elif choice == 21:
                self.control_structures.show_python_identity()
            elif choice == 22:
                self.control_structures.show_python_membership()
            elif choice == 23:
                self.control_structures.show_python_bitwise()
            elif choice == 24:
                self.control_structures.show_python_precedence()
            elif choice == 25:
                self.control_structures.show_python_strings()
            elif choice == 26:
                self.control_structures.show_python_slicing()
            elif choice == 27:
                self.control_structures.show_python_concatenation()
            elif choice == 28:
                self.control_structures.show_python_format_strings()
            elif choice == 29:
                self.control_structures.show_python_escape_chars()
            elif choice == 30:
                self.control_structures.show_python_string_methods()
            elif choice == 31:
                self.control_structures.show_python_math_module()
            elif choice == 32:
                self.control_structures.show_python_booleans()
                
            # Flow Control (33-42)
            elif choice == 33:
                self.flow_control.show_python_conditions()
            elif choice == 34:
                self.flow_control.show_python_while()
            elif choice == 35:
                self.flow_control.show_python_for()
            elif choice == 36:
                self.flow_control.show_python_nested_loops()
            elif choice == 37:
                self.flow_control.show_python_for_each()
            elif choice == 38:
                self.flow_control.show_python_break_continue()
            elif choice == 39:
                self.flow_control.show_python_tuples()
            elif choice == 40:
                self.flow_control.show_python_lists()
            elif choice == 41:
                self.flow_control.show_python_sets()
            elif choice == 42:
                self.flow_control.show_python_dictionaries()
                
            # Classes & OOP (43-51)
            elif choice == 43:
                self.classes_and_oop.show_oop_principles()
            elif choice == 44:
                self.classes_and_oop.show_python_classes()
            elif choice == 45:
                self.classes_and_oop.show_python_self()
            elif choice == 46:
                self.classes_and_oop.show_python_methods()
            elif choice == 47:
                self.classes_and_oop.show_python_properties()
            elif choice == 48:
                self.classes_and_oop.show_python_inheritance()
            elif choice == 49:
                self.classes_and_oop.show_python_polymorphism()
            elif choice == 50:
                self.classes_and_oop.show_python_encapsulation()
            elif choice == 51:
                self.classes_and_oop.show_python_nested_classes()
                
            # Advanced & Collections (52-61)
            elif choice == 52:
                self.data_structures.show_python_list_advanced()
            elif choice == 53:
                self.data_structures.show_python_dict_advanced()
            elif choice == 54:
                self.data_structures.show_python_set_advanced()
            elif choice == 55:
                self.data_structures.show_python_tuple_advanced()
            elif choice == 56:
                self.data_structures.show_python_comprehensions()
            elif choice == 57:
                self.data_structures.show_python_generators()
            elif choice == 58:
                self.data_structures.show_python_iterators()
            elif choice == 59:
                self.data_structures.show_python_decorators()
            elif choice == 60:
                self.data_structures.show_python_error_handling()
            elif choice == 61:
                self.data_structures.show_python_modules()
                
            elif choice == 62:
                print("Returning to tutorial menu...")
                in_python_tutorial = False
            else:
                print("Invalid option. Please try again.")
                
            if in_python_tutorial and choice != 62:
                print("\nPress Enter to continue...")
                input()

    def _display_python_menu(self):
        print("\n" + "=" * 75)
        print("                   [PYTHON] TUTORIALS")
        print("=" * 75)
        print("\n【FUNDAMENTALS】")
        print(" 1. Python Introduction & Philosophy   9. Variable Output Techniques")
        print(" 2. Syntax & Indentation Rules        10. Global vs Local Scope")
        print(" 3. Statements & Execution            11. Identifiers & Naming")
        print(" 4. Print Functions                   12. Constants & Immutability")
        print(" 5. Number Output & Formatting        13. Data Types Overview")
        print(" 6. Comments & Documentation          14. Number Types (int, float)")
        print(" 7. Variables & Assignment            15. Type Casting & Conversion")
        print(" 8. Multiple Value Assignments")
        print("\n【CONTROL STRUCTURES】")
        print("16. Operators Overview               25. String Creation")
        print("17. Arithmetic Operations            26. String Slicing")
        print("18. Assignment Operators             27. String Concatenation")
        print("19. Comparison Operators             28. Format Strings (f-strings)")
        print("20. Logical Operators                29. Escape Characters")
        print("21. Identity Operators               30. String Methods")
        print("22. Membership Operators             31. Math Module & Functions")
        print("23. Bitwise Operations               32. Boolean Operations")
        print("24. Operator Precedence")
        print("\n【FLOW CONTROL & COLLECTIONS】")
        print("33. Conditional Statements           39. Tuples & Immutable Sequences")
        print("34. While Loops & Control            40. Lists & Mutable Sequences")
        print("35. For Loops & Iteration            41. Sets & Unique Collections")
        print("36. Nested Loop Structures           42. Dictionaries & Key-Value")
        print("37. For-each Loop Patterns")
        print("38. Break & Continue Statements")
        print("\n【CLASSES & OOP】")
        print("43. OOP Principles                   48. Inheritance & super()")
        print("44. Classes & Objects               49. Polymorphism & Duck Typing")
        print("45. Self Parameter                  50. Encapsulation & Private")
        print("46. Methods (instance, class)       51. Inner/Nested Classes")
        print("47. Properties & Decorators")
        print("\n【ADVANCED TOPICS】")
        print("52. Advanced Lists                  58. Iterators & Protocols")
        print("53. Advanced Dictionaries           59. Decorators & Functions")
        print("54. Advanced Sets                   60. Error Handling & Exceptions")
        print("55. Advanced Tuples                 61. Modules & Packages")
        print("56. List/Dict Comprehensions")
        print("57. Generators & yield")
        print()
        print("62. << Back to Tutorial Menu")
        print("=" * 75)
        print("Enter your choice (1-62): ", end="")

    def _get_user_choice(self):
        try:
            choice = int(input())
            return choice
        except ValueError:
            return -1