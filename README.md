# Mini Bank System

This is a simple Object-Oriented Programming (OOP) project that simulates basic banking operations using Java. It was created as part of a practical assignment to apply core OOP concepts including classes, inheritance, polymorphism, and encapsulation.

## Features

- Create new bank accounts
- Deposit money into an account
- Withdraw money from an account
- View individual account details
- Support for both regular and savings accounts
- Apply interest to savings accounts

## Technologies Used

- Java
- Console input/output

## How It Works

The program provides a menu-driven console interface where users can:
1. Create a new account (regular or savings)
2. Deposit funds by account number
3. Withdraw funds by account number
4. View details of a specific account
5. Exit the program

Savings accounts have an additional `interestRate` and a method to apply interest to the balance.

## Project Structure

- `Main.java` - Handles user interaction and application flow
- `BankAccount.java` - Base class for bank accounts
- `SavingsAccount.java` - Inherits from `BankAccount` and includes interest logic

## OOP Concepts Practiced

- **Encapsulation**: Fields are private and accessed via methods
- **Inheritance**: `SavingsAccount` extends `BankAccount`
- **Polymorphism**: Method overriding (`showAccountInfo`)
- **Abstraction**: Clear class responsibilities

## Getting Started

1. Clone the repo or copy the files.
2. Compile the files using `javac`.
3. Run `Main.java` using your terminal or IDE.

```bash
javac Main.java BankAccount.java SavingsAccount.java
java Main

## License

This project is for educational purposes and has no associated license.
