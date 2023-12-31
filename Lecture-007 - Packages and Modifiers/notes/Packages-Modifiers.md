# Java Packages?
A java package is a group of similar types of classes, interfaces and sub-packages.
Package in java can be categorized in two form, built-in package and user-defined package.
There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
It provides access protection.
It removes naming collision.

There are three ways to access the package from outside the package:
1. import package.*; // classes and interfaces will be accessible but not subpackages.
2. import package.classname; //only declared class of this package will be accessible.
3. fully qualified name. //only declared class of this package will be accessible and there is no need to import

// java.util and java.sql packages contain Date class, so it is better to use fully qualified names.
// Note: Subpackages are needed to be imported explicitly, as they won't be part of parent package import.  

Sequence that needs to be followed:
1. first declare package
2. then import the package
3. then declare your class

System is available in java lang package.

In java, we use a specific format for defining the package names.
Standard-> domain.company.package
Example-> com.youtube.shashwat

Note: lang package is imported by default.

# Modifiers in Java
There are two types of modifiers in Java: access modifiers and non-access modifiers.

# Access Specifiers
1. Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
The default access modifier is also called package-private.

3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.

4. Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

# Non Access Specifiers
In java, we have 7 non-access modifiers. They are used with classes, methods, variables, constructors, etc to provide information about their behavior to JVM.

1. static - The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes.
When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object.

A. Static Block - 
If you need to do the computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, when the class is first loaded. 

int a=2;
int b=0;

  // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 7 + 2;
    }

B. Static Variable - 
When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level.
We can create static variables at the class level only
static block and static variables are executed in the order they are present in a program.

C. Static Method -
When a method is declared with the static keyword, it is known as the static method. The most common example of a static method is the main() method.
Methods declared as static have several restrictions: 
1. They can only directly call other static methods.
2. They can only directly access static data.
3. They cannot refer to "this" or "super" in any way.

D. Static Classes - 
A class can be made static only if it is a nested class. We cannot declare a top-level class with a static modifier but can declare nested classes as static. Such types of classes are called Nested static classes. Nested static class doesn’t need a reference of Outer class. In this case, a static class cannot access non-static members of the Outer class.  

2. final - final keyword is used in different contexts. First of all, final is a non-access modifier applicable only to a variable, a method, or a class.
Final Variable - To create a constant variable.
Final Methods - To prevent method Overloading.
Final Class - To  prevent Inheritance

3. abstract - The abstract keyword is a non-access modifier, used for classes and methods.
An abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
An abstract method can only be used in an abstract class, and it does not have a body.

4. synchronized - Multi-threaded programs may often come to a situation where multiple threads try to access the same resources and finally produce erroneous and unforeseen results. If we want only one thread can access the resource at a given point in time then we use synchronized keyword.

5. transient - transient is a variables modifier used in serialization. At the time of serialization, if we don’t want to save value of a particular variable in a file, then we use transient keyword. When JVM comes across transient keyword, it ignores original value of the variable and save default value of that variable data type.
Practically we serialized only those fields which represent a state of instance, after all serialization is all about to save state of an object to a file. It is good habit to use transient keyword with private confidential fields of a class during serialization.

6. volatile - Using volatile is yet another way (like synchronized, atomic wrapper) of making class thread-safe. Thread-safe means that a method or class instance can be used by multiple threads at the same time without any problem. volatile keyword here makes sure that the changes made in one thread are immediately reflect in other thread

7. native - The native keyword in Java is applied to a method to indicate that the method is implemented in native code. The methods which are implemented in C, C++ are called native methods or foreign methods. native keyword can only be applied to those methods.