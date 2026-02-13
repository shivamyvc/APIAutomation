# API Automation Framework

A robust, modular Java-based framework for REST API testing using Rest Assured, TestNG, and ExtentReports. Designed for scalable, data-driven automation with clean architecture.

## Key Features

- **POJO Classes with Builder Pattern**: Immutable request/response models (e.g., UserPOJO) using Lombok's `@Builder` for fluent, type-safe payload construction and validation. [web:11]
- **TestNG Test Cases & Suites**: Parallel execution support via TestNG XML suites; annotations for data providers enable reusable, parameterized tests across endpoints. [web:13]
- **ExtentReports Integration**: HTML dashboards with pass/fail logs, screenshots, and test categorization; listener auto-generates reports post-execution. [web:12]
- Additional perks: Layered structure (Core/App/Test), Maven dependencies, logging, and CI-ready (Jenkins/GitHub Actions).

## Quick Start

1. Clone repo: `git clone https://github.com/shivamyvc/APIAutomation.git`
2. Install: `mvn clean install`
3. Run tests: `mvn test` or use `testng.xml` suites (e.g., `mvn test -Dsuitename=RegressionSuite`)

## Architecture

src/
├── main/java/core/ # Utilities, API clients, payloads
├── test/java/app/ # Endpoints, POJOs with Builder
└── test/java/test/ # TestNG suites & cases

text

## Example Usage

**POJO Builder**:
```java
UserRequest user = UserRequest.builder()
    .name("John")
    .email("john@example.com")
    .build();
TestNG Test:

java
@Test(dataProvider = "userData")
public void createUserTest(UserRequest user) {
    given().spec(requestSpec).body(user)
        .when().post("/users")
        .then().statusCode(201).spec(responseSpec);
}
Reports
ExtentReports generated at target/extent.html – interactive dashboard with trends and logs.

Contributing
Fork, PR with test cases. Add features like Allure reports or Karate integration!

