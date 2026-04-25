#!/usr/bin/env python3
"""
Programming Language Learning Lab - Console Application
Main entry point for the tutorial program
"""

import sys
import os

# Add src directory to Python path
sys.path.insert(0, os.path.join(os.path.dirname(__file__), 'src'))

from prolanlab.tutorials.tutorial_module import TutorialModule
from prolanlab.quizzes.quiz_module import QuizModule
from prolanlab.aboutme.about_me_module import AboutMeModule


class Main:
    def __init__(self):
        self.tutorial_module = TutorialModule()
        self.quiz_module = QuizModule()
        self.about_me_module = AboutMeModule()

    def main(self):
        print("+======================================================+")
        print("|        Welcome to Programming Language Lab          |")
        print("|              Console Tutorial System                |")
        print("+======================================================+")
        print()
        
        running = True
        
        while running:
            self._display_main_menu()
            choice = self._get_user_choice()
            
            if choice == 1:
                self.tutorial_module.start()
            elif choice == 2:
                self.quiz_module.start()
            elif choice == 3:
                self.about_me_module.start()
            elif choice == 4:
                print("\nThank you for using Programming Language Lab!")
                print("Happy coding!")
                running = False
            else:
                print("Invalid option. Please try again.")
            
            if running:
                print("\nPress Enter to continue...")
                input()

    def _display_main_menu(self):
        print("\n" + "=" * 50)
        print("                 MAIN MENU")
        print("=" * 50)
        print("1. [T] Tutorial")
        print("2. [Q] Quizzes")
        print("3. [A] About Me")
        print("4. [X] Exit")
        print("=" * 50)
        print("Enter your choice (1-4): ", end="")

    def _get_user_choice(self):
        try:
            user_input = input().strip()
            return int(user_input)
        except ValueError:
            return -1


if __name__ == "__main__":
    app = Main()
    app.main()