package com.bright.linkedlist;

import com.bright.utils.SingleLinkedList;

public class RemoveNthFromEnd {
    /**
     * 删除链表倒数第 n 个结点
     *
     * @param head 头结点
     * @return 新的头结点
     */
    public static SingleLinkedList removeNthFromEnd(SingleLinkedList head, int n) {
        if(n <= 0) return head;
        SingleLinkedList dummy = new SingleLinkedList(-1, head);
        SingleLinkedList slow = dummy, fast = dummy;
        while (n-- > 0) {
            fast = fast.next;
            if (fast == null) return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
