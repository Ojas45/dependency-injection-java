# Dependency Injection in Java (Car–Engine Example)

This repository demonstrates the concept of **Dependency Injection (DI)** in Java using a simple **Car–Engine** example.  
It shows how using interfaces and injecting dependencies improves **loose coupling**, **flexibility**, and **testability**.

---

## 📌 What is Dependency Injection?

Dependency Injection is a design pattern in which an object **does not create its own dependencies**, but instead **receives them from an external source**.

In this project:
- `Car` depends on an `Engine`
- Different engine implementations are injected into `Car`
