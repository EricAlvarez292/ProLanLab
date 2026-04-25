# Programming Language Lab - Java Version

A comprehensive console-based tutorial system for learning programming languages with **50 interactive tutorials** covering Java and Python (beginner-focused approach).

## Features

- **Beginner-Friendly Learning** - 25 Java + 25 Python tutorials designed for educational comparison
- **Modular Architecture** - Clean, maintainable, and extensible design
- **Cross-Platform** - Runs seamlessly on Windows, macOS, and Linux
- **Zero Dependencies** - Pure Java implementation, no external libraries
- **Console Interface** - Distraction-free learning environment
- **Structured Content** - Progressive learning paths focusing on language comparison
- **Interactive Navigation** - Easy-to-use menu system

## Prerequisites

### System Requirements

**For Windows:**
- Java Development Kit (JDK) 11 or higher
- Windows 10 or later (recommended)
- Command Prompt, PowerShell, or Git Bash

**For macOS:**
- Java Development Kit (JDK) 11 or higher  
- macOS 10.14 (Mojave) or later
- Terminal application

### Installing Java (JDK)

#### Windows Installation:
1. **Download JDK:**
   - Visit [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://adoptium.net/)
   - Download the Windows x64 installer (.msi file)

2. **Install JDK:**
   - Run the downloaded .msi installer
   - Follow the installation wizard
   - Default installation path: `C:\Program Files\Java\jdk-[version]`

3. **Set Environment Variables:**
   ```cmd
   # Add to System PATH (via System Properties > Environment Variables)
   C:\Program Files\Java\jdk-[version]\bin
   
   # Set JAVA_HOME (optional but recommended)
   JAVA_HOME = C:\Program Files\Java\jdk-[version]
   ```

4. **Verify Installation:**
   ```cmd
   java -version
   javac -version
   ```

#### macOS Installation:
1. **Using Homebrew (Recommended):**
   ```bash
   # Install Homebrew if not already installed
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   
   # Install OpenJDK
   brew install openjdk@17
   
   # Add to PATH (add to ~/.zshrc or ~/.bash_profile)
   echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
   source ~/.zshrc
   ```

2. **Manual Installation:**
   - Download JDK from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [Adoptium](https://adoptium.net/)
   - Run the .dmg installer
   - Follow the installation wizard

3. **Verify Installation:**
   ```bash
   java -version
   javac -version
   ```

## How to Run

### Windows

#### Method 1: Using the Build Script
```cmd
# Clone or download the project
git clone <repository-url>
cd prolanlab-java

# Run the program (compiles and starts automatically)
run.bat
```

#### Method 2: Manual Compilation
```cmd
# Navigate to project directory
cd prolanlab-java

# Compile all Java files
javac -d out -cp src/main/java src/main/java/com/prolanlab/*.java src/main/java/com/prolanlab/**/*.java src/main/java/com/prolanlab/**/**/*.java

# Run the program
java -cp out com.prolanlab.Main
```

#### Method 3: PowerShell (Alternative)
```powershell
# Compile and run in PowerShell
cd prolanlab-java
javac -d out -sourcepath src/main/java src/main/java/com/prolanlab/Main.java
java -cp out com.prolanlab.Main
```

### macOS/Linux

#### Method 1: Using the Build Script
```bash
# Clone or download the project
git clone <repository-url>
cd prolanlab-java

# Make script executable and run
chmod +x run.sh
./run.sh
```

#### Method 2: Manual Compilation
```bash
# Navigate to project directory
cd prolanlab-java

# Compile all Java files
javac -d out -cp src/main/java $(find src/main/java -name "*.java")

# Run the program
java -cp out com.prolanlab.Main
```

## Learning Modules

### Java Tutorial (42 Comprehensive Topics)

**Fundamentals (8 topics):**
- Java Introduction & Concepts
- Syntax & Structure  
- Output & Print Statements
- Comments & Documentation
- Variables & Naming
- Data Types & Primitives
- Type Casting & Conversion
- Operators & Expressions

**Control Structures (8 topics):**
- String manipulation
- Math operations
- Boolean logic
- Conditional statements (if-else)
- Switch statements
- While loops
- For loops  
- Break & Continue

**Classes & OOP (11 topics):**
- Object-Oriented Programming concepts
- Methods & Functions
- Constructors & Initialization
- Method Overloading
- Inheritance & Extends
- Polymorphism & Overriding
- Encapsulation & Access Modifiers
- Abstraction & Abstract Classes
- Static members
- Final keyword
- Inner Classes

**Data Structures (14 topics):**
- Data structures overview
- Arrays & Multi-dimensional Arrays
- ArrayList & Dynamic Arrays
- HashMap & Key-Value Storage
- HashSet & Unique Collections
- LinkedList & Node-based Storage
- Stack & LIFO Operations
- Queue & FIFO Operations
- Tree structures
- Heap data structure
- Graph representations
- Algorithm implementations

### Python Tutorial (61 Comprehensive Topics)

**Fundamentals (15 topics):**
- Python Introduction & Philosophy
- Syntax & Indentation Rules
- Statements & Execution
- Print functions & Text Output
- Number output & Formatting
- Comments & Documentation
- Variables & Assignment
- Multiple value assignments
- Variable output techniques
- Global vs Local scope
- Identifiers & Naming conventions
- Constants & Immutability
- Data types overview
- Number types (int, float, complex)
- Type casting & Conversion

**Control Structures (17 topics):**
- Operators overview
- Arithmetic operations
- Assignment operators
- Comparison operators  
- Logical operators (and, or, not)
- Identity operators (is, is not)
- Membership operators (in, not in)
- Bitwise operations
- Operator precedence rules
- String creation & manipulation
- String slicing techniques
- String concatenation
- Format strings (f-strings)
- Escape characters
- String methods
- Math module & functions
- Boolean operations

**Flow Control & Collections (10 topics):**
- Conditional statements (if-elif-else)
- While loops & control
- For loops & iteration
- Nested loop structures
- For-each loop patterns
- Break & Continue statements
- Tuples & immutable sequences
- Lists & mutable sequences
- Sets & unique collections
- Dictionaries & key-value pairs

**Classes & OOP (9 topics):**
- Object-Oriented Programming principles
- Classes & Objects creation
- Self parameter & instance reference
- Methods (instance, class, static)
- Properties & decorators
- Inheritance & super()
- Polymorphism & duck typing
- Encapsulation & private attributes
- Inner/Nested classes

**Data Structures (9 topics):**
- Lists, Arrays & NumPy
- Stack implementation & applications
- Queue types (FIFO, Priority, Circular)
- Linked Lists (Singly & Doubly)
- Hash Tables & collision handling
- Tree structures & traversal
- Binary Trees & Binary Search Trees
- Graph representation & algorithms
- Algorithm implementations (sorting, searching, dynamic programming)

### Quiz Module
Interactive quizzes to test your knowledge (Available)

### About Module  
Information about the Programming Language Lab (Available)

## Project Structure

```
prolanlab/
├── src/main/java/com/prolanlab/
│   ├── Main.java                           # Application entry point
│   ├── TutorialModule.java                # Main tutorial controller
│   │
│   ├── tutorials/                          # Tutorial packages
│   │   ├── java/                          # Java tutorial modules
│   │   │   ├── fundamentals/
│   │   │   │   └── JavaFundamentals.java     # Java basics (8 tutorials)
│   │   │   ├── controlstructures/
│   │   │   │   └── JavaControlStructures.java # Control flow (8 tutorials)  
│   │   │   ├── classesandoop/
│   │   │   │   └── JavaClassesAndOOP.java    # OOP concepts (11 tutorials)
│   │   │   └── datastructures/
│   │   │       └── JavaDataStructures.java   # Data structures (14 tutorials)
│   │   │
│   │   └── python/                        # Python tutorial modules
│   │       ├── fundamentals/
│   │       │   └── PythonFundamentals.java   # Python basics (15 tutorials)
│   │       ├── controlstructures/  
│   │       │   └── PythonControlStructures.java # Operators & strings (17 tutorials)
│   │       ├── flowcontrol/
│   │       │   └── PythonFlowControl.java    # Loops & collections (10 tutorials)
│   │       ├── classesandoop/
│   │       │   └── PythonClassesAndOOP.java  # OOP in Python (9 tutorials)
│   │       └── datastructures/
│   │           └── PythonDataStructures.java # Advanced DS (9 tutorials)
│   │
│   ├── quizzes/
│   │   └── QuizModule.java                   # Interactive quiz system
│   │
│   └── aboutme/
│       └── AboutMeModule.java                # About information
│
├── .vscode/                               # VS Code configuration
├── run.sh                                 # Unix/Linux/macOS run script  
├── run.bat                                # Windows run script
├── README.md                              # This documentation
└── .gitignore                             # Git ignore rules
```

### Architecture Overview

The project follows a **modular MVC-inspired architecture**:

- **Main.java** - Application entry point and menu controller
- **TutorialModule.java** - Main tutorial dispatcher  
- **Language Controllers** - `JavaTutorialController`, `PythonTutorialController`
- **Specialized Classes** - Topic-focused tutorial implementations
- **Module Pattern** - Each major feature (tutorials, quizzes, about) is self-contained

## Learning Paths

### Beginner Path (Start Here!)
1. Java Fundamentals → Control Structures → Basic OOP
2. Python Fundamentals → Control Structures → Flow Control

### Intermediate Path  
1. Complete Java OOP concepts
2. Explore Python Classes & OOP
3. Dive into data structures in both languages

### Advanced Path
1. Master all data structures
2. Study algorithm implementations
3. Compare language paradigms

## IDE Support

### IntelliJ IDEA
```bash
# Open project
File → Open → Select prolanlab folder
# Run configuration automatically detected
```

### VS Code
```bash
# Required extensions
- Extension Pack for Java
- Java Language Support

# Open project  
File → Open Folder → Select prolanlab
```

### Eclipse
```bash
# Import project
File → Import → Existing Projects into Workspace
Select prolanlab folder
```

## Development & Customization

### Adding New Tutorials

**Java Tutorial:**
1. Add method to appropriate class in `tutorials/java/`
2. Update `JavaTutorialController.java` switch statement
3. Update menu in `PythonTutorialController.displayJavaMenu()`

**Python Tutorial:**  
1. Add method to appropriate class in `tutorials/python/`
2. Update `PythonTutorialController.java` switch statement
3. Update menu in `PythonTutorialController.displayPythonMenu()`

### Adding New Languages

1. Create new language package: `tutorials/newlang/`
2. Create controller: `NewLangTutorialController.java`
3. Add menu option in `TutorialModule.java`
4. Follow existing modular pattern

### Extending Quiz System

The `QuizModule.java` provides foundation for:
- Multiple choice questions
- Programming challenges  
- Progress tracking
- Score calculation

## Troubleshooting

### Common Issues

**"javac not found" Error:**
```bash
# Check Java installation
java -version
javac -version

# Add Java to PATH (if needed)
# Windows: Add C:\Program Files\Java\jdk-XX\bin to system PATH
# macOS: Add export PATH="/usr/libexec/java_home -v 17"/bin:$PATH to ~/.zshrc
```

**Compilation Errors:**
```bash
# Clean compile (removes old .class files)
rm -rf out/           # Unix/macOS
rmdir /s out          # Windows

# Recompile
./run.sh              # Unix/macOS  
run.bat               # Windows
```

**Menu Navigation Issues:**
- Use numeric input only (1, 2, 3, etc.)
- Press Enter after each selection
- Use Ctrl+C to force exit if needed

## Contributing

We welcome contributions! Here's how you can help:

### Areas for Contribution
- **New Programming Languages** (C++, JavaScript, etc.)
- **Enhanced Quiz System** with more question types
- **Improved UI** with better formatting
- **Additional Tutorial Content** 
- **Bug Fixes** and optimizations
- **Documentation** improvements

### Contribution Steps
1. Fork the repository
2. Create a feature branch: `git checkout -b feature-name`
3. Follow existing code patterns and naming conventions
4. Add comprehensive JavaDoc comments
5. Test thoroughly on both Windows and macOS
6. Submit a pull request with detailed description

### Code Style Guidelines
- Use descriptive method and variable names
- Follow Java naming conventions (camelCase)
- Add JavaDoc comments for public methods
- Maintain console output formatting consistency
- Include comprehensive examples in tutorials

## License

This project is open source and available under the [MIT License](LICENSE).

## Happy Learning!

**Programming Language Lab** makes programming education accessible, engaging, and comprehensive. Whether you're taking your first steps in programming or expanding your language knowledge, our structured approach helps you build solid foundations.

### Why Choose Programming Language Lab?

- **Progressive Learning** - From basics to advanced concepts
- **Hands-on Examples** - Real code you can understand and modify  
- **Interactive Experience** - Learn by doing, not just reading
- **Comprehensive Coverage** - 103 tutorials across 2 major languages
- **Completely Free** - No subscriptions, no hidden costs

### Start Your Coding Journey Today!

```bash
git clone <repository-url>
cd prolanlab  
./run.sh        # macOS/Linux
# or
run.bat         # Windows
```

---

> *"The journey of a thousand programs begins with a single line of code."*

**Built with love for aspiring programmers everywhere**

*Last updated: April 25, 2026*