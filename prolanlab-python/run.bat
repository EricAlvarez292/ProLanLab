@echo off
REM Programming Language Lab - Python Version - Run Script
REM This script runs the Python console application

echo.
echo ========================================================
echo   Programming Language Lab - Python Version
echo   Build ^& Run Script for Windows
echo ========================================================
echo.

REM Check if Python is installed
python --version >nul 2>&1
if errorlevel 1 (
    echo [ERROR] Python is not installed or not in PATH
    echo.
    echo Please install Python 3.7 or higher:
    echo 1. Download from https://python.org/downloads/
    echo 2. Make sure to check "Add Python to PATH" during installation
    echo 3. Restart your command prompt and try again
    echo.
    pause
    exit /b 1
)

REM Display Python version
echo [INFO] Python version:
python --version
echo.

REM Check if we're in the correct directory
if not exist "main.py" (
    echo [ERROR] main.py not found in current directory
    echo Please make sure you're in the prolanlab-python directory
    echo.
    pause
    exit /b 1
)

REM Run the program
echo [INFO] Starting Programming Language Lab...
echo ========================================================
echo.

python main.py

REM Check exit code
if errorlevel 1 (
    echo.
    echo [ERROR] The program encountered an error
    pause
    exit /b 1
) else (
    echo.
    echo [SUCCESS] Program completed successfully
    pause
)