package com.bright.linkedlist;

import com.bright.utils.SingleLinkedList;

public class GetIntersectionNode {
    public static SingleLinkedList getIntersectionNode(SingleLinkedList headA, SingleLinkedList headB) {
        SingleLinkedList l1 = headA;
        SingleLinkedList l2 = headB;
        while(l1 != l2) {
            l1 = l1 != null ? l1.next : headB;
            l2 = l2 != null ? l2.next : headA;
        }
        return l1;
    }
}
