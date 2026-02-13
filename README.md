API Automation Framework
Introduction
This is a lightweight, Java-based REST API automation framework using Rest Assured, TestNG, and ExtentReports. It streamlines API testing with modular POJOs (Builder pattern), reusable suites, and interactive reports for CI/CD pipelines.

Key Features
POJO Classes with Builder Pattern: Immutable models like UserPOJO using Lombok @Builder for fluent payload creation and validation.

TestNG Test Cases & Suites: Data-driven tests with XML suites for parallel execution and parameterization.

ExtentReports: Auto-generated HTML dashboards with logs, trends, and categorization.

Modular layers: Core utilities, app payloads/endpoints, test cases; Maven-based, CI-ready.

Quick Start
Clone: git clone https://github.com/shivamyvc/APIAutomation.git

Install: mvn clean install

Run: mvn test or mvn test -Dsuitename=RegressionSuite
