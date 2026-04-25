#!/bin/bash

# Programming Language Lab - Run Script
# This script compiles and runs the Java console application

echo ">> Programming Language Lab - Build & Run Script"
echo "=================================================="

# Create output directory
mkdir -p out

# Compile Java files
echo ">> Compiling Java files..."
find src/main/java -name "*.java" | xargs javac -d out

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "[SUCCESS] Compilation successful!"
    echo ""
    echo ">> Starting Programming Language Lab..."
    echo "========================================"
    
    # Run the application
    java -cp out com.prolanlab.Main
else
    echo "[ERROR] Compilation failed. Please check for errors."
    exit 1
fi