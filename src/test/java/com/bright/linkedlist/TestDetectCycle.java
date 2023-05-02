package com.bright.linkedlist;

import com.bright.utils.SingleLinkedList;
import org.junit.jupiter.api.Test;

public class TestDetectCycle {
    @Test
    public void test() {
        SingleLinkedList cycleHead = SingleLinkedList.getCycleHead();
        SingleLinkedList node = DetectCycle.detectCycle(cycleHead);
        System.out.println(node.val);
    }
}
