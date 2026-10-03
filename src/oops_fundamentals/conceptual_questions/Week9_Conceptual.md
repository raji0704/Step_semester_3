# Week 9 Conceptual Questions – OOPS Fundamentals

## 1. What is abstraction? Explain in your own words with a real-life example.

Abstraction means hiding unnecessary implementation details and showing only the important features to the user.

Real-life example: A person can use an ATM to withdraw money without knowing how the ATM internally communicates with the bank server.

---

## 2. What is the difference between abstraction and encapsulation? How do they work together?

Abstraction focuses on hiding implementation details and showing only essential features.

Encapsulation focuses on wrapping data and methods together and controlling access to the data.

They work together by providing a simple interface to the user while keeping the internal data and implementation protected.

---

## 3. Why can an abstract class have a constructor? When is it executed?

An abstract class can have a constructor because its constructor is used to initialize the common data of its subclasses.

The abstract class constructor is executed when an object of a concrete subclass is created.

---

## 4. Why can an abstract method not be private, static, or final?

An abstract method must be overridden by a subclass.

- `private` methods cannot be overridden.
- `static` methods belong to the class rather than being overridden as instance methods.
- `final` methods cannot be overridden.

Therefore, an abstract method cannot use these modifiers.

---

## 5. What is the diamond problem? Why does Java allow only single class inheritance but multiple interfaces?

The diamond problem occurs when a class inherits the same method or state through multiple parent classes, creating ambiguity about which implementation should be used.

Java allows a class to extend only one class to avoid this ambiguity.

However, a class can implement multiple interfaces because interfaces provide a way to define common behavior without multiple class-state inheritance.