package com.bootcoding.linklist;
//Write a method to print only even numbers of given linked list
public class PrimeNumbers
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        primeNumbers(head);
    }

    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    private static Node createLinkedList()
    {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(13);
        Node forthNode = new Node(19);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head;
    }
    public static boolean isPrimeNumber(int num)
    {
        if (num < 1)
        {
            return false;
        }
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void primeNumbers(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            if (isPrimeNumber(temp.data))
            {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
}
