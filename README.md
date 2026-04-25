# ProLanLab - Programming Language Learning Laboratory

## 🎯 Overview

ProLanLab is an interactive programming language learning platform designed to help developers learn and practice Java and Python programming concepts. The project provides comprehensive tutorials, interactive quizzes, and hands-on exercises covering fundamental to advanced topics in both languages.

## 📁 Project Structure

```
prolanlab/
├── prolanlab-java/          # Java implementation
│   ├── src/main/java/       # Java source code
│   ├── out/                 # Compiled Java classes
│   ├── target/              # IDE build output
│   ├── run.sh              # Unix/macOS execution script
│   ├── run.bat             # Windows execution script
│   └── README.md           # Java-specific documentation
├── prolanlab-python/       # Python implementation
│   ├── src/                # Python source code
│   ├── main.py            # Python entry point
│   └── README.md          # Python-specific documentation
└── README.md              # This file
```

## 🚀 Getting Started

### Prerequisites

**For Java Version:**
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) [Optional]

**For Python Version:**
- Python 3.7 or higher
- Any Python IDE (PyCharm, VS Code, Jupyter) [Optional]

### Running the Applications

#### Java Version
```bash
cd prolanlab-java

# On Unix/macOS/Linux
chmod +x run.sh
./run.sh

# On Windows
run.bat
```

#### Python Version
```bash
cd prolanlab-python

# Direct execution
python main.py

# Or make executable (Unix/macOS/Linux)
chmod +x main.py
./main.py
```

## 📚 Features

### Core Modules
- **Tutorial Module**: Comprehensive programming tutorials
- **Quiz Module**: Interactive coding challenges and assessments  
- **About Me Module**: Personal information and learning journey

### Tutorial Coverage

#### Java Topics (42 topics)
- **Fundamentals**: Variables, data types, operators
- **Control Structures**: Loops, conditionals, branching
- **Data Structures**: Arrays, collections, maps
- **Classes & OOP**: Inheritance, polymorphism, encapsulation

#### Python Topics (61 topics)
- **Fundamentals**: Variables, data types, operators
- **Flow Control**: Loops, conditionals, exception handling
- **Control Structures**: Advanced control flow patterns
- **Data Structures**: Lists, dictionaries, sets, tuples
- **Classes & OOP**: Classes, inheritance, special methods

### Interactive Features
- **Step-by-step tutorials** with code examples
- **Progressive difficulty levels** from beginner to advanced
- **Cross-platform compatibility** (Windows, macOS, Linux)
- **Clean, modular architecture** for easy extension

## 🛠️ Development

### Architecture
Both implementations follow a modular design pattern:
- **Controller classes** manage tutorial flow and user interaction
- **Content classes** contain tutorial materials and examples
- **Module classes** organize functionality by feature area

### Code Organization
- **Java**: Package-based organization under `com.prolanlab`
- **Python**: Module-based organization with clear separation of concerns

### Build Systems
- **Java**: Custom build scripts with manual compilation
- **Python**: Direct execution with import-based module loading

## 📋 Available Tutorials

### Java Programming Path
1. **Java Fundamentals** - Variables, operators, basic syntax
2. **Java Control Structures** - Loops, conditionals, method control
3. **Java Data Structures** - Arrays, ArrayList, HashMap usage
4. **Java Classes & OOP** - Object-oriented programming concepts

### Python Programming Path
1. **Python Fundamentals** - Variables, operators, basic syntax
2. **Python Flow Control** - Exception handling, context managers
3. **Python Control Structures** - Advanced loops and conditionals
4. **Python Data Structures** - Lists, dicts, sets, comprehensions
5. **Python Classes & OOP** - Classes, inheritance, magic methods

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-tutorial`)
3. Add your tutorial content following existing patterns
4. Test both Java and Python implementations
5. Commit your changes (`git commit -am 'Add new tutorial'`)
6. Push to the branch (`git push origin feature/new-tutorial`)
7. Create a Pull Request

## 🎓 Learning Objectives

By completing ProLanLab tutorials, learners will:
- Master fundamental programming concepts in Java and Python
- Understand object-oriented programming principles  
- Gain hands-on experience with data structures and algorithms
- Develop problem-solving skills through interactive exercises
- Build confidence in cross-language programming concepts

---