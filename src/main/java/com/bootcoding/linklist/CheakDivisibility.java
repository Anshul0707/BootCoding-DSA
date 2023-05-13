package com.bootcoding.linklist;

public class CheakDivisibility
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        cheakDivisibility(head);

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

    public static void cheakDivisibility(Node head)
    {
        Node temp = head;
        System.out.println("Numbers divisible by 3 or 5 in given linked list : ");
        while (temp != null)
        {
            if (temp.data % 3 == 0 || temp.data % 5 == 0)
            {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }

}
