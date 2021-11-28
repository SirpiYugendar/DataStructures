package com.company;

public class Stack {
    Node head;
    private int count = 0;
    public Stack() {
        this.head = null;
        this.head = null;
    }
    public int pop() {
        if (head == null) {
            System.out.println("Nothing to pop!!");
            return -11101;
        }
        if (head.next == null) {
            int data = head.data;
            head = null;
            return data;
        }
        Node tmp = head;
        Node prev = null;
        while (tmp.next != null) {
            prev = tmp;
            tmp = tmp.next;
        }
        int data = tmp.data;
        prev.next = null;
        return  data;
    }
    public int getCount() {
        return count;
    }
    public void print() {
        Node tmp = head;
        if (head == null) {
            System.out.println("Not Intialized!");
            return;
        }
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
        return;
    }
    public void sort() {
        Node tmp;
        for (int i = 0; i < count - 1; ++i) {
            tmp = head;
            for (int j = 0; j < count - 1; ++j) {
                if (tmp.data > tmp.next.data) {
                    int temp = tmp.data;
                    tmp.data = tmp.next.data;
                    tmp.next.data = temp;
                }
                tmp = tmp.next;
            }
        }
    }
    public void push(int data) {
        if (head == null) {
            this.head = new Node(data, null);
            ++count;
            return;
        }
        Node tmp = head;
        while (tmp.next != null)
        {
            tmp = tmp.next;
        }
        Node n = new Node(data, null);
        tmp.next = n;
        ++count;
        return;
    }
}
