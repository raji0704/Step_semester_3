# WEEK 8 – OOPS FUNDAMENTALS
## CONCEPTUAL QUESTIONS

### 1. Explain how inheritance helps in code reuse and how a derived
class can extend or modify the behavior of a base class.

Answer:
Inheritance allows a derived class to reuse the fields and methods
of a base class. The derived class can also add new members or
override existing methods to provide specialized behavior.

Example:
An Employee class can contain common employee details such as name
and employeeId. A Manager class can inherit Employee and add
manager-specific behavior.


### 2. Explain the "is-a" relationship and why a genuine is-a
relationship matters when using inheritance.

Answer:
An is-a relationship means that an object of the derived class can
be treated as an object of the base class.

Example:
A Car is a Vehicle.

A genuine is-a relationship is important because inheritance represents
a real conceptual relationship between the classes. Using inheritance
only for unrelated classes can create incorrect designs and unnecessary
coupling.


### 3. What is method overriding? Explain with an employee salary example.

Answer:
Method overriding occurs when a derived class provides its own
implementation of a method already defined in the base class.

Example:
An Employee class may define calculateSalary(). A Manager class can
override calculateSalary() to include a management allowance.

The method that executes depends on the actual object.


### 4. Explain runtime polymorphism or dynamic method dispatch.

Answer:
Runtime polymorphism occurs when a base class reference refers to an
object of a derived class and an overridden method is called.

Example:

Employee e = new Manager();
e.calculateSalary();

The Manager version of calculateSalary() is executed at runtime.

This allows the same base reference to work with different derived
objects.


### 5. What are polymorphic collections? Explain their advantages.

Answer:
A polymorphic collection stores objects of different derived classes
using a common base class or interface reference.

Example:

List<Vehicle> vehicles;

The collection can contain Car, Bike, and Truck objects.

Advantages:
1. Different object types can be processed uniformly.
2. Common operations can be performed through the base type.
3. New derived types can often be added with minimal changes to
   common processing logic.


### 6. Compare polymorphism with repeated if/switch type checks.
Why is polymorphism preferred?

Answer:
Repeated if/else or switch statements check the type of an object and
then decide which behavior to execute.

Polymorphism allows each derived class to provide its own behavior.
The common code can call the same method without repeatedly checking
the object's type.

This reduces repeated type-checking logic and makes the design easier
to extend when new derived types are introduced.


### 7. Explain how new derived types can be added with minimal or no
changes to common logic. Use a PaymentMethod example.

Answer:
A PaymentMethod base type can define a common process such as pay().
Different classes such as CardPayment, WalletPayment, and
BankTransferPayment can provide their own implementation.

The common processing code can work with PaymentMethod references.
When a new payment type is added, the new class can implement the
required behavior without changing the common iteration logic.


### 8. Distinguish between inherited behavior and overridden behavior.

Answer:
Inherited behavior is behavior received from the base class without
providing a new implementation in the derived class.

Overridden behavior occurs when the derived class provides its own
implementation of an inherited method.

Example:
If Vehicle has startEngine(), Car may inherit it unchanged.
If Car provides its own startEngine() implementation, the Car version
is an overridden behavior.


### 9. Why is inheritance solely for code reuse without a genuine is-a
relationship inappropriate? What are the consequences?

Answer:
Inheritance represents an is-a relationship, so it should be used
when the derived class is conceptually a type of the base class.

Using inheritance only for code reuse between unrelated classes can
create an incorrect class hierarchy and unnecessary coupling.

It can make the design harder to understand, maintain, and extend.


### 10. Consider a VehicleRental system with CarRental and TruckRental.
Explain common and specialized behaviors and how inheritance can be used.

Answer:
VehicleRental can contain common behaviors such as vehicle details,
rental duration, and basic rental processing.

CarRental and TruckRental can inherit these common behaviors.

CarRental can add or override behaviors specific to cars, while
TruckRental can add or override behaviors specific to trucks.

This allows common functionality to be reused while allowing each
derived class to provide specialized behavior.