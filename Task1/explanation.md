# Task 1: Payment Processing System 💳💰
Welcome to the **Payment Processing System** project! 🚀 This project demonstrates the application of SOLID principles in a payment processing system, allowing for flexibility and easy maintenance.

## Overview 📝
In this project, we built a payment processing system that supports various payment methods. The system is designed with **SOLID principles** in mind to ensure it's flexible, maintainable, and extendable.

### Features 🌟
- Supports multiple payment methods:
    - Credit Card 💳
    - PayPal 🏦
    - Mobile Payment 📱
- Easily add new payment methods (like **Bank Transfer** 🏛️) without modifying existing code.
- Apply different promo codes for discounts 🎁.

## SOLID Principles Applied ⚙️

### 1. **Single Responsibility Principle (SRP)**
Each class in the system has a single responsibility:
- `PaymentProcessor` handles processing the payment.
- `Discount` applies promo codes.
- `CreditCardPayment`, `PayPalPayment`, and `MobilePayment` handle their specific payment methods.

### 2. **Open/Closed Principle (OCP)**
The system is open for extension (new payment methods can be added) but closed for modification (existing code doesn't need to change). For example, if we need to add a new payment method like **BankTransfer**, we can do so by simply adding a new class that implements the `PaymentMethod` interface without modifying existing classes.

### 3. **Liskov Substitution Principle (LSP)**
Any subclass (like `CreditCardPayment`, `PayPalPayment`, or `MobilePayment`) can replace its parent class (`PaymentMethod`) without breaking the system. This is because all payment methods adhere to the same contract defined by the interface.

### 4. **Interface Segregation Principle (ISP)**
We created a fine-grained interface, `PaymentMethod`, with specific methods that all payment methods implement. This ensures that classes don't depend on methods they don't use.

### 5. **Dependency Inversion Principle (DIP)**
The `PaymentProcessor` depends on the abstraction (`PaymentMethod` interface) rather than concrete implementations (`CreditCardPayment`, `PayPalPayment`, etc.). This allows for flexibility and easier extension.
