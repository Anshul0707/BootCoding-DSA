package com.bootcoding.linklist;

public class InsertElementInMiddle
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        insertElementInMiddle(head);

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

    public static  void  insertElementInMiddle(Node head)
    {
        Node newNode = new Node(100);
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            temp = temp.next;
            count++;
        }
        // find the middle node
        int middlePosition = count/2;
        temp = head;
        for(int i=1; i<middlePosition; i++)
        {
            temp = temp.next;
        }
        Node temp2 = temp.next;
        temp.next = newNode;
        newNode.next = temp2;
        printLinkedList(head);
    }
}
