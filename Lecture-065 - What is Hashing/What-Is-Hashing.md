# What is Hashing?
Hashing is a technique where you pass a key to a function and this function generates
a code, this hashCode can be used in various places.
Here, key is the data given by user, function is a HashFunction and code is a hashCode.
This hashCode code is unique for a given key.
For Example,
Key = 10;
HashFunction = F(X)
and let's say that F(X) will generate a hashCode 111@aba for a key 10,
Therefore whenever you pass 10 to F(X), it should return 111@aba.

# Where do we use hashing?
## 1. Storing password in server side: 
when we create a user account on any social media site (say instagram), then our information 
is stored into the database of that social media, but but but our password is not stored as a 
clean text, it is converted into a hashCode and this code is modified with a technique called 
salting & peppering (two layer of protection). This is done to protect password.
## 2. Storing Record: 
When a user enters a new record, certain column(s) of the record
are more valuable and unique across all the records(primary key).Therefore, this record
is converted into Key-Value pair, here Key is primary key and value is other data 
entered by the user. So this primary key is treated as a "Key" to our "hashFunction". 
The hashFunction generates a unique hashCode, this hashCode is further mapped to a 
memory address. We use this memory address to store the data. So, Whenever we want to
get our data, we can get in constant time.

# Working of HashFunction:
We have a data structure called "hashTable" of size M. This data structure is used
to store key-value pairs.
So, the flow is like user enters data as below
RollNumber:Name
10:"aman"
37:"shashwat"
Here RollNumber is a key and Name is a value.
Now we write a hashFunction which takes rollNumber(key) and generates a hashCode,
this hashCode is nothing but an index of the hashTable.
So, lets say for key 10, we got an index 5 and for key 37, we got an index 3.
So, we store the data of aman at index 5 of hashTable &
we store the data of shashwat at index 3 of hashTable.
Now, whenever we want data of any student, we can pass the rollNumber and in constant
time we will get the data back.

# Different Types of HashFunctions:
There are many types of hashFunctions & you can even write your own, but we will
study some of the common ones.

## 1. Division Method:
Formula is (Key)Mod(Size of hashTable).
Generally the size of the hashTable is taken as a prime number.
Example: Keys -> [11,10,66,...] and M=11 (size of hashTable)
So, after applying above formula[Key(mod)M] -> [0,10,0,...]
Here 11 is stored at 0th index.
10 is stored at 10th index.
66 is stored at 0th index and so on.
But, wait what? We already have 11 at 0th index, then how can we store 66 too?
So, this situation is called collision, where we have multiple keys generating the same
hashCode :)
This will be taken care by collision resolution technique.(explained later)

## 2. MidSquare Method:
Formula: FindMid-R-Digits(Key^2)modM
The mid-square method squares the key value, and then takes the middle r bits of the
result, giving a value in the range 0 to 2^r-1. For example, consider records whose
keys are 2-digit numbers in base 10. The goal is to hash these key values to a table
of size 11 (i.e., a range of 0 to 10). This range is equivalent to one digit in 
base 10. That is, r = 1. If the input is the number 11, squaring yields an 3-digit
number, 121. The middle digit of this result is 2. Hence, Data is stored at the 2nd
index of hashTable. 

## 3. Folding Method: The folding method in hashing involves dividing the input into 
smaller units (often digits) and combining them in some way to generate the hash 
value. The specific steps may vary, but the general idea is to partition the input
data into chunks, add or concatenate them, and then perform some operation to
produce the final hash.
Here's a basic explanation of the folding method:
Divide the Input: Break the input data into fixed-size units (e.g., digits or bytes).
Combine Units: Combine the units by adding or concatenating them.
Hash Calculation: Apply a hash function to the combined result.
Modulo Operation: Optionally, you may perform a modulo operation to ensure that 
the hash value fits within a specific range (e.g., the size of a hash table).

# Collision Resolution Technique:
Collision resolution is a crucial aspect of hash table design, as collisions 
occur when two or more keys hash to the same index in the table. There are several
techniques to handle collisions and ensure that each key is stored in the hash table
without overwriting other keys. Here are some common collision resolution techniques:

## A. Closed Hashing: In case of collision, store the data in same table.
### 1. Linear Probing:
If a collision occurs, the algorithm searches for the next available slot linearly
(sequentially) until an empty slot is found. Linear probing is straightforward
but may lead to clustering, where consecutive slots are occupied, 
increasing the likelihood of further collisions.
Disadvantage: Primary and Secondary Clustering.

### 2. Quadratic Probing:
Similar to linear probing, but the interval between probes is determined by a 
quadratic function.
This helps reduce primary clustering, but it still suffers from secondary clustering.

### 3. Double Hashing:
In this method, a secondary hash function is used to calculate the interval 
between probes. The formula for finding the next slot is typically of the form:
hash2(key)×i, where i is the number of probes attempted.
Double hashing can provide a good distribution of keys and reduces clustering.

## B. Open Hashing: We store data outside the hashTable in case of collision.
### 1. Chaining (Separate Chaining):
In this technique, each hash table slot (bucket) maintains a linked list of all
the keys that hash to the same index. When a collision occurs, the new key is 
added to the linked list at the corresponding slot.
Chaining is easy to implement and handles multiple collisions well.


# Probe Number:
the term "probe number" refers to the number of attempts made to find an available
slot for a key that has caused a collision. When a collision occurs 
(i.e., two keys hash to the same slot), the hash table needs to resolve it by finding
another open slot. The sequence of attempts to find an open slot is known as 
the "probe sequence," and each attempt is counted as a probe.

# Primary and Secondary Clustering
Primary clustering and secondary clustering are terms used to describe phenomena
that can occur in hash tables, particularly in the context of open addressing
collision resolution techniques like linear probing, quadratic probing, and 
double hashing.

# Primary Clustering:
Primary clustering refers to the tendency of hash table slots to become filled 
with consecutive elements due to the hash function's behaviour.
When two or more keys hash to the same index, the probing sequence 
(e.g., linear or quadratic) may cause them to cluster together.
For example, if there's a collision at index i, the next keys might be placed at i+1,
i+2, and so on.
Primary clustering can be problematic because it increases the likelihood of 
further collisions and can lead to inefficient search times.

# Secondary Clustering:
Secondary clustering, also known as clustering around a probe sequence, 
occurs during open addressing when a collision is resolved by using a probing 
sequence. It involves the clustering of keys along the specific sequence of 
positions determined by the probing method.
For instance, in linear probing, if there is a collision at position i, subsequent 
elements will be placed at positions i+1, i+2, and so forth. This creates a cluster
along the linear sequence.
Secondary clustering can impact performance, especially if keys continue to collide 
along the same probing sequence, leading to longer probe sequences and slower 
operations.

Both primary and secondary clustering can affect the efficiency of hash tables. 
They can increase the likelihood of collisions, which in turn can lead to longer 
search times and reduced performance. 
Strategies such as double hashing attempt to mitigate these clustering effects 
by introducing variations in the probe sequences or reordering keys based on 
their displacements. 
Proper tuning of hash functions and probing sequences is essential to minimise
clustering and optimise the performance of hash tables.


# What is Load Factor?
The load factor in hashing is a measure of how full the hash table is. 
It is expressed as the ratio of the number of elements stored in the hash table
to the total number of slots in the table. 
The load factor is denoted by the symbol Alpha.
In other words, the load factor is the average number of elements stored in each
slot of the hash table. It is an important metric because it affects the performance 
of the hash table, especially in terms of time complexity for operations like 
insertion, retrieval, and deletion.
A low load factor (close to 0) indicates that the hash table has plenty of empty 
slots, which might be inefficient in terms of memory usage but can lead to faster
operations since there is less chance of collisions. On the other hand, a high load
factor (close to 1) means that the hash table is approaching its capacity, 
increasing the likelihood of collisions and potentially slowing down operations.

# Rehashing:
Lets say we have a threshold of 0.75, so whenever our load factor is greater than or
equal to 0.75, we double the size of the hashTable and hash our data into the new 
hashTable. This concept is called rehashing.



