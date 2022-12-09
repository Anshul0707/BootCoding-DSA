package com.bootcoding.linklist;

public class CountOfNodes
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        countOfNodes(head);

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

    public static  void  countOfNodes(Node head)
    {
        Node temp = head;
        int count=0;
        while (temp != null)
        {
            count=count+1;
            temp = temp.next;
        }
        System.out.println(count);
    }
}
