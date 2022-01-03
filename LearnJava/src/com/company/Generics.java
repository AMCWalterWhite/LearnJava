package com.company;

import java.util.ArrayList;

class Mygen<T>{
    T obj;
    void setMygen(T v){
        obj =v;

    }
     T geMygen(){
        return obj;

    }
}


public class Generics
{
    public static void main(String[] args)
    {
        Mygen<Integer> t = new Mygen<>();
        t.setMygen(45+5);

       // System.out.println(t.geMygen());







    }





}



