# (Methods) Functions in Java
Method in Java or Java Method is a block of code that perform some specific task and it may or may not return the result to the caller.
Method in java should be part of some class.

Method syntax:
<access_modifier> <return_type> <method_name>(list_of_parameters)
{
    //function body 
}

The parameters that appear in the function definition are called formal parameters and, the parameters that appear in the function call statement are called actual parameters.

Main advantage is "Code Reusability".

The Exception list will be covered in Exception Handling.

1. Predefined Method: 
Predefined methods are the method that is already defined in the Java class libraries is known as predefined methods. It is also known as the standard library method or built-in method. We can directly use these methods just by calling them in the program at any point. 

2. User-defined Method:
The method written by the user or programmer is known as a user-defined method. These methods are modified according to the requirement.

Method Signature
It consists of the method name and a parameter list (number of parameters, type of the parameters, and order of the parameters).
Example

calculate(int a, int b)

1. While defining a method, remember that the method name must be a verb and start with a lowercase letter.
2. If the method name has more than two words, the first name must be a verb followed by an adjective or noun.
3. In the multi-word method name, the first letter of each word must be in uppercase except the first word. For example, findSum, computeMax, setX and getX.


A method needs to be called..

It returns to the code that invoked (called) it when:  
1. It completes all the statements in the method
2. It reaches a return statement
3. Throws an exception


Methods calls are implemented through a stack. Whenever a method is called a stack frame is created within the stack area and after that, the arguments passed to and the local variables and value to be returned by this called method are stored in this stack frame and when execution of the called method is finished, the allocated stack frame would be deleted. There is a stack pointer register that tracks the top of the stack which is adjusted accordingly.

In Java, all primitives like int, char, etc are pass by value.
 but all non-primitives (or objects of any class) are always references.

Java creates a copy of references and pass it to method, but they still point to same memory reference.

Method Overloading in Java
When there are two or more than two methods in a class that have the same name but different parameters, it is known as method overloading. Java allows a function to have the same name if it can distinguish them by their number and type of arguments.


Types of instance methods (non-static):
1. Accessor Method
2. Mutator Method

The method(s) that reads the instance variable(s) is known as the accessor method.
They are also known as getter.
The method(s) read the instance variable(s) and also modify the values are known as the mutator methods. They are also known as setter.

Method overloading


