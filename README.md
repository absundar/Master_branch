# automation-selenium

Sample Maven project to run Selenium WebDriver tests using JUnit 5 and WebDriverManager.

Prerequisites
- Java 17 or later
- Chrome browser installed (or change the test to use Firefox/Edge)
- Maven installed on PATH (or use Eclipse's Maven support)

Run tests

From the project root in a Windows command prompt:

```cmd
mvn -q test
```

Notes
- WebDriverManager downloads the appropriate chromedriver automatically.
- If you prefer to use a local driver binary, set the system property `webdriver.chrome.driver` or add the driver to PATH.
- If Eclipse created `module-info.java`, consider removing it to avoid module-path issues with third-party libraries.
