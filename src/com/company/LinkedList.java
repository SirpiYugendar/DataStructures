package com.company;

public class LinkedList {
    private Node head;
    private int count = 0;
    public LinkedList() {
        head = null;
        ++count;
    }
    void add(int data) {
        if (head == null)  {
            head = new Node(data, null);
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new Node(data, null);
        ++count;
    }
    void addAt(int index, int data) {
        if (index > count || index < 0) {
            System.out.println("|---------------------------------------|");
            System.out.println("|!!!!!!!!Warning: No such index !!!!!!!!|");
            System.out.println("|---------------------------------------|");
            return;
        }
        Node tmp = head, prev = null;
        while (--index > 0) {
                prev = tmp;
                tmp = tmp.next;
        }
        Node adj = new Node(data, null);
        if (prev != null)
            prev.next = adj;
        adj.next = tmp;
        ++count;
    }
    void print() {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.next == null) {
                System.out.print("" + tmp.data);
            }
            else
                System.out.print("" + tmp.data + "---> ");
            tmp = tmp.next;
        }
        System.out.println();
    }
    void sort() {
        Node temp = head;
        Node adj = temp.next;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (temp.data > adj.data) {
                    int tmp = temp.data;
                    temp.data = adj.data;
                    adj.data = tmp;
                }
                adj = adj.next;
            }
            temp = temp.next;
            adj = temp.next;
        }
    }
}
