package com.bright.linkedlist;

import org.junit.jupiter.api.Test;

public class TestMyLinkedList {
    @Test
    public void test() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        System.out.println(list.get(1));
        list.deleteAtIndex(1);
        System.out.println(list.get(1));
    }
}
