# Exercise 1: Implementing the Singleton Pattern

## Objective

Implement the Singleton Design Pattern in Java to ensure that only one instance of a Logger class exists throughout the application lifecycle.

## Files

* `Logger.java` - Implements the Singleton Pattern.
* `TestLogger.java` - Tests the Singleton implementation.

## Singleton Pattern

The Singleton Pattern is a creational design pattern that ensures:

1. Only one instance of a class is created.
2. A global access point is provided to access that instance.

## Implementation Details

### Logger Class

* Private static instance variable stores the single object.
* Private constructor prevents object creation from outside the class.
* Public static `getInstance()` method returns the same object every time.

### TestLogger Class

* Retrieves the Logger instance multiple times.
* Verifies that the same object is returned.
* Demonstrates logging functionality.

## Expected Output

Logger instance created.
Log: First message
Log: Second message
Only one Logger instance exists.

## Author

Kaushal Amara
