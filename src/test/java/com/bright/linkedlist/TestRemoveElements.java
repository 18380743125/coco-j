package com.bright.linkedlist;

import com.bright.utils.SingleLinkedList;
import org.junit.jupiter.api.Test;

public class TestRemoveElements {
    @Test
    public void test() {
        SingleLinkedList head = SingleLinkedList.getHead();
        SingleLinkedList result = RemoveElements.removeElements(head, 6);
        SingleLinkedList.print(result);
        SingleLinkedList reversed = SingleLinkedList.reverseLinkedList(result);
        SingleLinkedList.print(reversed);
    }
}
