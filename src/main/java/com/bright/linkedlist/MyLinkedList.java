package com.bright.linkedlist;

class ListNode {
    int val;
    ListNode next, prev;

    ListNode(int val) {
        this.val = val;
    }
}

public class MyLinkedList {

    int size; // 记录链表中元素的数量

    ListNode head, tail; // 链表的虚拟头结点和尾结点

    public MyLinkedList() {
        // 初始化操作
        this.size = 0;
        this.head = new ListNode(0);
        this.tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index) {
        //判断index是否有效
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cur = this.head;
        // 判断是哪一边遍历时间更短
        if (index >= size / 2) {
            // tail开始
            cur = tail;
            for (int i = 0; i < size - index; i++) {
                cur = cur.prev;
            }
        } else {
            for (int i = 0; i <= index; i++) {
                cur = cur.next;
            }
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        // index 大于链表长度
        if (index > size) {
            return;
        }
        // index 小于0
        if (index < 0) {
            index = 0;
        }
        size++;
        // 找到前驱
        ListNode pre = this.head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = pre.next;
        pre.next.prev = newNode;
        newNode.prev = pre;
        pre.next = newNode;

    }

    public void deleteAtIndex(int index) {
        // 判断索引是否有效
        if (index < 0 || index >= size) {
            return;
        }
        // 删除操作
        size--;
        ListNode pre = this.head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next.next.prev = pre;
        pre.next = pre.next.next;
    }
}