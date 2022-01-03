package com.company;


import java.util.*;

public class Mist {
    public static void main(String[] args) {

        List<Object> data = new ArrayList<Object>();
        data.add(455);
        data.add(456);
        data.add(457);
        data.add("hello");
        data.add("sjjas" + "djiji");
        data.forEach(j -> System.out.println(j));
        for (Object x : data) {
            System.out.println(x);
        }
        //System.out.println(arrayList.indexOf(455));

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(456);
        a.add(46);
        a.add(48);

        data.addAll(a);
        System.out.println(data);

        ListIterator l = a.listIterator();
        System.out.println(l.next());
        System.out.println(l.next());
        System.out.println(l.next());
        a.forEach(n -> System.out.println(n));
        int b[] = {1};
        String s[] = {"hello", "byr"};
        for (int x : b) {
            System.out.println(x);
        }



      /*  arrayList.addAll(a);
        System.out.println(arrayList);
        arrayList.removeAll(a);
        Object x =a.listIterator();
        System.out.println(arrayList);

        a.clear();
        System.out.println(!a.isEmpty());*/

    }
}
