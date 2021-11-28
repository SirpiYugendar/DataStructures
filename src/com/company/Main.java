package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; ++i) {
            list.add(i + new Random().nextInt(100));
        }
        list.print();
    }
}
