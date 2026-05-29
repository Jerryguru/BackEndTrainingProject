/*
package com.ar.oops.abstractclass;

public class Notes {


    In Java, an abstract class is a class that cannot be instantiated and is designed to be extended by other classes. It is used to achieve partial abstraction, where some methods are implemented while others are left for subclasses to define. An abstract class is declared using the abstract keyword. It may contain:

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





JVM ARCHITECTURE
“JVM stands for Java Virtual Machine. It is one of the most important parts of Java because it is responsible for executing Java programs. The main advantage of JVM is platform independence, which means Java bytecode can run on any operating system that has a JVM installed. The JVM architecture mainly consists of Class Loader Subsystem, Runtime Data Areas, Execution Engine, JNI, and Native Method Libraries.

The execution of a Java program starts with a Java source file, which has a `.java` extension. This source code is compiled by the Java compiler, called `javac`, and converted into bytecode, which is stored in a `.class` file. This bytecode is not machine code, so it cannot directly communicate with the operating system. Therefore, the JVM takes responsibility for executing this bytecode.

The first component inside JVM is the Class Loader Subsystem. Its main responsibility is loading class files into memory. It performs three major activities: Loading, Linking, and Initialization. During the loading phase, JVM loads the required classes using different class loaders such as Bootstrap Class Loader, Extension Class Loader, and Application Class Loader. The Bootstrap Class Loader loads core Java classes like `String`, `System`, and `Object`. The Extension Class Loader loads extension libraries, while the Application Class Loader loads user-defined classes.

After loading, the next step is Linking. Linking contains three sub-steps: Verify, Prepare, and Resolve. In the Verify phase, JVM checks whether the bytecode is valid and secure. In the Prepare phase, memory is allocated for static variables and default values are assigned. In the Resolve phase, symbolic references are converted into actual memory references. After linking, the Initialization phase begins, where original values are assigned to static variables and static blocks are executed.

Once classes are loaded and initialized, memory management is handled by Runtime Data Areas. These are memory sections created by JVM during program execution. The first memory area is the Method Area, which stores class metadata, method details, static variables, and constant pool information. The second memory area is the Heap Area, which is the most important memory section because all objects are created and stored here. Heap memory is shared among all threads.

The next memory area is the Stack Area. Every thread in Java has its own stack memory. Stack memory stores local variables, method calls, and partial results. Whenever a method is called, a stack frame is created inside the stack. This stack frame contains Local Variable Array, Operand Stack, and Frame Data. After method execution, the stack frame is automatically destroyed. JVM also contains PC Registers, also called Program Counter Registers. Each thread has its own PC Register, which stores the address of the currently executing instruction. Another memory area is the Native Method Stack, which is used for native methods written in languages like C and C++.

The next important component is the Execution Engine. Its job is to execute bytecode. It mainly contains the Interpreter, JIT Compiler, and Garbage Collector. The Interpreter reads bytecode line by line and converts it into machine code. Although it starts execution quickly, it becomes slow for repeatedly executed code. To solve this problem, JVM uses the JIT Compiler, which stands for Just-In-Time Compiler. The JIT Compiler identifies frequently used code and converts it into native machine code, improving performance and execution speed. Inside the JIT Compiler, there are components like Intermediate Code Generator, Code Optimizer, Target Code Generator, and Profiler.

Another important part of the Execution Engine is Garbage Collection. The Garbage Collector automatically removes unused objects from heap memory. This helps in efficient memory management and reduces memory leaks. For example, if an object no longer has any reference, it becomes eligible for garbage collection.

JVM also contains JNI, which stands for Java Native Interface. JNI acts as a bridge between Java applications and native applications written in languages like C and C++. Using JNI, Java can call native methods. To support these native methods, JVM uses Native Method Libraries, which contain native library files like `.dll` and `.so`.

Finally, after bytecode execution and machine code generation, the operating system executes the machine code and produces output. In summary, JVM architecture provides class loading, memory management, bytecode execution, garbage collection, and platform independence, which makes Java powerful, secure, and portable.”

    *RUN TIME DATA AREA
    “Runtime Data Area is one of the most important parts of JVM architecture. It is the memory area created by JVM during the execution of a Java program. The Runtime Data Area is mainly divided into five parts: Method Area, Heap Area, Stack Area, PC Register, and Native Method Stack. Some memory areas are shared among all threads, while some are thread-specific.

    The first memory area is the Method Area, also called MetaSpace in Java 8 and above. This area stores class-level information such as class structure, static variables, static methods, static blocks, and runtime constant pool. Since static members belong to the class rather than objects, they are stored in the Method Area. For example, if we declare static int x = 100, the variable x is stored in the Method Area. This area is shared among all threads.

    The next important memory area is the Heap Area. Heap memory is mainly used to store objects and instance variables. Whenever we create an object using the new keyword, memory is allocated inside the Heap Area. For example, in Student s = new Student();, the actual Student object is created in heap memory, while the reference variable s is stored in stack memory. Heap memory is the largest memory area in JVM and is shared among all threads. Heap memory also contains the String Pool, where string literals are stored to improve memory optimization. If heap memory becomes full, JVM throws java.lang.OutOfMemoryError.

            The next memory area is the Stack Area. Every thread in Java has its own separate stack memory. Stack memory stores local variables, method calls, reference variables, and partial results. Whenever a method is called, a stack frame is created inside the stack. This stack frame contains Local Variable Array, Operand Stack, and Frame Data. For example, variables like int a = 10 or references like Employee e1 are stored in stack memory. Once the method execution completes, the stack frame is automatically removed. Since stack memory is limited, excessive method calls or infinite recursion can cause java.lang.StackOverflowError.

    Another important part of Runtime Data Area is the PC Register, which stands for Program Counter Register. Each thread has its own PC Register. Its job is to store the address of the currently executing instruction. It helps JVM track which instruction should execute next. For example, while executing System.out.println("Hello");, the PC Register keeps track of the current instruction location.

    The final memory area is the Native Method Stack. This memory area is used for native methods written in languages like C and C++. If Java interacts with operating system-level code through JNI, the native method information is stored inside the Native Method Stack.

    In summary, Runtime Data Areas are responsible for memory management during program execution. Method Area stores class-level data, Heap Area stores objects, Stack Area stores local variables and method calls, PC Register tracks current execution instructions, and Native Method Stack supports native methods. Together, these memory areas help JVM execute Java programs efficiently and manage memory properly.”*/
/**//*

    *
    *
    *
    *
}
*/
