using System;

namespace LinkedLists
{
    class SimpleLinkedList <T>
    {
        private class Node
        {
            public T _data;
            public Node next;

            public Node(T data)
            {
                _data = data;
                next = null;
            }

            public Node()
            {
                _data = default(T);
                next = null;
            }
        }

        Node head;
        Node tail;
        public int size;

        //initilaize list
        public SimpleLinkedList()
        {
            head = new Node();
            tail = head;
        }

        //add node to end of list
        public void append(T data)
        {
            Node curr = tail;
            curr.next = new Node(data);
            tail = curr.next;
            size++;
        }
        
        
        // add node to beginning of list
        public void prepend(T data)
        {
            insert(data, 0);
        }

        // add node to list at location returns false if loc doesn't exist, otherwise true
        public bool insert(T data, int loc)
        {
            if (size - 1 < loc || loc < 0) return false;

            Node curr = head;
            int index = 0;
            while (index < loc)
            {
                curr = curr.next;
                index++;
            }

            Node insertedNode = new Node(data);
            insertedNode.next = curr.next;
            curr.next = insertedNode;
            size++;
            return true;
        }

        //remove node from list at location returns false if loc doesn't exist 
        public bool remove(int loc)
        {
            Node curr = head;
            int index = 0;
            if (size - 1 < loc || loc < 0) return false;
            if (size == 1)
            {
                tail = head;
                head.next = null;
                size--;
                return true;
            }

            while(index < loc)
            {
                curr = curr.next;
                index++;
            }

            curr.next = curr.next.next;
            size--;

            //if we're removing from the end of the list, we update the tail
            if (size - 1 == loc) tail = curr;
            return true;

        }

        //returns value at that location, returns null if it doesn't exist
        public T get(int loc)
        {
            Node curr = head;
            int index = 0;

            //the loc does not exist in the list
            if (size - 1 < loc || loc < 0) return default(T);

            while(index <= loc)
            {
                curr = curr.next;
            }

            return curr._data;
           
        }

        //sets the value at that loc, returns false if loc doesn't exist
        public bool set(T data, int loc)
        {
            if (size - 1 < loc || loc < 0) return false;

            Node curr = head;
            int index = 0;
            while(index <= loc)
            {
                curr = curr.next;
                index++;
            }
            curr._data = data;
            return true; 
        }

        //return size of list
        public int getSize()
        {
            int size = 0;
            Node curr = head;

            //list is empty
            if(tail == head)
            {
                return 0;
            }

            while(curr.next != null)
            {
                size++;
                curr = curr.next;
            }
            return size;
        }
        
        public void printList()
        {
            Node curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
                Console.Write(curr._data + " ");
            }
            Console.Write("\n");
        }

    }

    class Solution
    {
        static void Main(string[] args)
        {
            SimpleLinkedList<int?> list = new SimpleLinkedList<int?>();
            Console.WriteLine("size:"+ list.size);
            list.append(18);
            list.append(4);
            list.append(12);
            list.append(1);
            list.printList();
            Console.WriteLine("size:" + list.size);
            list.remove(2);
            list.remove(0);
            list.set(10, 2);
            list.printList();
            Console.WriteLine("size:" + list.size);
        }
    }
}
