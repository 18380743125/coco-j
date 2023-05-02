package com.bright.linkedlist;

import com.bright.utils.SingleLinkedList;
import org.junit.jupiter.api.Test;

public class TestGetInterSectionNode {
    @Test
    public void test() {
        SingleLinkedList[] heads = SingleLinkedList.getTwoIntersectionHead();
        SingleLinkedList intersectionNode = GetIntersectionNode.getIntersectionNode(heads[0], heads[1]);
        SingleLinkedList.print(intersectionNode);
    }
}
