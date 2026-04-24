# SeleniumAutomation

This project is configured as a Maven project to run Selenium tests with TestNG.

Prerequisites
- Java 17
- Maven
- Chrome installed (for ChromeDriver) or change to another browser

Run tests with Maven (from project root):

```cmd
mvn -U test -DfailIfNoTests=false
```

Run tests in Eclipse:
1. Import the project as an Existing Maven Project (or right-click -> Configure -> Convert to Maven Project).
2. Ensure Maven Dependencies and TestNG are present in the Project > Properties > Java Build Path.
3. Run individual TestNG tests by right-clicking the test class and selecting Run As > TestNG Test.

Notes
- Dependencies (Selenium and WebDriverManager) are managed by Maven in `pom.xml`.
- WebDriverManager will download a matching browser driver at runtime.
- If you see logging warnings about SLF4J, add an slf4j binding (e.g., `slf4j-simple`) to `pom.xml` for visible logs.
