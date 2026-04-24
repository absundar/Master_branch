@echo off
cd /d C:\Users\DELL\git\Master_branch
echo CREATING ECLIPSE PROJECTS FOR NEW FOLDERS...
echo.

set folders=Automation automation-selenium JavaProject SeleniumAutomation

for %%f in (%folders%) do (
    if exist "%%f" (
        echo Creating project for: %%f
        if not exist "%%f\.project" (
            (
                echo ^<?xml version="1.0" encoding="UTF-8"?^>
                echo ^<projectDescription^>
                echo     ^<name^>%%f^</name^>
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
            ) > "%%f\.project"
        )
        
        if not exist "%%f\.classpath" (
            (
                echo ^<?xml version="1.0" encoding="UTF-8"?^>
                echo ^<classpath^>
                echo     ^<classpathentry kind="src" path=""/^>
                echo     ^<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER"/^>
                echo     ^<classpathentry kind="output" path="bin"/^>
                echo ^</classpath^>
            ) > "%%f\.classpath"
        )
        echo     Done: %%f
    ) else (
        echo WARNING: %%f not found!
    )
)

echo.
echo DONE! Now refresh Eclipse.
pause