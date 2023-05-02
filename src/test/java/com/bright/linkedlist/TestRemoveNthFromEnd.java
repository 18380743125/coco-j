package com.bright.linkedlist;

import com.bright.utils.SingleLinkedList;
import org.junit.jupiter.api.Test;

public class TestRemoveNthFromEnd {
    @Test
    public void test() {
        SingleLinkedList head = SingleLinkedList.getHead();
        SingleLinkedList.print(head);
        head = RemoveNthFromEnd.removeNthFromEnd(head, 1);
        SingleLinkedList.print(head);
    }
}
