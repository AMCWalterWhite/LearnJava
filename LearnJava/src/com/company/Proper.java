package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class Proper {
    public static void main(String[] args)throws Exception {
        Properties p = new Properties();
        p.setProperty("processor","i7");
        p.setProperty("os","10");
        p.setProperty("model","notepad");
        p.setProperty("mouse","logitech");

       // System.out.println(p);
       // p.store(new FileOutputStream("D:\\test.txt"),"LAPPY");
        p.load(new FileInputStream("D:\\test.txt"));
        System.out.println(p);
        System.out.println(p.getProperty("processor"));

    }
}
