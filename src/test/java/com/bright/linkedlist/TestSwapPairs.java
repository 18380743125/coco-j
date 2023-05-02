package com.bright.linkedlist;

import com.bright.utils.SingleLinkedList;
import org.junit.jupiter.api.Test;

public class TestSwapPairs {
    @Test
    public void test() {
        SingleLinkedList head = SingleLinkedList.getHead();
        SingleLinkedList.print(head);
        head = SwapPairs.swapPairs(head);
        SingleLinkedList.print(head);
    }
}
