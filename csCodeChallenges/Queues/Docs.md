## Class SimpleQueue<T>

Simple queue implementation using C# for practice and instruction purposes

```
SimpleQueue<T>
Constructs an empty queue
```

### Properties

size : the number of nodes contained in the queue

### Methods

> **void Enqueue(T data)** : adds a node with the given ```data``` to the ```queue``` | O(1)

> **T Dequeue()**: returns the ```data``` from the node at the beginning of the ```queue```, removes node from ```queue``` | O(1)

> **void PrintQueue** : prints all nodes in the ```queue``` with the rightmost node being the next in the ```queue``` | O(n)


### Example
The example demonstrates use of the SimpleQueue<T> class

```
using System;

public class Example{

  public static void Main(){

    SimpleQueue<int> myqueue = new SimpleQueue<int>();

            myqueue.Enqueue(10);
            myqueue.Enqueue(9);
            myqueue.Enqueue(8);
            myqueue.PrintQueue();

            myqueue.Dequeue();
            myqueue.Dequeue();
            myqueue.PrintQueue();
           
            myqueue.Enqueue(100);
            myqueue.Enqueue(25);
            myqueue.PrintQueue();
  }
}
```

The code for this class can be found here
* [SimpleQueue.cs](/csCodeChallenges/Queues/SimpleQueue.cs)