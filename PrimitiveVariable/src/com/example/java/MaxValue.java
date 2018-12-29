package com.example.java;

/**
 * Created by Aditya PC on 21/7/2017.
 */
public class MaxValue {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println("Byte = " + b);
      //  b++;
       // System.out.println("Increment byte value " + b);
        // now output is -128,because the value of byte is from -128 to 127
        //then check condition by the use of helper class and MAX_VALUE function
        // MAX_VALUE function gives the maximum value of that primitive datatype

        if (b < Byte.MAX_VALUE) {
            b++;
        }
        System.out.println("New byte value is " + b);
    }
}