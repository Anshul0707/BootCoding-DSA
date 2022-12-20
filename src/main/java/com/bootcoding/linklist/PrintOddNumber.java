package com.bootcoding.linklist;
//Write a method to print only odd numbers of given linked list
public class PrintOddNumber
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        printOddNumber(head);
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
        Node thirdNode = new Node(3);
        Node forthNode = new Node(4);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head;
    }

    public static void printOddNumber(Node head)
    {
        Node temp = head;
        System.out.println("Odd numbers in given linked list is : ");
        while (temp != null)
        {
            if (temp.data % 2 == 1)
            {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
}
