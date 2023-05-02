package com.bright.linkedlist;

import com.bright.utils.SingleLinkedList;

public class DetectCycle {
    public static SingleLinkedList detectCycle(SingleLinkedList head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        SingleLinkedList slow = head.next;
        SingleLinkedList fast = head.next.next;
        while (slow != fast) {
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
