# Task 2: Notification System 📲✉️

Welcome to the **Notification System** project! 🚀 This system allows sending notifications via multiple channels (SMS, Email, Push Notification, Slack) with a design that adheres to **SOLID principles** for flexibility and maintainability.

## Overview 📝

The goal of this project is to design a **Notification System** that supports various notification channels such as **SMS**, **Email**, **Push Notification**, and **Slack**. The system is built with flexibility in mind, making it easy to add new channels without modifying existing code.

### Features 🌟
- Supports multiple notification types:
    - **SMS Notification** 📱
    - **Email Notification** ✉️
    - **Push Notification** 🔔
    - **Slack Notification** 💬
- Bulk notifications: Send notifications to multiple users at once.
- Easily extendable to add new types of notifications without modifying existing classes.

## SOLID Principles Applied ⚙️

### 1. **Single Responsibility Principle (SRP)**
Each notification class (`SMSNotification`, `EmailNotification`, `PushNotification`, `SlackNotification`) is responsible for sending a specific type of notification. This ensures that each class has one clear responsibility.

### 2. **Open/Closed Principle (OCP)**
The system is designed to be **open for extension** but **closed for modification**. For example, if we need to add a new notification channel like **SlackNotification**, we can do this by creating a new class that implements the `Notification` interface without modifying any existing classes.

### 3. **Dependency Inversion Principle (DIP)**
The `Task2` class depends on the `Notification` abstraction (interface) rather than on concrete implementations like `SMSNotification` or `EmailNotification`. This ensures that the system is flexible and can work with any notification type as long as it implements the `Notification` interface.

## Conclusion 💡
This project demonstrates how the SOLID principles help create a flexible and maintainable notification system. By following these principles, we can easily extend the system to support new notification types or additional functionality without modifying the existing code.
