# What is a Hashmap?
In Java, a HashMap is a part of the Java Collections Framework and is implemented in the java.util package. It is a data structure that provides a way to store and retrieve key-value pairs. The HashMap class uses a hash table to implement the Map interface, which means it allows you to associate keys with values.

Here are some key features of HashMap in Java:
## Key-Value Pairs:

Each entry in a HashMap is a key-value pair.
Keys must be unique within a HashMap, but values can be duplicated.

## Null Values:

Both keys and values in a HashMap can be null.
However, there can be at most one null key in a HashMap.

## Performance:

HashMap provides constant-time performance for the basic operations like get(), put(), and remove(), assuming a good hash function and an appropriate initial capacity.

## Load Factor and Capacity:

HashMap uses a load factor and capacity mechanism to dynamically resize itself as the number of entries increases. This helps in maintaining a balance between space and time complexity.

### Hashmap can be found in Collections Framework 
#### path: java.util.Collections.HashMap
#### Syntax: HashMap<Key,Value> someName = new HashMap<>();

# Functions of HashMap:
## put(K key, V value):
Adds a key-value pair to the HashMap.
If the key is already present, the new value will overwrite the existing one.
Returns the previous value associated with the specified key, or null if there was no mapping for the key.

## get(Object key):
Returns the value to which the specified key is mapped, or null if the key is not present.

## containsKey(Object key):
Returns true if the map contains the specified key, otherwise false.

## getOrDefault(Object key, V defaultValue):
Returns the value to which the specified key is mapped, or a default value if the key is not present in the map.

## replace(K key, V value)
Replaces the value associated with the specified key with the given value.
Returns the previous value associated with the key, or null if there was no mapping for the key.

## entrySet()
Returns a set view of the mappings contained in the map.
Each element in the set is a Map.Entry<K, V> object representing a key-value pair.

## keySet()
Returns a set view of the keys contained in the map.
Changes to the set are reflected in the map, and vice versa.

## containsValue(Object value)
The containsValue(Object value) method is used to determine whether a particular value is present in the values of the HashMap.
It returns true if the map contains one or more keys mapped to the specified value.
Returns false otherwise.


# Custom Key-Value Pair
HashMap can also be used with custom data.
HashMap<College,Ranking> rankingMap = new HashMap<>();
here College and Ranking are custom class.
But hashmap will not work properly here, to use
a custom key or value we need to override following functions into our classes:
## equals(Object obj)
## hashCode()

### check code :)