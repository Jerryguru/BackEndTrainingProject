package com.ar.oops.abstractclass;

public class Notes {


    /*In Java, an abstract class is a class that cannot be instantiated and is designed to be extended by other classes. It is used to achieve partial abstraction, where some methods are implemented while others are left for subclasses to define. An abstract class is declared using the abstract keyword. It may contain:

Abstract methods (methods without a body)
Concrete methods (methods with implementation)
Constructors
Instance variables
Static and final methods
Syntax:
abstract class ClassName {
    abstract void methodName();   // Abstract method
 void concreteMethod() {        // Concrete method
     System.out.println("Method implementation");
   }
}
    *Example 1: Abstract Class with Partial Abstraction
    Explanation: The abstract class contains both abstract and non-abstract methods. The child class implements the abstract method while inheriting the normal method.

Example 2: Abstract Class with Only Abstract Method.
Explanation: This example defines an abstract class with only abstract methods, and the child class implementation. Object is created using child class reference.

Example 3: Abstract Class with Constructor and Methods.
Explanation: Here, the abstract class has a constructor which is called when the child class object is created. It also contains methods used by the child class.

Properties of Abstract class
Let us elaborate on these observations and do justify them with help of clean java programs as follows.

Observation 1
In Java, just like in C++ an instance of an abstract class cannot be created, we can have references to abstract class type though.
    *Observation 2
Like C++, an abstract class can contain constructors in Java. And a constructor of an abstract class is called when an instance of an inherited class is created.
    *Observation 3
In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated but can only be inherited.
Observation 4
Abstract classes can also have final methods (methods that cannot be overridden)
Observation 5
For any abstract java class we are not allowed to create an object i.e., for an abstract class instantiation is not possible.
Observation 6
Similar to the interface we can define static methods in an abstract class that can be called independently without an object.
Observation 7
We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
Observation 8
If a class contains at least one abstract method, it must be declared as abstract; otherwise, a compile-time error occurs, since the class has an incomplete implementation and object creation must be restricted.

    *
    *
    *
    *
    * */
}
