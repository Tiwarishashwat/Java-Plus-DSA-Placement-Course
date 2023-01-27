# control-flow
It is one of the fundamental features of Java that can be used to control the flow of Java code.

Java provides three types of control flow statements.

## 1. Decision Making statements
decision-making statements decide which statement to execute and when.
It evaluates the Boolean expression.
There are two types of decision-making statements in Java, i.e., If statement and switch statement.

### a) if statements
The control of the program is diverted depending upon the specific condition.

#### 1. Simple If 
if(condition) {    
statement 1; //executes when condition is true   
} 

#### 2. If - Else
The else block is executed if the condition of the if-block is evaluated as false.

if(condition) {    
statement 1; //executes when condition is true   
}  
else{  
statement 2; //executes when condition is false   
}  

#### 3. if-else-if ladder
The if-else-if statement contains the if-statement followed by multiple else-if statements. 
It is the chain of if-else statements that create a decision tree where the program may enter in the block of code where the condition is true. We can also define an else statement at the end of the chain.

if(condition 1) {    
statement 1; //executes when condition 1 is true   
}  
else if(condition 2) {  
statement 2; //executes when condition 2 is true   
}  
else {  
statement 2; //executes when all the conditions are false   
}  

#### 4. Nested if-statement
The if statement can contain a if or if-else statement inside another if or else-if statement.

if(condition 1) {    

    statement 1; //executes when condition 1 is true   

    if(condition 2) 
    {  
        statement 2; //executes when condition 2 is true   
    }  

    else 
    {  
        statement 2; //executes when condition 2 is false   
    }  

}  


### b) switch statement
The switch statement contains multiple blocks of code called cases and a single case is executed based on the variable which is being switched.

switch (expression){  
    case value1:  
     statement1;  
     break;  
    case value2:  
     statement2;  
     break;  
    default:  
     default statement;
     // yha per break laga kr kya faida bhai?  
} 

#### Rules of using a switch case
1. The case variables can be int, short, byte, char, String or enumeration.
2. Cases cannot be duplicate.
3. Default statement is executed when any of the case doesn't match the value of expression. It is optional.
4. Break statement terminates the switch block when the condition is satisfied. It is optional, if not used, next case is executed.
5. While using switch statements, we must notice that the case expression will be of the same type as the variable. However, it will also be a constant value.

## 2. Loop statements
Sometimes we need to execute the block of code repeatedly while some condition evaluates to true.

### a) do while loop
The do-while loop checks the condition at the end of the loop after executing the loop statements. When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.

It is also known as the exit-controlled loop since the condition is not checked in advance.
Syntax ->
do     
{    
    //statements    
} while (condition);    

### b) while loop
The while loop is also used to iterate over the number of statements multiple times.
If we don't know the number of iterations in advance, it is recommended to use a while loop.
Unlike for loop, the initialization and increment/decrement doesn't take place inside the loop statement in while loop.

It is also known as the entry-controlled loop since the condition is checked at the start of the loop. If the condition is true, then the loop body will be executed.

Example is traversing a linked list (size is unknown)
Syntax ->
while(condition){  
}

### c) for loop
It enables us to initialize the loop variable, check the condition, and increment/decrement in a single line of code.
We use the for loop only when we exactly know the number of times, we want to execute the block of code.

example is iteration of an array, where size can be determined.
Syntax ->
for(initialization, condition, increment/decrement) {    
}

### d) for-each loop
Java provides an enhanced for loop to traverse the data structures like array or collection. In the for-each loop, we don't need to update the loop variable.

Syntax ->
for(data_type var : array_name){    
}

## 3. Jump statements
Jump statements are used to transfer the control of the program to the specific statements. In other words, jump statements transfer the execution control to the other part of the program.

### a) break statement
It is used to break the current flow of the program and transfer the control to the next statement outside a loop or switch statement. 
Note that it breaks only the loop where it is written.

The break statement cannot be used independently in the Java program, i.e., it can only be written inside the loop or switch statement.

### b) continue statement
Unlike break statement, the continue statement doesn't break the loop, whereas, it skips the specific part of the loop and jumps to the next iteration of the loop immediately.