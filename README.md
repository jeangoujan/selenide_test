# UI Automation Framework

UI automation framework built with Java and Selenide

Includes CI integration with GitHub Actions and Allure reporting published via GitHub Pages

## Tech Stack

- Java 21
- Gradle 9
- Selenide 7
- JUnit 5
- Allure Report
- GitHub Actions
- GitHub Pages

## Project Overview

This project demonstrates a production style UI test automation framework

Implemented features include

- Web Form testing
- Login Form testing
- Navigation testing
- Drag and Drop testing
- Home Page validation

Tests are executed in headless Chrome inside CI

## Architecture

- Page Object Model
- Separated Steps layer for readable test scenarios
- Test data abstraction
- Secrets stored securely via GitHub Actions
- CI pipeline with automatic Allure report deployment

## Running Tests Locally

### Run all tests

./gradlew clean test

### Generate Allure report locally

allure generate app/allure-results --clean -o app/allure-report

## Continuous Integration

Workflow is triggered manually via GitHub Actions

CI pipeline performs

- Test execution
- Allure report generation
- Deployment to GitHub Pages

### Live report

https://jeangoujan.github.io/selenide_test/
