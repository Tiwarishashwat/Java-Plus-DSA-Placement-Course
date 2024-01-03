# Link for JDK Installation
https://download.oracle.com/java/19/latest/jdk-19_windows-x64_bin.exe

# Link for Java Document 
https://docs.oracle.com/en/java/javase/19/

# Link for VS Code
https://code.visualstudio.com/download

# Link for IntelliJ Idea
https://www.jetbrains.com/idea/

# Link for Java Eclipse
https://www.eclipse.org/downloads/packages/


# What is entrypoint of a Java Program?
In Java programs, the point from where the program starts its execution 
or simply the entry point of Java programs is the main() method.

JVM Searches for a main method, if it is not found then the execution will not take place!
Also, when a java program starts, a daemon thread is attached to the main method, 
and this thread gets destroyed only when the Java program stops execution.

# Example of a function signature?
public static void main(String[] args)

- public is a access specifier!
- static is a keyword!
- void is a return type!
- main is the name of the method!
- () dennotes the function
- String is a data type
- [] dennotes an array
- args is the local variable name which is passed as a function parameter!

# Why main method uses public keyword?
Public is an Access modifier, which specifies from where and who can access the method. 
Making the main() method public makes it globally available. It is made public so that 
JVM can invoke it from outside the class as it is not present in the current class.

# Why is main method static?
It is a keyword that is when associated with a method, making it a class-related method. 
The main() method is static so that JVM can invoke it without instantiating the class. 
This also saves the unnecessary wastage of memory which would have been used by the 
object declared only for calling the main() method by the JVM.

# Why we use void in main()?
It is a keyword and is used to specify that a method doesn’t return anything. 
As the main() method doesn’t return anything, its return type is void but 
still we can use return keyword to return void from the function. 

As soon as the main() method terminates, the java program terminates too.
Hence, it doesn’t make any sense to return from the main() 
method as JVM can’t do anything with the return value of it.

# What is main?
It is the name of the Java main method. It is the identifier that the 
JVM looks for as the starting point of the java program. It’s not a keyword.

# Can we execute a java program without main method?

Yes, we can execute a java program without a main method by using a static block.
A static block in Java is a group of statements that gets executed only once 
when the class is loaded into the memory by ClassLoader, 
It is also known as a static initialization block, and it goes into the stack memory.
Won't run on java 8 and above!

Example ->
class JavaPlusDSA {
    static
    {
        System.out.println("Mai chala toh sbko current laga re!!!!");
    }
}


What are comments?
Comments can be used to explain Java code, and to make it more readable.

"Best use of comments is that you can comment the Bug in the program and 
the Bug will be resolved?" Wait, don't try this,I am just joking!
Bug will be gone but so will your job opportunity, lol!

Single Line Comments ->
Single-line comments start with two forward slashes (//).
Multi-line comments start with /* and ends with */.






























