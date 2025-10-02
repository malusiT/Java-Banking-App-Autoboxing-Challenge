Banking Application - Autoboxing & Unboxing Challenge
A simple Java banking application demonstrating the use of autoboxing and unboxing with wrapper classes, featuring customer management and transaction handling.
Challenge Overview
This project implements a banking system with two main components:
Customer Class

Stores customer name and transaction history
Manages an ArrayList of Double transactions
Supports both credit (positive) and debit (negative) transactions
Demonstrates autoboxing when adding primitive values to the ArrayList

Bank Class

Manages multiple customers
Prevents duplicate customer entries
Adds transactions to existing customers
Demonstrates unboxing when processing transaction amounts

Features Implemented
Completed

Customer class with name and transaction list
Two constructors for Customer (with and without transactions)
addCredit() and addDebit() methods with validation
Bank class with customer management
findCustomer() method to check for existing customers
addCustomer() method with duplicate prevention
addCustomerTransaction() method for adding transactions
printStatement() method for customer details
Proper equals() and hashCode() implementation
Autoboxing implementation (primitives to wrapper objects)

Needs Fixing

Logic Error in Validation (Critical)

Current code (INCORRECT):
javaif(credit > 0) throw new IllegalArgumentException(...);
Should be:
javaif(credit <= 0) throw new IllegalArgumentException(...);

addCredit(): Change if(credit > 0) to if(credit <= 0)
addDebit(): Change if(debit > 0) to if(debit >= 0)


Missing Explicit Unboxing

Add this to addCustomerTransaction():
javadouble unboxedAmount = amount; // Unboxing Double to double
Future Enhancements

Add a constructor for Bank that initializes an empty customer list
Implement balance calculation method
Add transaction history filtering (credits only, debits only)
Implement toString() for Bank class
Add null checks for transaction amounts
Create a main method with test cases
Add exception handling for edge cases

Technologies Used

Java (Core)
ArrayList (Collections Framework)
Wrapper Classes (Double)
OOP Principles (Encapsulation, Equals/HashCode)

Key Concepts Demonstrated
Autoboxing
Automatic conversion from primitive types to wrapper objects:
javadouble amount = 100.50;
transactions.add(amount); // Autoboxing: double to Double
Unboxing
Automatic conversion from wrapper objects to primitive types:
javaDouble wrapper = 50.0;
double primitive = wrapper; // Unboxing: Double to double
Learning Outcomes

Understanding of autoboxing and unboxing in Java
Working with generic collections (ArrayList)
Implementing proper equality checks with equals() and hashCode()
Input validation and error handling
Object-oriented design principles

Usage Example (To Be Tested)
javapublic static void main(String[] args) {
    // Create bank
    Bank myBank = new Bank("Java Bank", new ArrayList<>());
    
    // Create customer
    Customer john = new Customer("John Doe");
    
    // Add customer to bank
    myBank.addCustomer(john);
    
    // Add transactions
    myBank.addCustomerTransaction(john, 1000.0);  // Credit
    myBank.addCustomerTransaction(john, -250.50); // Debit
    
    // Print statement
    myBank.printStatement(john);
}
Known Issues

Validation logic is inverted - throws errors for valid inputs
Unboxing not explicitly demonstrated - needs to be added
No main method testing - untested code

Author
Created as part of a Java programming challenge focusing on wrapper classes and autoboxing/unboxing concepts.
Status
Current Version: 0.9 (Pre-release)
Last Updated: October 2025
Status: Awaiting bug fixes before v1.0 release
Next Steps

Fix validation logic in Customer class
Add explicit unboxing in Bank class
Test with main method
Push to GitHub
Release v1.0


This project is a work in progress and will be updated soon!
