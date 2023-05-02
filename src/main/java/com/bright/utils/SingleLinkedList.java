package com.bright.utils;

public class SingleLinkedList {
    public int val;
    public SingleLinkedList next;

    public SingleLinkedList(int val) {
        this.val = val;
    }

    public SingleLinkedList(int val, SingleLinkedList next) {
        this.val = val;
        this.next = next;
    }

    public static SingleLinkedList getHead() {
        SingleLinkedList head = new SingleLinkedList(1);
        SingleLinkedList n1 = new SingleLinkedList(2);
        SingleLinkedList n2 = new SingleLinkedList(6);
        SingleLinkedList n3 = new SingleLinkedList(3);
        SingleLinkedList n4 = new SingleLinkedList(4);
        SingleLinkedList n5 = new SingleLinkedList(5);
        SingleLinkedList n6 = new SingleLinkedList(6);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return head;
    }

    public static SingleLinkedList getCycleHead() {
        SingleLinkedList head = new SingleLinkedList(1);
        SingleLinkedList n1 = new SingleLinkedList(2);
        SingleLinkedList n2 = new SingleLinkedList(6);
        SingleLinkedList n3 = new SingleLinkedList(3);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n1;
        return head;
    }

    public static SingleLinkedList[] getTwoIntersectionHead() {
        SingleLinkedList head1 = new SingleLinkedList(1);
        SingleLinkedList head2 = new SingleLinkedList(9);
        SingleLinkedList n1 = new SingleLinkedList(2);
        SingleLinkedList n2 = new SingleLinkedList(6);
        SingleLinkedList n3 = new SingleLinkedList(3);
        SingleLinkedList n4 = new SingleLinkedList(4);
        SingleLinkedList n5 = new SingleLinkedList(5);
        SingleLinkedList n6 = new SingleLinkedList(6);
        head1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        head2.next = n5;
        n5.next = n6;
        return new SingleLinkedList[]{head1, head2};
    }

    public static SingleLinkedList reverseLinkedList(SingleLinkedList head) {
        SingleLinkedList pre = null;
        SingleLinkedList curr = head;
        while(curr != null) {
            SingleLinkedList next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void print(SingleLinkedList head) {
        System.out.println("============= 单链表打印开始 =============");
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println("\n============= 单链表打印结束 =============\n");
    }
}
