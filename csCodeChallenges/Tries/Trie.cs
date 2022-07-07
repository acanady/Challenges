using System;

namespace Tries
{
    class Trie
    {
        public char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        public class Node
        {
            public bool isWord;
            public Node[] children;


            public Node(){
                children = new Node[26];
            }
        }

        Node root;

        public Trie()
        {
            root = new Node();
            root.isWord = false;
        }

        public void Insert(string word)
        {
            Node curr = root;
            if (word == null) return;

            for(int i = 0; i < word.Length; i++)
            {
                if (curr.children[word[i] - 'a'] != null)
                {
                    curr = curr.children[word[i] - 'a'];
                }
                else
                {
                    curr.children[word[i] - 'a'] = new Node();
                    curr = curr.children[word[i] - 'a'];
                }
            }
            curr.isWord = true;

        }

        public bool Search(string word)
        {
            Node curr = root;
            for(int i = 0; i < word.Length; i++)
            {
                if (curr.children[word[i] - 'a'] == null) return false;
                else
                {
                    curr = curr.children[word[i] - 'a'];
                }
            }
            return curr.isWord;
        }

        public bool StartsWith(string prefix)
        {
            Node curr = root;
            for (int i = 0; i < prefix.Length; i++)
            {
                if (curr.children[prefix[i] - 'a'] == null) return false;
                else
                {
                    curr = curr.children[prefix[i] - 'a'];
                }
            }
            return true;
        }

        //printing tree requires breadth first search traversal
        public void printTree()
        {
            
        }

        public static void Main(string[] args)
        {
            Trie testTrie = new Trie();
            testTrie.Insert("apple");
            Console.WriteLine(testTrie.Search("apple"));
            Console.WriteLine(testTrie.Search("app"));
            Console.WriteLine(testTrie.StartsWith("app"));
            testTrie.Insert("app");
            Console.WriteLine(testTrie.Search("app"));
            Console.WriteLine(testTrie.StartsWith("hello"));
        }
    }
}
