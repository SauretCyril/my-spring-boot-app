@echo off
rem Maven wrapper script for Windows

setlocal

set MAVEN_HOME=C:\Program Files\apache-maven-3.8.8
set MAVEN_OPTS=-Xmx1024m -XX:MaxPermSize=256m

if not exist "%MAVEN_HOME%\bin\mvn" (
    echo "Maven not found. Please install Maven or check the MAVEN_HOME path."
    exit /b 1
)

"%MAVEN_HOME%\bin\mvn" %* 

endlocal