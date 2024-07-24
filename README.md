Website Automation Testing with Selenium + TestNG and Performance Testing/Load Testing using Apache JMeter and BlazeMeter

This project automates website testing using Selenium WebDriver and the TestNG testing framework in the Eclipse IDE for Java. It provides a robust and maintainable foundation for testing web applications.

Getting Started

    Prerequisites:
        Java Development Kit (JDK) 11 or later (https://www.oracle.com/java/technologies/downloads/)
        Eclipse IDE (https://eclipseide.org/)
        Maven (Optional, but recommended for dependency management) (https://maven.apache.org/download.cgi)
        WebDriver for your desired browser (https://www.selenium.dev/documentation/webdriver/)

    Installation:

    Java Development Kit (JDK):
       -> Install OpenJDK using your package manager (e.g., sudo apt install default-jdk on Ubuntu).
       -> Verify installation with java -version and javac -version commands.
    Eclipse IDE:
       -> Download Eclipse IDE for Java Developers from https://eclipseide.org/.
       -> Extract the downloaded archive and run the eclipse executable.
    WebDriver:
       -> Download the appropriate WebDriver for your browser (e.g., ChromeDriver, GeckoDriver) from the Selenium website.
    Testng:
       -> Import Testng from Eclipse Marketplace by clicking on "Help" on eclipse ide navigation bar and choosing it in dropdown.


Download and install Eclipse:

    Follow the instructions on the Eclipse website.

Download WebDriver:

    Download the WebDriver for your browser and place it in the project's lib folder or configure your Eclipse build path accordingly.

    Eclipse Setup:
        Create a new Java project in Eclipse.
        Add files like pom.xml and testng.xml
        If using Maven, import the project as a Maven project.
        Otherwise, manually configure the build path to include the Selenium WebDriver jars and any other necessary libraries.
        For Testng to work, set java compliance version as 1.7.


Running Tests

    In Eclipse:
        Right-click on a TestNG test class or package.
        Select "Run as" -> "TestNG Test Suite".

    From Command Line (Maven project):
        Open your terminal and navigate to the project directory.
        Run mvn test to execute all TestNG tests.

Page Object Model (POM) (Recommended)

The Page Object Model is a design pattern for creating reusable and maintainable tests. This project is structured to encourage the use of a POM, where you create separate classes for each page of your website, encapsulating page elements and their interactions.

Performance/Load Testing Tools used:

For Manual Testing that includes Test Cases with Test Scenarios and Bug Reports visit https://docs.google.com/spreadsheets/d/1Uw2hsJSnkgfid5hUClq8lh0DbSd5Z8b2wzNUmfCchrY/edit?usp=drive_link 

Downloaded JMeter from official Apache Website
Add Blazemeter Extension from Chrome Extensions in Chrome Browser. 

