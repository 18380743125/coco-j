package com.bright.linkedlist;

import com.bright.utils.SingleLinkedList;

public class SwapPairs {
    public static SingleLinkedList swapPairs(SingleLinkedList head) {
        SingleLinkedList dummy = new SingleLinkedList(-1, head);
        SingleLinkedList curr = dummy;
        while(curr.next != null && curr.next.next != null) {
            SingleLinkedList first = curr.next;
            SingleLinkedList second = curr.next.next;
            curr.next = second;
            first.next = second.next;
            second.next = first;
            curr = curr.next.next;
        }
        return dummy.next;
    }
}
