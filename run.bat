@echo off
setlocal

set "BUILD_DIR=build\classes"
set "FUENTES=fuentes.txt"
set "MAIN_CLASS=com.ejemplo.televisor.Main"

if not exist "src\main\java" (
    echo No se encontro la carpeta src\main\java.
    exit /b 1
)

if not exist "%BUILD_DIR%" (
    mkdir "%BUILD_DIR%"
)

dir /s /b src\main\java\*.java > "%FUENTES%"

javac -encoding UTF-8 -d "%BUILD_DIR%" @"%FUENTES%"
if errorlevel 1 (
    echo.
    echo Error al compilar el proyecto.
    del "%FUENTES%" > nul 2>&1
    exit /b 1
)

echo.
echo Ejecutando %MAIN_CLASS%...
echo.
java -cp "%BUILD_DIR%" %MAIN_CLASS%

del "%FUENTES%" > nul 2>&1
endlocal
