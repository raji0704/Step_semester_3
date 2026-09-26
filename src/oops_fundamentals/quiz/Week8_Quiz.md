# WEEK 8 – OOPS FUNDAMENTALS
## QUIZ QUESTIONS

### 1. Polymorphism
A PDFDocument and WordDocument both have their own render() method.
If the same if/else logic is repeatedly used to decide which render()
method to call, which OOP concept can eliminate this repeated type checking?

Answer: C) Polymorphism


### 2. Is-A Relationship
Which of the following are genuine "is-a" relationships?

A) Car is a Vehicle
B) Rectangle is a Shape
C) DatabaseConnection is a NetworkResource
D) HelperUtility contains a Calculator

Answer: A, B, C


### 3. Runtime Method Dispatch
Vehicle has a startEngine() method. Car and Motorcycle override it.
A list of Vehicle references contains both Car and Motorcycle objects.
When startEngine() is called, the correct overridden method is executed.

What concept is this?

Answer: C) Runtime method dispatch


### 4. Inheritance-Based Polymorphism
Shape defines calculateArea(). Circle and Rectangle override it.
A collection of Shape references contains Circle and Rectangle objects.

Which concept is demonstrated?

Answer: C) Inheritance-based polymorphism


### 5. Library Items
LibraryItem has getLoanPeriod(). Book and DVD are derived classes.
Book has a special loan-period rule while DVD has its own fixed rule.

Which statements apply?

A) LibraryItem provides common behavior
B) DVD must use exactly the inherited behavior
C) Book can override the inherited behavior
D) Different item types can provide different implementations

Answer: A, C, D


### 6. Animal Sounds
Animal defines makeSound(). Dog and Cat override makeSound().

Which statements are correct?

A) Dog can provide its own implementation
B) Dog and Cat must have identical implementations
C) A base Animal reference can refer to a Dog or Cat object

Answer: A, C


### 7. Payment Processor
PaymentProcessor works with a list of Payment references.
A new WalletPayment class is added.

What should happen?

A) The iteration logic must be rewritten
B) Existing Payment classes must be changed
C) WalletPayment can be added without modifying the common
iteration logic

Answer: C


### 8. Inheritance for Code Reuse
A programmer uses inheritance only to reuse code between two
unrelated classes.

What is the main problem?

A) It creates an incorrect "is-a" relationship and can increase coupling
B) It always improves flexibility
C) It removes the need for classes

Answer: A


### 9. Notification System
Notification is a base class. Different notification channels
provide their own send() implementation.

What are advantages of this design?

A) Common interface for different notification types
B) Every new type requires changing all existing code
C) Polymorphic processing can be used

Answer: A, C


### 10. Polymorphic Collections
What are benefits of using polymorphic collections?

A) Different derived objects can be stored through a common base type
B) Common operations can be performed uniformly
C) New derived types can often be added with minimal common-code changes

Answer: A, B, C