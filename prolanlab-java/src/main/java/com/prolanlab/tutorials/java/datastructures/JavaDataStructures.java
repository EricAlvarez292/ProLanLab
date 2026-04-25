package com.prolanlab.tutorials.java.datastructures;

public class JavaDataStructures {
    
    /**
     * Shows Java Data Structures overview
     */
    public void showJavaDataStructures() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA DATA STRUCTURES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Data structures are ways to organize and store data efficiently.");
        System.out.println("Java provides built-in data structures through the Collections Framework.");
        System.out.println();
        System.out.println("1. COMMON DATA STRUCTURES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Type        | Description               |");
        System.out.println("|-------------|---------------------------|");
        System.out.println("| Arrays      | Fixed-size linear data    |");
        System.out.println("| Lists       | Dynamic arrays            |");
        System.out.println("| Sets        | Unique elements           |");
        System.out.println("| Maps        | Key-value pairs           |");
        System.out.println("| Queues      | FIFO access pattern       |");
        System.out.println("| Stacks      | LIFO access pattern       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. JAVA COLLECTIONS HIERARCHY:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Collection (Interface)                  |");
        System.out.println("| ├── List (ArrayList, LinkedList)       |");
        System.out.println("| ├── Set (HashSet, LinkedHashSet)       |");
        System.out.println("| └── Queue (PriorityQueue, LinkedList)  |");
        System.out.println("|                                         |");
        System.out.println("| Map (HashMap, LinkedHashMap, TreeMap)  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Key Benefits:");
        System.out.println("* Efficient data storage and retrieval");
        System.out.println("* Built-in algorithms and operations");
        System.out.println("* Type safety with generics");
        System.out.println("* Thread-safe implementations available");
    }
    
    /**
     * Shows Java Collections Framework tutorial
     */
    public void showJavaCollections() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA COLLECTIONS FRAMEWORK");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("The Collections Framework provides a unified architecture for");
        System.out.println("representing and manipulating collections of objects.");
        System.out.println();
        System.out.println("1. CORE INTERFACES:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| import java.util.*;                    |");
        System.out.println("|                                         |");
        System.out.println("| Collection<E> - Root interface         |");
        System.out.println("| ├── List<E> - Ordered collection       |");
        System.out.println("| ├── Set<E> - No duplicate elements     |");
        System.out.println("| └── Queue<E> - FIFO operations         |");
        System.out.println("|                                         |");
        System.out.println("| Map<K,V> - Key-value mappings          |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. COMMON OPERATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Collection<String> collection;         |");
        System.out.println("|                                         |");
        System.out.println("| collection.add(\"item\");               |");
        System.out.println("| collection.remove(\"item\");            |");
        System.out.println("| collection.contains(\"item\");          |");
        System.out.println("| collection.size();                     |");
        System.out.println("| collection.isEmpty();                  |");
        System.out.println("| collection.clear();                    |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Benefits:");
        System.out.println("* Reduces programming effort");
        System.out.println("* Increases performance through optimized implementations");
        System.out.println("* Provides interoperability between unrelated APIs");
    }
    
    /**
     * Shows Java List interface tutorial
     */
    public void showJavaList() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA LIST INTERFACE");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("List is an ordered collection that allows duplicate elements.");
        System.out.println("Elements can be accessed by their index position.");
        System.out.println();
        System.out.println("1. COMMON LIST OPERATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| List<String> list = new ArrayList<>(); |");
        System.out.println("|                                         |");
        System.out.println("| // Add elements                        |");
        System.out.println("| list.add(\"Apple\");                     |");
        System.out.println("| list.add(0, \"Banana\"); // Insert at index |");
        System.out.println("|                                         |");
        System.out.println("| // Access elements                     |");
        System.out.println("| String first = list.get(0);           |");
        System.out.println("| list.set(1, \"Cherry\"); // Update      |");
        System.out.println("|                                         |");
        System.out.println("| // Remove elements                     |");
        System.out.println("| list.remove(0); // By index           |");
        System.out.println("| list.remove(\"Apple\"); // By value     |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. LIST IMPLEMENTATIONS:");
        System.out.println("* ArrayList - Resizable array, fast random access");
        System.out.println("* LinkedList - Doubly-linked list, fast insertion/deletion");
        System.out.println("* Vector - Synchronized ArrayList (legacy)");
    }
    
    /**
     * Shows Java Arrays tutorial
     */
    public void showJavaArrays() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(">> JAVA ARRAYS");
        System.out.println("=".repeat(70));
        System.out.println();
        System.out.println("Arrays store multiple values of the same data type.");
        System.out.println();
        System.out.println("1. ARRAY DECLARATION AND INITIALIZATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // Method 1 - Declare then assign      |");
        System.out.println("| int[] numbers = new int[5];             |");
        System.out.println("| numbers[0] = 10; numbers[1] = 20;       |");
        System.out.println("|                                         |");
        System.out.println("| // Method 2 - Declare with values      |");
        System.out.println("| int[] scores = {85, 92, 78, 95, 88};   |");
        System.out.println("|                                         |");
        System.out.println("| // Method 3 - New with values          |");
        System.out.println("| String[] names = new String[]{\"Alice\", \"Bob\"}; |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ACCESSING ARRAY ELEMENTS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int[] arr = {10, 20, 30, 40, 50};      |");
        System.out.println("| System.out.println(arr[0]); // 10      |");
        System.out.println("| System.out.println(arr[2]); // 30      |");
        System.out.println("| System.out.println(arr.length); // 5   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. LOOP THROUGH ARRAYS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // Using traditional for loop           |");
        System.out.println("| for (int i = 0; i < arr.length; i++) { |");
        System.out.println("|     System.out.println(arr[i]);        |");
        System.out.println("| }                                       |");
        System.out.println("|                                         |");
        System.out.println("| // Using enhanced for loop              |");
        System.out.println("| for (int element : arr) {              |");
        System.out.println("|     System.out.println(element);       |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("4. MULTIDIMENSIONAL ARRAYS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| int[][] matrix = {{1,2,3}, {4,5,6}};   |");
        System.out.println("| System.out.println(matrix[1][2]); // 6 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Important Notes:");
        System.out.println("* Array indices start from 0");
        System.out.println("* Array size is fixed after creation");
        System.out.println("* Use .length property to get array size");
    }
    
    /**
     * Shows Java ArrayList tutorial
     */
    public void showJavaArrayList() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA ARRAYLIST");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("ArrayList is a resizable array implementation of the List interface.");
        System.out.println("It provides fast random access but slower insertion/deletion in middle.");
        System.out.println();
        System.out.println("1. CREATING AND USING ARRAYLIST:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| import java.util.ArrayList;            |");
        System.out.println("| import java.util.List;                 |");
        System.out.println("|                                         |");
        System.out.println("| // Generic ArrayList                   |");
        System.out.println("| ArrayList<Integer> numbers = new ArrayList<>(); |");
        System.out.println("|                                         |");
        System.out.println("| // Add elements                        |");
        System.out.println("| numbers.add(10);                       |");
        System.out.println("| numbers.add(20);                       |");
        System.out.println("| numbers.add(1, 15); // Insert at index 1 |");
        System.out.println("|                                         |");
        System.out.println("| // Access elements                     |");
        System.out.println("| int first = numbers.get(0); // 10     |");
        System.out.println("| numbers.set(2, 25); // Update         |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ITERATING THROUGH ARRAYLIST:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // Enhanced for loop                   |");
        System.out.println("| for (int num : numbers) {              |");
        System.out.println("|     System.out.println(num);          |");
        System.out.println("| }                                       |");
        System.out.println("|                                         |");
        System.out.println("| // Traditional for loop                |");
        System.out.println("| for (int i = 0; i < numbers.size(); i++) { |");
        System.out.println("|     System.out.println(numbers.get(i)); |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Characteristics:");
        System.out.println("* Dynamic sizing (grows/shrinks automatically)");
        System.out.println("* Fast random access O(1)");
        System.out.println("* Slower insertion/deletion in middle O(n)");
    }
    
    /**
     * Shows Java LinkedList tutorial
     */
    public void showJavaLinkedList() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA LINKEDLIST");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("LinkedList is a doubly-linked list implementation.");
        System.out.println("It provides efficient insertion/deletion but slower random access.");
        System.out.println();
        System.out.println("1. LINKEDLIST OPERATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| import java.util.LinkedList;           |");
        System.out.println("|                                         |");
        System.out.println("| LinkedList<String> list = new LinkedList<>(); |");
        System.out.println("|                                         |");
        System.out.println("| // Add elements                        |");
        System.out.println("| list.add(\"First\");                     |");
        System.out.println("| list.addFirst(\"Beginning\");            |");
        System.out.println("| list.addLast(\"End\");                   |");
        System.out.println("|                                         |");
        System.out.println("| // Remove elements                     |");
        System.out.println("| String first = list.removeFirst();    |");
        System.out.println("| String last = list.removeLast();      |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. QUEUE OPERATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // LinkedList implements Queue         |");
        System.out.println("| Queue<String> queue = new LinkedList<>(); |");
        System.out.println("|                                         |");
        System.out.println("| queue.offer(\"Item1\"); // Add to rear  |");
        System.out.println("| queue.offer(\"Item2\");                  |");
        System.out.println("|                                         |");
        System.out.println("| String item = queue.poll(); // Remove from front |");
        System.out.println("| String peek = queue.peek(); // View front |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Best Use Cases:");
        System.out.println("* Frequent insertions/deletions in middle");
        System.out.println("* Queue/Deque operations");
        System.out.println("* When you don't need random access");
    }
    
    /**
     * Shows Java Set interface tutorial
     */
    public void showJavaSet() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA SET INTERFACE");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Set is a collection that contains no duplicate elements.");
        System.out.println("It models the mathematical set abstraction.");
        System.out.println();
        System.out.println("1. BASIC SET OPERATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Set<String> set = new HashSet<>();     |");
        System.out.println("|                                         |");
        System.out.println("| // Add elements (duplicates ignored)   |");
        System.out.println("| set.add(\"Apple\");                      |");
        System.out.println("| set.add(\"Banana\");                     |");
        System.out.println("| set.add(\"Apple\"); // Duplicate ignored |");
        System.out.println("|                                         |");
        System.out.println("| // Check membership                    |");
        System.out.println("| if (set.contains(\"Apple\")) {           |");
        System.out.println("|     System.out.println(\"Found!\");     |");
        System.out.println("| }                                       |");
        System.out.println("|                                         |");
        System.out.println("| System.out.println(set.size()); // 2  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. SET IMPLEMENTATIONS:");
        System.out.println("* HashSet - Hash table, fastest performance");
        System.out.println("* LinkedHashSet - Hash table + linked list, maintains insertion order");
        System.out.println("* TreeSet - Red-black tree, sorted order");
        System.out.println();
        System.out.println("Use Cases:");
        System.out.println("* Removing duplicates from collections");
        System.out.println("* Mathematical set operations");
        System.out.println("* Fast membership testing");
    }
    
    /**
     * Shows Java HashSet tutorial
     */
    public void showJavaHashSet() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA HASHSET");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("HashSet uses a hash table for storage, providing constant-time");
        System.out.println("performance for basic operations (add, remove, contains).");
        System.out.println();
        System.out.println("1. HASHSET EXAMPLE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| import java.util.HashSet;              |");
        System.out.println("| import java.util.Set;                  |");
        System.out.println("|                                         |");
        System.out.println("| Set<Integer> numbers = new HashSet<>();|");
        System.out.println("|                                         |");
        System.out.println("| // Add elements                        |");
        System.out.println("| numbers.add(10);                       |");
        System.out.println("| numbers.add(20);                       |");
        System.out.println("| numbers.add(10); // Duplicate ignored |");
        System.out.println("|                                         |");
        System.out.println("| // Iterate (order not guaranteed)     |");
        System.out.println("| for (int num : numbers) {              |");
        System.out.println("|     System.out.println(num);          |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Characteristics:");
        System.out.println("* No guarantee on order of elements");
        System.out.println("* Allows one null value");
        System.out.println("* Not thread-safe (use Collections.synchronizedSet())");
        System.out.println("* Best performance for basic operations");
    }
    
    /**
     * Shows Java LinkedHashSet tutorial
     */
    public void showJavaLinkedHashSet() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA LINKEDHASHSET");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("LinkedHashSet maintains insertion order using a linked list");
        System.out.println("while providing HashSet's performance characteristics.");
        System.out.println();
        System.out.println("1. LINKEDHASHSET EXAMPLE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| import java.util.LinkedHashSet;        |");
        System.out.println("| import java.util.Set;                  |");
        System.out.println("|                                         |");
        System.out.println("| Set<String> fruits = new LinkedHashSet<>(); |");
        System.out.println("|                                         |");
        System.out.println("| fruits.add(\"Apple\");                   |");
        System.out.println("| fruits.add(\"Banana\");                  |");
        System.out.println("| fruits.add(\"Cherry\");                  |");
        System.out.println("| fruits.add(\"Apple\"); // Duplicate     |");
        System.out.println("|                                         |");
        System.out.println("| // Maintains insertion order           |");
        System.out.println("| for (String fruit : fruits) {          |");
        System.out.println("|     System.out.println(fruit);        |");
        System.out.println("| }                                       |");
        System.out.println("| // Output: Apple, Banana, Cherry       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Benefits:");
        System.out.println("* Predictable iteration order");
        System.out.println("* Nearly as fast as HashSet");
        System.out.println("* Useful when order matters");
    }
    
    /**
     * Shows Java Map interface tutorial
     */
    public void showJavaMap() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA MAP INTERFACE");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Map represents a mapping between keys and values.");
        System.out.println("Each key can map to at most one value.");
        System.out.println();
        System.out.println("1. BASIC MAP OPERATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Map<String, Integer> map = new HashMap<>(); |");
        System.out.println("|                                         |");
        System.out.println("| // Put key-value pairs                 |");
        System.out.println("| map.put(\"Alice\", 25);                  |");
        System.out.println("| map.put(\"Bob\", 30);                    |");
        System.out.println("| map.put(\"Alice\", 26); // Updates value |");
        System.out.println("|                                         |");
        System.out.println("| // Get values                          |");
        System.out.println("| Integer age = map.get(\"Alice\"); // 26 |");
        System.out.println("|                                         |");
        System.out.println("| // Check existence                     |");
        System.out.println("| if (map.containsKey(\"Bob\")) { ... }   |");
        System.out.println("| if (map.containsValue(30)) { ... }     |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ITERATING OVER MAPS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // Iterate over entries                |");
        System.out.println("| for (Map.Entry<String, Integer> entry : map.entrySet()) { |");
        System.out.println("|     System.out.println(entry.getKey() + \": \" + entry.getValue()); |");
        System.out.println("| }                                       |");
        System.out.println("|                                         |");
        System.out.println("| // Iterate over keys                   |");
        System.out.println("| for (String key : map.keySet()) { ... } |");
        System.out.println("|                                         |");
        System.out.println("| // Iterate over values                 |");
        System.out.println("| for (Integer value : map.values()) { ... } |");
        System.out.println("+-------------------------------------------+");
    }
    
    /**
     * Shows Java HashMap tutorial
     */
    public void showJavaHashMap() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA HASHMAP");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("HashMap is a hash table-based implementation of Map interface.");
        System.out.println("It provides constant-time performance for basic operations.");
        System.out.println();
        System.out.println("1. HASHMAP EXAMPLE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| import java.util.HashMap;              |");
        System.out.println("| import java.util.Map;                  |");
        System.out.println("|                                         |");
        System.out.println("| Map<String, String> countries = new HashMap<>(); |");
        System.out.println("|                                         |");
        System.out.println("| countries.put(\"USA\", \"Washington\");    |");
        System.out.println("| countries.put(\"UK\", \"London\");         |");
        System.out.println("| countries.put(\"France\", \"Paris\");      |");
        System.out.println("|                                         |");
        System.out.println("| String capital = countries.get(\"USA\"); |");
        System.out.println("| System.out.println(capital); // Washington |");
        System.out.println("|                                         |");
        System.out.println("| // Safe access with default            |");
        System.out.println("| String unknown = countries.getOrDefault(\"Germany\", \"Unknown\"); |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Key Features:");
        System.out.println("* No ordering guarantee");
        System.out.println("* Allows one null key and multiple null values");
        System.out.println("* Not synchronized (thread-safe version: ConcurrentHashMap)");
        System.out.println("* Average O(1) time complexity for basic operations");
    }
    
    /**
     * Shows Java LinkedHashMap tutorial
     */
    public void showJavaLinkedHashMap() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA LINKEDHASHMAP");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("LinkedHashMap maintains insertion order (or access order)");
        System.out.println("while providing HashMap's performance characteristics.");
        System.out.println();
        System.out.println("1. INSERTION ORDER:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Map<String, Integer> scores = new LinkedHashMap<>(); |");
        System.out.println("|                                         |");
        System.out.println("| scores.put(\"Alice\", 95);               |");
        System.out.println("| scores.put(\"Bob\", 87);                 |");
        System.out.println("| scores.put(\"Charlie\", 92);             |");
        System.out.println("|                                         |");
        System.out.println("| // Maintains insertion order           |");
        System.out.println("| for (Map.Entry<String, Integer> entry : scores.entrySet()) { |");
        System.out.println("|     System.out.println(entry.getKey() + \": \" + entry.getValue()); |");
        System.out.println("| }                                       |");
        System.out.println("| // Output: Alice:95, Bob:87, Charlie:92 |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. ACCESS ORDER (LRU Cache):");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // Constructor for access-order        |");
        System.out.println("| Map<String, String> cache = new LinkedHashMap<>(16, 0.75f, true); |");
        System.out.println("|                                         |");
        System.out.println("| cache.put(\"key1\", \"value1\");           |");
        System.out.println("| cache.put(\"key2\", \"value2\");           |");
        System.out.println("| cache.get(\"key1\"); // Moves to end    |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Use Cases:");
        System.out.println("* When insertion order matters");
        System.out.println("* Building LRU caches");
        System.out.println("* Predictable iteration order needed");
    }
    
    /**
     * Shows Java Iterator tutorial
     */
    public void showJavaIterator() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA ITERATOR");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Iterator provides a uniform way to traverse collections.");
        System.out.println("It allows safe removal of elements during iteration.");
        System.out.println();
        System.out.println("1. BASIC ITERATOR USAGE:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| import java.util.*;                    |");
        System.out.println("|                                         |");
        System.out.println("| List<String> list = new ArrayList<>(); |");
        System.out.println("| list.add(\"A\"); list.add(\"B\"); list.add(\"C\"); |");
        System.out.println("|                                         |");
        System.out.println("| Iterator<String> iter = list.iterator(); |");
        System.out.println("| while (iter.hasNext()) {               |");
        System.out.println("|     String element = iter.next();      |");
        System.out.println("|     System.out.println(element);       |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. SAFE REMOVAL DURING ITERATION:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Iterator<String> iter = list.iterator(); |");
        System.out.println("| while (iter.hasNext()) {               |");
        System.out.println("|     String element = iter.next();      |");
        System.out.println("|     if (element.equals(\"B\")) {         |");
        System.out.println("|         iter.remove(); // Safe removal |");
        System.out.println("|     }                                   |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. LISTITERATOR (BIDIRECTIONAL):");
        System.out.println("+-------------------------------------------+");
        System.out.println("| ListIterator<String> listIter = list.listIterator(); |");
        System.out.println("| // Forward iteration                   |");
        System.out.println("| while (listIter.hasNext()) {           |");
        System.out.println("|     System.out.println(listIter.next()); |");
        System.out.println("| }                                       |");
        System.out.println("| // Backward iteration                  |");
        System.out.println("| while (listIter.hasPrevious()) {       |");
        System.out.println("|     System.out.println(listIter.previous()); |");
        System.out.println("| }                                       |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Benefits:");
        System.out.println("* Fail-safe iteration");
        System.out.println("* Universal interface for all collections");
        System.out.println("* Safe element removal during iteration");
    }
    
    /**
     * Shows Java Algorithms tutorial
     */
    public void showJavaAlgorithms() {
        System.out.println("\n" + "=".repeat(75));
        System.out.println(">> JAVA ALGORITHM UTILITIES");
        System.out.println("=".repeat(75));
        System.out.println();
        System.out.println("Java provides built-in algorithms through Collections and Arrays classes.");
        System.out.println("These offer efficient implementations of common operations.");
        System.out.println();
        System.out.println("1. SORTING ALGORITHMS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| import java.util.*;                    |");
        System.out.println("|                                         |");
        System.out.println("| // Sort Collections                    |");
        System.out.println("| List<String> names = new ArrayList<>();|");
        System.out.println("| names.add(\"Charlie\"); names.add(\"Alice\"); names.add(\"Bob\"); |");
        System.out.println("| Collections.sort(names); // Natural order |");
        System.out.println("| Collections.reverse(names); // Reverse |");
        System.out.println("|                                         |");
        System.out.println("| // Sort Arrays                         |");
        System.out.println("| int[] numbers = {3, 1, 4, 1, 5};      |");
        System.out.println("| Arrays.sort(numbers);                  |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("2. SEARCHING ALGORITHMS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // Binary search (sorted collections)  |");
        System.out.println("| int index = Collections.binarySearch(names, \"Bob\"); |");
        System.out.println("|                                         |");
        System.out.println("| // Array binary search                 |");
        System.out.println("| Arrays.sort(numbers); // Must be sorted |");
        System.out.println("| int pos = Arrays.binarySearch(numbers, 4); |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("3. UTILITY OPERATIONS:");
        System.out.println("+-------------------------------------------+");
        System.out.println("| // Min/Max                             |");
        System.out.println("| String min = Collections.min(names);   |");
        System.out.println("| String max = Collections.max(names);   |");
        System.out.println("|                                         |");
        System.out.println("| // Shuffle                             |");
        System.out.println("| Collections.shuffle(names);            |");
        System.out.println("|                                         |");
        System.out.println("| // Frequency count                     |");
        System.out.println("| int freq = Collections.frequency(names, \"Alice\"); |");
        System.out.println("|                                         |");
        System.out.println("| // Fill collection                     |");
        System.out.println("| Collections.fill(names, \"Default\");   |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Common Algorithms:");
        System.out.println("* Sorting: Timsort (Arrays/Collections)");
        System.out.println("* Searching: Binary search");
        System.out.println("* Shuffling: Fisher-Yates shuffle");
    }
}