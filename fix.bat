@echo off
cd /d C:\Users\DELL\git\Master_branch
echo FIXING ECLIPSE PROJECTS...
echo.

for /d %%d in (*) do (
    if not "%%d"==".git" if not "%%d"==".github" if not "%%d"=="scripts" (
        echo Checking: %%d
        if exist "%%d\*.java" (
            echo Creating Eclipse project for: %%d
            if not exist "%%d\.project" (
                (
                    echo ^<?xml version="1.0" encoding="UTF-8"?^>
                    echo ^<projectDescription^>
                    echo     ^<name^>%%d^</name^>
                    echo     ^<comment^>^</comment^>
                    echo     ^<projects^>^</projects^>
                    echo     ^<buildSpec^>
                    echo         ^<buildCommand^>
                    echo             ^<name^>org.eclipse.jdt.core.javabuilder^</name^>
                    echo             ^<arguments^>^</arguments^>
                    echo         ^</buildCommand^>
                    echo     ^</buildSpec^>
                    echo     ^<natures^>
                    echo         ^<nature^>org.eclipse.jdt.core.javanature^</nature^>
                    echo     ^</natures^>
                    echo ^</projectDescription^>
                ) > "%%d\.project"
            )
            
            if not exist "%%d\.classpath" (
                (
                    echo ^<?xml version="1.0" encoding="UTF-8"?^>
                    echo ^<classpath^>
                    echo     ^<classpathentry kind="src" path=""/^>
                    echo     ^<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER"/^>
                    echo     ^<classpathentry kind="output" path="bin"/^>
                    echo ^</classpath^>
                ) > "%%d\.classpath"
            )
        )
    )
)

echo.
echo DONE! Created Eclipse projects for all Java folders.
pause