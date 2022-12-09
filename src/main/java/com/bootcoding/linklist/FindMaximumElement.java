package com.bootcoding.linklist;

public class FindMaximumElement
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        findMaximumElement(head);

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

    public static  void  findMaximumElement(Node head)
    {

        Node temp = head;
        int max=head.data;
        while (temp != null)
        {
            if (temp.data>max)
            {
                max= temp.data;
            }
            temp = temp.next;
        }
        System.out.println(max);
    }
}
