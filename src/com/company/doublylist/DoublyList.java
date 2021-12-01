package com.company.doublylist;


public class DoublyList {
    private DNode head;
    public DoublyList() {
        head = null;
    }
    public void add(int data) {
        if (head == null) {
            head = new DNode(data);
            head.next = head;
            return;
        }
        DNode tmp = head;
        while (tmp.next != head) {
            tmp = tmp.next;
        }
        tmp.next = new DNode(data);
        head.prev = tmp.next;
        tmp.next.next = head;
    }
    public void listPrint() {
        DNode tmp = head;
        while (tmp.next != head) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.print(tmp.data + " ");
    }
}
