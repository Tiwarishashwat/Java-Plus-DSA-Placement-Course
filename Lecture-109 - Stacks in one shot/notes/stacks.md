# Stack Data Structure using Java

## What is a Stack?
A stack is a linear data structure that follows the Last In First Out (LIFO) principle. It means the last element that was added to the stack will be the first one to be removed. Imagine a stack of books; the last book that was added to the pile will be the first book to be removed. Similarly, in a stack data structure, the last element added will be the first one to be removed.

## Stack Operations
There are two fundamental operations in a stack data structure:

Push(): This operation adds an element to the top of the stack.
Pop(): This operation removes the top element from the stack.
In addition to these basic operations, we also have the following operations:

Peek(): This operation retrieves the top element from the stack without removing it.
isEmpty(): This operation checks if the stack is empty or not.
size(): This operation returns the number of elements currently present in the stack.

## Types of Stack Implementation:
### Fixed Size Stack
A fixed size stack is a stack that has a pre-defined maximum size, and once it is reached, it cannot accept any more elements. This type of stack is useful when the maximum number of elements that can be stored is known in advance, and there is no need to add more elements than the pre-defined size. Fixed size stacks are implemented using arrays.

#### Fixed size stacks have the following advantages:
1. They are simple and easy to implement.
2. They are efficient in terms of memory usage because the size is fixed.
3. They are faster than dynamic size stacks because they do not have to check for resizing.

#### However, fixed size stacks have a few disadvantages:
1. They are limited in size and cannot accept more elements than the pre-defined size.
2. They may waste memory if the stack is not completely full.
3. They cannot be resized once the maximum size is reached.

### Dynamic Size Stack
A dynamic size stack, also known as a resizable stack, is a stack that can grow or shrink in size as needed. Dynamic size stacks are implemented using dynamic arrays, such as ArrayLists in Java or LinkedList.

#### Dynamic size stacks have the following advantages:
1. They can grow or shrink in size as needed, making them more flexible than fixed size stacks.
2. They do not waste memory because they can resize dynamically.
3. They can accept any number of elements, unlike fixed size stacks.

#### However, dynamic size stacks also have a few disadvantages:
1. They may be slower than fixed size stacks because of the overhead involved in resizing.
2. They may cause memory fragmentation if elements are frequently added and removed.
3. They may not be as memory-efficient as fixed size stacks for small data sets.


