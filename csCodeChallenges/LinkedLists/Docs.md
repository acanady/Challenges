## Class SimpleLinkedList<T>

Simple linked list implementation using C# for practice and instruction purposes

```
SimpleLinkedList<T>
Constructs an empty list
```

### Properties

size : the number of nodes contained in the list

### Methods

> **void append(T data)** : appends a node to the end of the list | O(1)

> **void prepend(T data)**: prepends a node to the beginning of the list | O(1)

> **bool insert (T data, int location)** : inserts a node with the given data at the given location. returns false if location dne else returns true | O(n)

> **bool remove (int loc)**: removes a node from the given location, returns false if location dne, else returns true | O(1)

> **void get(int loc)**: returns the value at the given location, returns null if loc dne | O(n)

> **bool set(T data, int loc)**: sets the value of the node at that location, returns false if the location dne | O(n)

> **int getSize()** : returns the size of the list, not recommended, just use the size property instead. | O(n)

> **void printList()** : prints the T data value of the nodes in the list, may not have the desired result depending on the list type.

### Example
The example demonstrates use of the SimpleLinkedList<T> class

```
using System;

public class Example{

  public static void Main(){

    SimpleLinkedList<int> list1 = new SimpleLinkedList<int>();

    list1.append(10);
    list1.prepend(100);
    Console.Write(list1.size);

    SimpleLinkedList<int> list2 = new SimpleLinkedList<int>();
    list2.append(100);
    list2.append(19);
    list2.remove(0);
    list2.insert(10, 0);
    list2.insert(13, 1);

    list1.printList();
    list2.printList();
  }
}
```