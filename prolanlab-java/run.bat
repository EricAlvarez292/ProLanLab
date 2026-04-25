@echo off
REM Programming Language Lab - Run Script for Windows
REM This script compiles and runs the Java console application

echo >> Programming Language Lab - Build ^& Run Script
echo ==================================================

REM Create output directory
if not exist "out" mkdir out

REM Compile Java files
echo >> Compiling Java files...
javac -d out -sourcepath src/main/java src/main/java/com/prolanlab/Main.java

REM Check if compilation was successful
if %errorlevel% == 0 (
    echo [SUCCESS] Compilation successful!
    echo.
    echo >> Starting Programming Language Lab...
    echo ========================================
    
    REM Run the application
    java -cp out com.prolanlab.Main
) else (
    echo [ERROR] Compilation failed. Please check for errors.
    pause
    exit /b 1
)

pause