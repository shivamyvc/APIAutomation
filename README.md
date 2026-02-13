# API Automation Framework

A robust, lightweight Java-based REST API automation framework designed for comprehensive API testing with advanced reporting and logging capabilities.

## 📋 Table of Contents
- [Overview](#overview)
- [Key Features](#key-features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Quick Start](#quick-start)
- [Configuration](#configuration)
- [Usage Examples](#usage-examples)
- [Report Generation](#report-generation)
- [Logging](#logging)
- [Best Practices](#best-practices)
- [Contributing](#contributing)

---

## 🎯 Overview

This REST API Automation Framework streamlines API testing with a modular, scalable architecture. It provides a comprehensive solution for data-driven API testing with built-in support for multiple reporting formats, detailed logging, and reusable test components.

---

## ✨ Key Features

### 🏗️ **POJO Classes with Builder Pattern**
- Immutable models using Lombok's `@Builder` annotation
- Fluent API for creating complex payload objects
- Type-safe request/response handling
- Automatic getter/setter generation with Lombok

### 🧪 **TestNG Test Cases & Suites**
- Data-driven testing with parameterized test cases
- XML-based test suite configuration for organizing test execution
- Parallel test execution capabilities
- Test grouping and filtering support
- Comprehensive assertion framework

### 📊 **ExtentReports Integration**
- Auto-generated HTML dashboards with detailed test results
- Real-time test execution logs and screenshots
- Trend analysis and test categorization
- Interactive report navigation
- Multi-threaded reporting support

### 📝 **Log4j 2 Logging**
- Comprehensive logging with configurable log levels (DEBUG, INFO, WARN, ERROR)
- Multiple appenders (Console, File-based)
- Rolling file appenders for log management
- Pattern-based log formatting
- Async logging support

### 🔐 **Authentication Services**
- Token-based authentication support
- Multiple authentication mechanisms
- Session management utilities

### 🎛️ **Modular Architecture**
- **Core Utilities**: Reusable utilities for HTTP operations, data validation, and common functions
- **Models/POJOs**: Centralized request and response model definitions
- **Services**: API service abstraction layer for endpoint management
- **Test Cases**: Well-organized test classes with clear separation of concerns
- **Base Classes**: Abstract base test classes with setup/teardown logic

### 🔄 **REST Assured Integration**
- BDD-style API testing syntax
- Comprehensive HTTP method support (GET, POST, PUT, DELETE, PATCH)
- Request specification builders
- Response validation and assertion
- Schema validation support

### 🗂️ **JSON Data Processing**
- Jackson library for JSON serialization/deserialization
- POJO to JSON conversion
- JSON path for response parsing

### 📦 **Maven-Based**
- Standardized Maven project structure
- Dependency management through pom.xml
- CI/CD ready configuration
- Surefire plugin for test execution

---

## 🛠️ Tech Stack

| Component | Technology | Version |
|-----------|-----------|---------|
| **Testing Framework** | TestNG | 7.11.0 |
| **API Testing** | Rest Assured | 6.0.0 |
| **Java Compatibility** | Java | 17 |
| **Code Generation** | Lombok | 1.18.42 |
| **Reporting** | ExtentReports | 5.1.2 |
| **Logging** | Log4j 2 | 2.25.2 |
| **JSON Processing** | Jackson Databind | 2.21.0 |
| **Build Tool** | Maven | 3.x |

---

## 📁 Project Structure
