package com.bootcoding.linklist;

public class FindMinimumElement
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        findMinimumElement(head);

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
    private static Node createLinkedList()
    {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(4);
        Node forthNode = new Node(3);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head;
    }

    public static  void  findMinimumElement(Node head)
    {

        Node temp = head;
        int min=head.data;
        while (temp != null)
        {
            if (temp.data <min)
            {
                min= temp.data;
            }
            temp = temp.next;
        }
        System.out.println(min);
    }
}
