package com.bootcoding.leetcode;

public class CycleLinkedList
{
    class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
      }
    }

    public boolean hasCycle(ListNode head) {
        ListNode sp=head;
        ListNode fp=head;

        while(true) {
            if (fp == null || fp.next==null) {
                return false;
            }
            sp=sp.next;
            fp=fp.next.next;
            if (sp==fp) {
                return true;
            }

        }

    }
}
