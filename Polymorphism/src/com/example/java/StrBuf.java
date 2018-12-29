package com.example.java;

public class StrBuf {
    void show(){
        StringBuffer sb=new StringBuffer("java");
        sb.append(" add at the end");
        System.out.println(sb);




    }
    public static void main(String args[])
    {
        StrBuf obj=new StrBuf();
        obj.show();
        System.out.println("j value =" +args[0]);

    }
}
