using System;

namespace Queues
{
    class SimpleQueue <T>
    {
        public class Node
        {
            public T data;
            public Node next;
            public Node prev;
            
            public Node()
            {
                data = default(T);
                next = null;
                prev = null;
            }
            
            public Node(T _data)
            {
                data = _data;
                next = null;
                prev = null;
            }
        }

        Node head;
        Node tail;
        int size;

        public SimpleQueue()
        {
            head = new Node();
            tail = new Node();
            size = 0;
        }

        //Adds an object to the end of the queue
        public void Enqueue(T data)
        {
            Node obj = new Node(data);
            obj.next = tail.next;
            if (tail.next != null) tail.next.prev = obj;
            tail.next = obj;
            obj.prev = null;
            if (size == 0) head.next = obj;
            size++;
        }

        //Removes object from the front of the queue
        public T Dequeue()
        {
            Node curr = null;
            if(size > 0)
            {
                curr = head.next;
                head.next = curr.prev;
                if(curr.prev != null) curr.prev.next = null;
                size--;
                if (size == 0) tail.next = null;
            }
            return curr.data;
        }

        public void PrintQueue()
        {
            Node curr = tail;
            while(curr.next != null)
            {
                curr = curr.next;
                Console.Write(curr.data + "->");
                
            }
            Console.WriteLine("");
        }
    }

    class Program
    {
        static void Main()
        {
            SimpleQueue<int> myqueue = new SimpleQueue<int>();
            myqueue.Enqueue(25);
            myqueue.Enqueue(15);
            myqueue.Enqueue(10);
            myqueue.Enqueue(9);
            myqueue.Enqueue(8);
            myqueue.PrintQueue();
            myqueue.Dequeue();
            myqueue.PrintQueue();
            myqueue.Dequeue();
            myqueue.PrintQueue();
            myqueue.Dequeue();
            myqueue.PrintQueue();
            myqueue.Dequeue();
            myqueue.PrintQueue();
            myqueue.Dequeue();
            myqueue.PrintQueue();
            myqueue.Enqueue(100);
            myqueue.PrintQueue();
            myqueue.Enqueue(25);
            myqueue.PrintQueue();
            myqueue.Enqueue(78);
            myqueue.PrintQueue();
            myqueue.Enqueue(17);
            myqueue.PrintQueue();
            myqueue.Dequeue();
            myqueue.PrintQueue();
            myqueue.Dequeue();
            myqueue.PrintQueue();
            myqueue.Dequeue();


        }
    }

   
}
