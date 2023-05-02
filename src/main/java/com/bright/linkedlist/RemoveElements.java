package com.bright.linkedlist;

import com.bright.utils.SingleLinkedList;

public class RemoveElements {
    public static SingleLinkedList removeElements(SingleLinkedList head, int val) {
        SingleLinkedList dummy = new SingleLinkedList(-1, head);
        SingleLinkedList curr = dummy;
        while(curr.next != null) {
            if(curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
