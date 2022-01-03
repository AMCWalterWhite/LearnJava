package com.company;

import java.util.PriorityQueue;

public class Que {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        p.add(10);
        System.out.println(p.peek());
        p.add(7);

        System.out.println(p.peek());
        p.add(5);


        p.add(4);
        System.out.println(p.peek());
        p.add(3);
        System.out.println(p);

    }
}
