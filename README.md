# Nykaa Clone - End-to-End Automation Testing

## Project Overview
This project is an automation testing framework for the Nykaa Clone website. It uses **Selenium 4 with Java** to perform end-to-end testing of various functionalities such as homepage navigation, product catalog validation, cart functionality, performance testing, and more.

### 🌐 Live Website: [Nykaa Clone](https://sweet-donut-1ca8e9.netlify.app/)
### 🛠️ GitHub Repository: [Nykaa Automation](https://github.com/PromojitPaul/NYKAA)

---

## 🏗️ Project Structure

```
NYKAA/
│── pom.xml
│── testng.xml
│── target/
│   ├── cucumber-reports/
│   │   ├── cucumber-pretty.html
│   │   ├── CucumberTestReport.json
│   ├── generated-sources/
│   ├── generated-test-sources/
│   ├── test-output/
│   │   ├── Default suite/
│   │   │   ├── Default test.html
│   │   │   ├── Default test.xml
│   │   ├── junitreports/
│   │   │   ├── TEST-com.sweetdonut.runner.TestRunner.xml
│   │   ├── old/
│   │   │   ├── Default suite/
│   │   │   │   ├── classes.html
│   │   │   │   ├── Default test.properties
│   │   │   │   ├── groups.html
│   │   │   │   ├── index.html
│   │   │   │   ├── main.html
│   │   │   │   ├── methods.html
│   │   │   │   ├── methods-alphabetical.html
│   │   │   │   ├── methods-not-run.html
│   │   │   │   ├── reporter-output.html
│   │   │   │   ├── testng.xml.html
│   │   │   │   ├── toc.html
│   │   │   ├── index.html
│   │   │   ├── bullet_point.png
│   │   │   ├── collapselall.gif
│   │   │   ├── emailable-report.html
│   │   │   ├── failed.png
│   │   │   ├── index.html
│   │   │   ├── jquery-3.6.0.min.js
│   │   │   ├── navigator-bullet.png
│   │   │   ├── passed.png
│   │   │   ├── skipped.png
│   │   │   ├── testng.css
│   │   │   ├── testng-reports.css
│   │   │   ├── testng-reports.js
│   │   │   ├── testng-reports1.css
│   │   │   ├── testng-reports2.js
│   │   │   ├── testng-results.xml
│── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── com.nykaa.config/
│   │   │   │   ├── BrowserConfig.java
│   │   │   ├── com.nykaa.stepdefs/
│   │   │   │   ├── HomePageSteps.java
│   │   │   ├── com.sweetdonut.config/
│   │   │   │   ├── BrowserConfig.java
│   │   │   │   ├── TestConfig.java
│   │   │   ├── com.sweetdonut.hooks/
│   │   │   │   ├── TestHooks.java
│   │   │   ├── com.sweetdonut.pages/
│   │   │   │   ├── CartPage.java
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── ProductPage.java
│   │   │   ├── com.sweetdonut.pages.base/
│   │   │   │   ├── BasePage.java
│   │   │   ├── com.sweetdonut.pages.components/
│   │   │   │   ├── Header.java
│   │   │   │   ├── NavigationMenu.java
│   │   │   ├── com.sweetdonut.reporting/
│   │   │   │   ├── ExtentReportListener.java
│   │   │   ├── com.sweetdonut.runner/
│   │   │   │   ├── TestRunner.java
│   │   │   ├── com.sweetdonut.stepdefs/
│   │   │   │   ├── HomePageSteps.java
│   │   │   │   ├── PerformanceSteps.java
│   │   │   │   ├── ProductSteps.java
│   │   │   ├── com.sweetdonut.stepdefs.base/
│   │   │   │   ├── BaseSteps.java
│   │   │   ├── com.sweetdonut.utils/
│   │   │   │   ├── AccessibilityUtils.java
│   │   │   │   ├── AssertionUtils.java
│   │   │   │   ├── BrowserUtils.java
│   │   │   │   ├── DriverManager.java
│   │   │   │   ├── ExtentReportManager.java
│   │   │   │   ├── PerformanceUtils.java
│   │   │   │   ├── ScreenshotHelper.java
│   │   │   │   ├── WaitHelper.java
│   ├── test/resources/
│   │   ├── features/
│   │   │   ├── Accessibility.feature
│   │   │   ├── Cart.feature
│   │   │   ├── HomePage.feature
│   │   │   ├── Navigation.feature
│   │   │   ├── Performance.feature
│   │   │   ├── ProductCatalog.feature
│   │   ├── test-cases/
│   │   │   ├── bug-report-template.md
│   │   │   ├── mind-map.md
│   │   │   ├── test-summary-template.md

```

---

## 📌 Key Features
- **Automated Testing with Selenium 4 & Java**
- **Behavior-Driven Development (BDD) using Cucumber**
- **TestNG for Test Execution & Reporting**
- **Page Object Model (POM) for Scalable Automation**
- **Parallel Execution Support**
- **Custom Utility Functions (Waits, Assertions, Reporting, Screenshots)**
- **Performance Testing Integration**
- **Accessibility Testing Automation**

---

## 🚀 How to Run the Tests

### 🔹 Prerequisites
1. Install **Java 11+**
2. Install **Maven**
3. Install **Google Chrome** & **Chromedriver**

### 🔹 Steps to Execute Tests
```sh
# Clone the repository
$ git clone https://github.com/PromojitPaul/NYKAA.git
$ cd NYKAA

# Run tests using Maven
$ mvn clean test

# Run tests using TestNG
$ mvn test -DsuiteXmlFile=testng.xml

# Generate Reports
$ mvn verify
```

---

## 📜 Test Reporting
- **Extent Reports**: Generates detailed HTML reports.
- **Cucumber Reports**: JSON & HTML formatted reports.
- **TestNG Reports**: Provides execution results and logs.

Reports can be found under:
```
target/test-output/index.html
target/cucumber-reports/cucumber-pretty.html
```

---

## 🤝 Contributing
Feel free to fork this repository and submit pull requests. All contributions are welcome!

---

## 📌 Hashtags
#AutomationTesting #Selenium #Java #TestNG #Cucumber #POM #NykaaClone #QA #BDD #E2ETesting

---

## 📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

---

**Happy Testing! 🚀**
