# What is HashSet?
In Java, a HashSet is a part of the Java Collections Framework and 
is used to store unique elements. It implements the Set interface and
is backed by a hash table. The HashSet class does not guarantee the 
order of elements and allows the use of null elements.
HashSet internally uses the hashmap keys.

# Functions of HashSet
## Add
add()

The add(E element) method is used to add an element to the HashSet. 
It returns true if the element was added successfully, and false if
the element is already present in the set.
## Contains
contains()

The contains(Object o) method is used to check whether a specific 
element is present in the HashSet. It returns true if the element 
is found and false otherwise.

## Remove
remove()

The remove(Object o) method is used to remove a specific element from 
the HashSet. It returns true if the element was present and removed 
successfully, and false if the element was not found in the set.

## Traversing
### For Each:
    You can iterate using for each loop, but order is not guarenteed.
    Also, while iterating you cannot remove an element. If we use remove
    function inside the for each loop, then we will get 
    "ConcurrentModificationException".
### Set Iterator:
    In Java, the Iterator interface provides a way to iterate over a 
    collection of objects. The Set interface, being a part of the Java 
    Collections Framework, extends the Collection interface and includes
    methods for working with sets of unique elements. The Iterator 
    interface is commonly used to traverse elements in a Set.
    Adding element in a set while iterating is not allowed.
    Removing element in a set while iterating is allowed.
    

## How the Iterator works with a Set:

The Iterator interface provides two main methods for iterating through
a collection:

hasNext(): Returns true if there are more elements in the collection.

next(): Returns the next element in the collection.

It's crucial to use hasNext() before calling next() to avoid 
"NoSuchElementException" when there are no more elements.

### Removing elements during iteration:

The Iterator also provides a remove() method that allows you to 
remove elements from the underlying collection during iteration.
IllegalStateException can occur when you try to remove an element 
using the remove() method of the Iterator without a preceding call
to the next() method.
The remove() method in the Iterator interface is designed to remove
the last element returned by the next() method. If you call remove()
without calling next() first, the iterator doesn't have a "current"
element to remove, and it throws an IllegalStateException.