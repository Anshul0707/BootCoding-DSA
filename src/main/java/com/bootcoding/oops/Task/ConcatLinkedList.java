package com.bootcoding.oops.Task;

public class ConcatLinkedList
{
    public static void main(String[] args)
    {
        Node head1 = createLinkedListOne();
        Node head2 = createLinkedListTwo();
        concat(head1,head2);
        printLinkedList(head1);
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


    private static Node createLinkedListOne()
    {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node forthNode = new Node(4);

        Node head1 = firstNode;
        head1.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head1;
    }
    private static Node createLinkedListTwo()
    {
        Node fifthNode = new Node(5);
        Node sixthNode = new Node(6);
        Node seventhNode = new Node(7);
        Node eigthNode = new Node(8);

        Node head2 = fifthNode;
        head2.next = sixthNode;
        sixthNode.next = seventhNode;
        seventhNode.next = eigthNode;
        eigthNode.next = null;
        return head2;
    }

    public  static void concat(Node head1,Node head2)
    {
        Node temp = head1;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = head2;
    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
