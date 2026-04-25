#!/bin/bash

# Programming Language Lab - Python Version - Run Script
# This script runs the Python console application

echo ""
echo "========================================================"
echo "  Programming Language Lab - Python Version"
echo "  Build & Run Script for macOS/Linux"
echo "========================================================"
echo ""

# Function to check if command exists
command_exists() {
    command -v "$1" >/dev/null 2>&1
}

# Check for Python installation
PYTHON_CMD=""
if command_exists python3; then
    PYTHON_CMD="python3"
elif command_exists python; then
    PYTHON_CMD="python"
else
    echo "[ERROR] Python is not installed or not in PATH"
    echo ""
    echo "Please install Python 3.7 or higher:"
    echo "  macOS: brew install python"
    echo "  Ubuntu/Debian: sudo apt install python3"
    echo "  CentOS/RHEL: sudo yum install python3"
    echo ""
    exit 1
fi

# Display Python version
echo "[INFO] Using Python command: $PYTHON_CMD"
echo "[INFO] Python version:"
$PYTHON_CMD --version
echo ""

# Check Python version (must be 3.7+)
PYTHON_VERSION=$($PYTHON_CMD -c 'import sys; print(".".join(map(str, sys.version_info[:2])))')
REQUIRED_VERSION="3.7"

if [ "$(printf '%s\n' "$REQUIRED_VERSION" "$PYTHON_VERSION" | sort -V | head -n1)" != "$REQUIRED_VERSION" ]; then
    echo "[ERROR] Python version $PYTHON_VERSION is too old"
    echo "Please install Python 3.7 or higher"
    echo ""
    exit 1
fi

# Check if we're in the correct directory
if [ ! -f "main.py" ]; then
    echo "[ERROR] main.py not found in current directory"
    echo "Please make sure you're in the prolanlab-python directory"
    echo ""
    exit 1
fi

# Check if src directory exists
if [ ! -d "src" ]; then
    echo "[ERROR] src directory not found"
    echo "Please make sure the project structure is complete"
    echo ""
    exit 1
fi

# Run the program
echo "[INFO] Starting Programming Language Lab..."
echo "========================================================"
echo ""

$PYTHON_CMD main.py

# Check exit code
EXIT_CODE=$?
if [ $EXIT_CODE -ne 0 ]; then
    echo ""
    echo "[ERROR] The program encountered an error (exit code: $EXIT_CODE)"
    exit $EXIT_CODE
else
    echo ""
    echo "[SUCCESS] Program completed successfully"
fi