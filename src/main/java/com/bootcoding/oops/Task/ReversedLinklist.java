package com.bootcoding.oops.Task;

public class ReversedLinklist
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        printLinkedList(head);
        Node reverse = reverse(head);
        printLinkedList(reverse);
//        System.out.println(""+printLinkedList(reverse));
    }

    public static class Node
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

    public static void printLinkedList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public  static Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

}
