package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydq {
    public static void main(String[] args) {
        ArrayDeque d = new ArrayDeque();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addFirst(4);
        d.addFirst(5);
        d.removeLast();
        d.removeFirst();
        d.remove(4);

        System.out.println(d);
        d.forEach(k-> System.out.println(k));
        long start = System.nanoTime();
        // some time passes
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println(elapsedTime);

    }
}
