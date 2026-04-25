# Programming Language Lab - Python Version

A comprehensive console-based tutorial system for learning programming languages with **50 interactive tutorials** covering Java and Python (beginner-focused approach).

## Features

- **Beginner-Friendly Learning** - 25 Java + 25 Python tutorials designed for educational comparison
- **Modular Architecture** - Clean, maintainable, and extensible design
- **Cross-Platform** - Runs seamlessly on Windows, macOS, and Linux
- **Zero Dependencies** - Pure Python implementation, no external libraries
- **Console Interface** - Distraction-free learning environment
- **Structured Content** - Progressive learning paths focusing on language comparison
- **Interactive Navigation** - Easy-to-use menu system

## Prerequisites

### System Requirements

**For Windows:**
- Python 3.7 or higher
- Windows 10 or later (recommended)
- Command Prompt, PowerShell, or Git Bash

**For macOS:**
- Python 3.7 or higher  
- macOS 10.14 (Mojave) or later
- Terminal application

### Installing Python

#### Windows Installation:
1. **Download Python:**
   - Visit [Python.org](https://www.python.org/downloads/)
   - Download the latest Python 3.x installer for Windows
   - Choose "Windows x86-64 executable installer" for 64-bit systems

2. **Install Python:**
   - Run the downloaded installer
   - **IMPORTANT:** Check "Add Python to PATH" during installation
   - Choose "Install Now" or customize installation
   - Verify installation path: `C:\Users\[YourName]\AppData\Local\Programs\Python\Python3x`

3. **Verify Installation:**
   ```cmd
   python --version
   python -m pip --version
   ```

4. **Alternative Installation via Microsoft Store:**
   ```cmd
   # Search for "Python" in Microsoft Store and install
   # This automatically handles PATH configuration
   ```

#### macOS Installation:
1. **Using Homebrew (Recommended):**
   ```bash
   # Install Homebrew if not already installed
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   
   # Install Python
   brew install python
   
   # Verify installation
   python3 --version
   pip3 --version
   ```

2. **Using pyenv (Advanced Users):**
   ```bash
   # Install pyenv
   brew install pyenv
   
   # Add to shell profile
   echo 'export PATH="$HOME/.pyenv/bin:$PATH"' >> ~/.zshrc
   echo 'eval "$(pyenv init -)"' >> ~/.zshrc
   source ~/.zshrc
   
   # Install latest Python
   pyenv install 3.11.7
   pyenv global 3.11.7
   ```

3. **Manual Installation:**
   - Download Python from [Python.org](https://www.python.org/downloads/)
   - Run the .pkg installer
   - Follow the installation wizard

4. **Verify Installation:**
   ```bash
   python3 --version
   pip3 --version
   ```

## How to Run

### Windows

#### Method 1: Using the Run Script
```cmd
# Clone or download the project
git clone <repository-url>
cd prolanlab-python

# Run the program
run.bat
```

#### Method 2: Direct Python Execution
```cmd
# Navigate to project directory
cd prolanlab-python

# Run the program
python main.py
```

#### Method 3: PowerShell
```powershell
# Navigate to project directory
cd prolanlab-python

# Run with Python
python main.py

# Or if you have multiple Python versions
py -3 main.py
```

### macOS/Linux

#### Method 1: Using the Run Script
```bash
# Clone or download the project
git clone <repository-url>
cd prolanlab-python

# Make script executable and run
chmod +x run.sh
./run.sh
```

#### Method 2: Direct Python Execution
```bash
# Navigate to project directory
cd prolanlab-python

# Run the program
python3 main.py

# Or if python3 is your default
python main.py
```

#### Method 3: Make it Executable
```bash
# Make the main.py file executable
chmod +x main.py

# Run directly
./main.py
```

## Learning Modules

### Java Tutorial (25 Beginner-Focused Topics)

**Fundamentals (8 topics):**
- Java Introduction & Concepts
- Syntax & Structure  
- Output & Print Statements
- Comments & Documentation
- Variables & Naming
- Data Types & Primitives
- Type Casting & Conversion
- Operators & Expressions

**Control Structures (7 topics):**
- String manipulation
- Math operations
- Boolean logic
- Conditional statements (if-else)
- While loops
- For loops  
- Break & Continue

**Basic OOP (7 topics):**
- Object-Oriented Programming concepts
- Classes & Objects
- Attributes
- Methods & Functions
- Constructors & Initialization
- Basic Inheritance
- Access Modifiers

**Essential Collections (3 topics):**
- Arrays & Basic Operations
- ArrayList & Dynamic Arrays
- Basic Collections Overview

### Python Tutorial (25 Beginner-Focused Topics)

**Fundamentals (8 topics):**
- Python Introduction & Philosophy
- Syntax & Indentation Rules
- Statements & Execution
- Print functions & Text Output
- Number output & Formatting
- Comments & Documentation
- Variables & Assignment
- Multiple value assignments

**Control Structures (8 topics):**
- Operators overview
- Arithmetic operations
- Comparison operators  
- Logical operators (and, or, not)
- String creation & manipulation
- String methods
- Math module & functions
- Boolean operations

**Flow Control & Collections (7 topics):**
- Conditional statements (if-elif-else)
- While loops & control
- For loops & iteration
- Break & Continue statements
- Lists & mutable sequences
- Dictionaries & key-value pairs
- Tuples & immutable sequences

**Basic OOP (2 topics):**
- Classes & Objects creation
- Basic Inheritance

## Project Structure

```
prolanlab-python/
├── README.md
├── main.py                    # Main entry point
├── run.bat                    # Windows run script
├── run.sh                     # macOS/Linux run script
└── src/
    └── prolanlab/
        ├── __init__.py
        ├── aboutme/
        │   ├── __init__.py
        │   └── about_me_module.py
        ├── quizzes/
        │   ├── __init__.py
        │   └── quiz_module.py
        └── tutorials/
            ├── __init__.py
            ├── tutorial_module.py
            ├── java/
            │   ├── __init__.py
            │   ├── java_tutorial_controller.py
            │   ├── fundamentals/
            │   │   ├── __init__.py
            │   │   └── java_fundamentals.py
            │   ├── controlstructures/
            │   │   ├── __init__.py
            │   │   └── java_control_structures.py
            │   ├── classesandoop/
            │   │   ├── __init__.py
            │   │   └── java_classes_and_oop.py
            │   └── datastructures/
            │       ├── __init__.py
            │       └── java_data_structures.py
            └── python/
                ├── __init__.py
                ├── python_tutorial_controller.py
                ├── fundamentals/
                │   ├── __init__.py
                │   └── python_fundamentals.py
                ├── controlstructures/
                │   ├── __init__.py
                │   └── python_control_structures.py
                ├── flowcontrol/
                │   ├── __init__.py
                │   └── python_flow_control.py
                ├── classesandoop/
                │   ├── __init__.py
                │   └── python_classes_and_oop.py
                └── datastructures/
                    ├── __init__.py
                    └── python_data_structures.py
```

## Development Setup

### Virtual Environment (Recommended)
```bash
# Create virtual environment
python -m venv venv

# Activate virtual environment
# Windows:
venv\Scripts\activate
# macOS/Linux:
source venv/bin/activate

# Run the program
python main.py

# Deactivate when done
deactivate
```

### IDE Setup

**VS Code:**
- Install the Python extension
- Open the project folder
- Select Python interpreter (Ctrl+Shift+P → "Python: Select Interpreter")
- Run with F5 or Ctrl+F5

**PyCharm:**
- Open project folder
- Configure Python interpreter in Settings
- Run main.py

**Command Line:**
```bash
# Direct execution
python main.py

# With module flag
python -m main

# Check Python path
python -c "import sys; print(sys.path)"
```

## Troubleshooting

### Common Issues

1. **"python is not recognized" (Windows)**
   - Reinstall Python with "Add to PATH" checked
   - Or manually add Python to PATH environment variable

2. **"No module named 'prolanlab'" error**
   - Run from the project root directory
   - Check that __init__.py files exist in all directories

3. **Import errors**
   - Verify Python version compatibility (3.7+)
   - Check file paths and module structure

4. **Permission denied (macOS/Linux)**
   ```bash
   chmod +x main.py
   chmod +x run.sh
   ```

### Python Version Check
```bash
# Check Python version
python --version

# Check Python path
which python

# Check installed packages
pip list
```

## Contributing

1. Fork the repository
2. Create a feature branch: `git checkout -b feature-name`
3. Make your changes and test thoroughly
4. Commit: `git commit -m "Add feature description"`
5. Push: `git push origin feature-name`
6. Create a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Support

- **Issues:** Report bugs and request features on GitHub
- **Discussions:** Join community discussions
- **Documentation:** Check the wiki for detailed guides

---

**Happy Learning with Programming Language Lab! 🐍**