package com.company.doublylist;

public class DNode {
    DNode prev;
    int data;
    DNode next;
    public DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
