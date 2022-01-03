package com.company;

import java.util.BitSet;

public class BitSe {
    public static void main(String[] args) {
        BitSet b = new BitSet();
        BitSet b2 = new BitSet();
        b.set(0);
        b.set(1);
        b.set(2);
        b2.set(0);
        b2.set(1);
        b2.set(2);
        b2.set(3);
        b2.set(4);
        b2.set(5);
        b2.set(10);

        b.and(b2);

        b2.flip(0,b2.length());
        System.out.println(b);
        System.out.println(b2);
    }
}
