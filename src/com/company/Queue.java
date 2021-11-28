package com.company;

public class Queue {
    private Node head;
    public Queue() {
       this.head = null;
    }
    public void enqueue(int data) {
        if (head == null) {
            head = new Node(data, null);
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new Node(data, null);
    }
    public void print() {
        if (head == null) {
            System.out.println("Not populated!!");
            return;
        }
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
    public int dequeue() {
        int data = head.data;
        head = head.next;
        return data;
    }
}
