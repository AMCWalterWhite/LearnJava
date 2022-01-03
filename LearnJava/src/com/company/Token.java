package com.company;

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) throws Exception {

        FileInputStream f = new FileInputStream("D:\\test.txt");
        byte []b = new byte[f.available()];
        f.read(b);
        String data = new String(b);
        StringTokenizer s = new StringTokenizer(data,"\n");
        String str;
        while(s.hasMoreTokens()){
           str=s.nextToken();
           System.out.println(str);
        }


    }
}
