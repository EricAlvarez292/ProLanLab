"""
Tutorial Module - Main controller for all tutorials
"""

from prolanlab.tutorials.java.java_tutorial_controller import JavaTutorialController
from prolanlab.tutorials.python.python_tutorial_controller import PythonTutorialController


class TutorialModule:
    def __init__(self):
        pass

    def start(self):
        in_tutorial_module = True
        
        while in_tutorial_module:
            self._display_tutorial_menu()
            choice = self._get_user_choice()
            
            if choice == 1:
                JavaTutorialController().start()
            elif choice == 2:
                PythonTutorialController().start()
            elif choice == 3:
                print("Returning to main menu...")
                in_tutorial_module = False
            else:
                print("Invalid option. Please try again.")
            
            if in_tutorial_module and choice != 3:
                print("\n" + "=" * 75)
                print("Press Enter to return to tutorial menu...")
                input()

    def _display_tutorial_menu(self):
        print("\n" + "=" * 75)
        print("                    [T] TUTORIALS")
        print("=" * 75)
        print()
        print(" 1. Java Tutorial")
        print(" 2. Python Tutorial")
        print()
        print(" 3. << Back to Main Menu")
        print()
        print("=" * 75)
        print("Enter your choice (1-3): ", end="")

    def _get_user_choice(self):
        try:
            choice = int(input())
            return choice
        except ValueError:
            return -1