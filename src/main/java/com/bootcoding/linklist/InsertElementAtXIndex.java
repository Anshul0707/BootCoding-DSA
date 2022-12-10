package com.bootcoding.linklist;

public class InsertElementAtXIndex
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        int position=3;
        InsertElementAtXIndex(head,position);

    }

    public static void printLinkedList(Node head){
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
        Node thirdNode = new Node(3);
        Node forthNode = new Node(4);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head;
    }

    public static  void  InsertElementAtXIndex(Node head,int position)
    {
        Node newNode = new Node(100);
        Node temp = head;
        while (temp != null)
        {
            temp = temp.next;
        }

        int index = position-1;
        temp = head;
        for(int i=1; i<index; i++)
        {
            temp = temp.next;
        }
        Node temp2 = temp.next;
        temp.next = newNode;
        newNode.next = temp2;
        printLinkedList(head);
    }
}
