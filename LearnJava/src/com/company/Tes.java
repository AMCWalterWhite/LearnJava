package com.company;
import java.util.*;

import java.util.TreeMap;

import static java.util.Map.*;
import static java.util.Optional.of;

public class Tes {
    public static void main(String[] args) {

        //int a[] = {1,2,3,4,5,6,7,8,9};
        int b[] = {1,2,3,4,5,6,7,4,9};
        int c[] = {1};//Arrays.copyOf(a,a.length);
        Arrays.fill(c,10);
        Arrays.sort(b);

        for (int x:b
             ) {
            System.out.println(x);
        }



    }
}
