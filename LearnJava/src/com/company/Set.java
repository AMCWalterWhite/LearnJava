package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Mycom implements Comparable<Object>{
   int x;
   int y;
   Mycom(int x,int y){
       this.x=x;
       this.y=y;

   }
   public String toString(){
       return "x="+x+"y="+y;

   }

    @Override
    public int compareTo(Object o) {
        Mycom m = (Mycom)o;

        if(this.x<m.x)
            return 1;
        else if(this.x>m.x)
            return -1;
        else {
            if (this.y<m.y)
                return 1;
            else if (this.y>m.y)
                return -1;
            else return 0;
        }
    }
}

public class Set {
    public static void main(String[] args) {

        TreeSet<String> h = new TreeSet<>();
        h.add("Hello");
        h.add("Anakam");
        h.add("kaise ho");
        h.add("Sayonara");
        h.add("Namaste");
        h.add("Helloo");

        h.forEach(k-> System.out.println(k));

        TreeSet<Mycom> m = new TreeSet<>();
        m.add(new Mycom(4,5));
        m.add(new Mycom(1,5));
        m.add(new Mycom(2,5));
        System.out.println(m);







    }
}
