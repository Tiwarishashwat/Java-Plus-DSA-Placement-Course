# Java-Collections-Course
Free Java Collection Resources

# What is a Framework?

To do a specific task, we require specific classes / functions / 
interfaces. 
Like if we want to write a program related to a calculator application,
we require ---> 
1. a method to take input from device to calculator application
2. for processing we need some functions like add(), subtract(), etc
3. again for logging the output of calculator application to the device we
need some output writing methods like log(), display(), etc.

So, everytime, you want to create a calculator application, 
would you want to do it from scratch? 
Obviously, no. We would simply use these pre-defined codes 
and on top of it, we will write our own code!

So for ease, we put all these pre-written codes, may it be classes, 
functions, interfaces, callbacks, listeners, constants, etc etc 
inside one place and that is nothing but a framework. 

Therefore, Framework are the bodies that contains the pre-written codes 
(classes and functions) in which we can add our code to overcome the 
problem.

Spring, Collections, etc are example of Frameworks in Java.

# What is a collection in Java?
A Collection represents a single unit of objects.


# List Interface ->
1. The List interface in Java provides a way to store the ordered collection. 
2. It is a child interface of Collection. 
3. It is an ordered collection of objects in which duplicate values can be stored. 
4. Since List preserves the insertion order, it allows positional access 
   and insertion of elements.
5. It is a factory of ListIterator interface. 
6. Through the ListIterator, we can iterate the list in forward 
   and backward directions. 
7. The implementation classes of the List interface are ArrayList, LinkedList,
 Stack, and Vector. 

# Signature of List interface -> 
public interface List<E> extends Collection<E>;

# How do we initialize an interface?
1. List<Obj> list1 = new ArrayList<Obj> ();
2. List<Obj> list2 = new LinkedList<Obj> ();
3. List<Obj> list3 = new Vector<Obj> ();
and so on..

# Some basic functionalities ->
list1.add(obj);
list1.add(index, obj); //move objects to right (index to N)
list1.set(index, obj); //update value at index
list1.remove(obj); /remove obj [ first occurance in case of multiple ]
list1.remove(1); //move objects to the left
equals(obj); // equates the objects with all the elements.
sort(comparator); // sorts the collection on the basis of comparator


# ArrayList class->
1. It is just like a dynamic Array.
2. It has initial capacity of 10.
3. It increases its capacity with n + n/2 +1 formula.


# Stack class->
1. It follows Last in first out methodology.
2. Push , pop, peek are some commonly used methods.
3. It also follows capacity logic.

# Linked List class ->
Queue and List both interfaces can be implemented by LinkedList class->
1. Elements are not stored in the memory in contiguous fashion.
2. LinkedList class internally uses the doubly linked list.
3. It does not follow the capacity logic as linked list are purely dynamic in nature.

# Bonus points ->
1. ListIterator Interface is used to traverse the element in a backward and forward direction.

# How to create a list iterator

List<String> myList=new ArrayList<String>();    
ListIterator<String> itr=myList.listIterator();

# Functionalities of List Iterator ->
a. hasPrevious() / hasNext()
b. previous() / next()

# What is the Difference between ArrayList and LinkedList ->

1) ArrayList internally uses a dynamic array to store the elements.	
LinkedList internally uses a doubly linked list to store the elements.

2) Manipulation with ArrayList is slow because it internally uses an array. 
If any element is removed from the array, all the other elements are shifted 
in memory.	
Manipulation with LinkedList is faster than ArrayList because it uses 
a doubly linked list, so no bit shifting is required in memory.

3) An ArrayList class can act as a list only because it implements List only.
LinkedList class can act as a list and queue both because it implements 
List and Deque interfaces.

4) ArrayList is better for storing and accessing data.	
LinkedList is better for manipulating data.

5) The memory location for the elements of an ArrayList is contiguous.	
The location for the elements of a linked list is not contagious.

6) Generally, when an ArrayList is initialized, a default capacity of 10 
is assigned to the ArrayList.	
There is no case of default capacity in a LinkedList. 
In LinkedList, an empty list is created when a LinkedList is initialized.

7) To be precise, an ArrayList is a resizable array.	
LinkedList implements the doubly linked list of the list interface.


# Queue Interface->
1. Front - deletion happens at the front end.
2. Rear - insertion happens at the rear end.

# Using LinkedList class ->
1. queue.offer(element) //false in case of error //insert the element, 
	1.1 alternate is add() - throws exception if element can't be inserted
2. queue.poll(element) //null in case of error //delete the element, 
	2.1 alternate is remove() - throws exception if element can't be removed
3. queue.peek() //null in case of empty. //next element to see, 
	3.1 alternate is element() - throws exception

# Priority Queue class
1. It is also a queue but with a priority and how do we implement it? using min heap(default).
-> Queue<Integer> minpq = new PriorityQueue<Integer>();
for max heap ->
-> Queue<Integer> maxpq = new PriorityQueue<Integer>(Comparator.reverseOrder());

Alternatively, you can write custom comparator in java.

# using Dequeue Inteface ( Double ended queue )
Insertion and deletion, both can be performed at either ends.
Operations ->
1. peek(),
2. peekFirst()
3. peekLast()

4. poll()
5. pollFirst()
6. pollLast()

7. offer()
8. offerFirst()
9. offerLast()


# Map ->
1. Map is used for storing Key-Value pairs.
2. Keys will always be unique.
3. Values can repeat.
4. Data type of key and value may or may not be same. 
5. The load factor is the measure that decides when to increase 
the capacity of the Map.

# HashMap class->
1. Uses the concept of hashing to store the elements.
2. Order is not maintained in the map.
3. Some methods are :
   map.get()
   map.put()
   map.getOrDefault(key, defaultValue)
   map.putIfAbsent(key, value)
   map.containsKey()
   map.containsValue()

# Map Signature ->
Map<Integer, String> map = new HashMap<Integer, String>();

//To Iterate over the keys.

for(Integer key : map.keySet())
{
    System.out.println(key);
}

// To Iterate over the keys.

for(String value : map.values())
{
    System.out.println(value);
}


// To Iterate over the keys.

for(Map.Entry<Integer, String> e : map.entrySet())
{
    System.out.println(e.getKey() + "ello ello" + e.getValue()) ;
}

# TreeMap class ->
1. Sorted Order is maintained.

# Concept used -->
A red-black tree is a self-balancing binary search tree 
where each node has an extra bit as the colour (red or black). 
These colours are used to ensure that the tree remains balanced 
during insertions and deletions. 

Although the balance of the tree is not perfect but 
it is good enough to reduce the searching time to around O(log n) 
 
# properties -->
1. The root node must be Black in colour.
2. The red node can not have a red colour neighbours node.
3. All the paths from the root to the null shoul contain same number
of black nodes.

The left elements are always less than the parent element.
Natural ordering is computed in logical comparison of the objects.
The right elements are always greater than or equal to the parent element.

# Set Interface
1. Duplicates are not allowed in set.

# HashSet 
1. Uses hasing concept for storing the elements.
2. Insertion order is not preserved.
3. Uses "equals" method of Object class for comparing.
4. Uses "hashCode" method of Object class for comparing. 

# Linked HashSet
1. Stores unique elements.
2. Insertion order is preserved.

# Tree HashSet
1. Elements will be maintained in sorted order.
2. It follows Hashing concept.
3. It is build on top of SB Binary Search Tree.
