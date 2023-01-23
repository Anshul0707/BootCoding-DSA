package com.bootcoding.leetcode;

public class DeleteDuplicates
{
      public class ListNode
      {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            while (temp.next != null && temp.next.val == temp.val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
