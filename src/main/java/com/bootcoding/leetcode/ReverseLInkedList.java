package com.bootcoding.leetcode;

public class ReverseLInkedList
{
    public class ListNode
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!= null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
        return head;
    }
}
