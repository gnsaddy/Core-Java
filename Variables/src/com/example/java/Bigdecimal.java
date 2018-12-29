package com.example.java;

import java.math.BigDecimal;

/**
 * Created by Aditya PC on 21/7/2017.
 */
public class Bigdecimal {
    public static void main(String[] args) {
        double val=.012;
        double sum=val+val+val;
        System.out.println("Sum =" +sum); //the output of sum is not exact Sum =0.036000000000000004
       String strvalue=Double.toString(val); //for exact firstly convert value into string by the use of toString method
       System.out.println("exact value =" +strvalue); //showing exact value exact value =0.012
       BigDecimal bval=new BigDecimal(strvalue);
       BigDecimal bsum=bval.add(bval).add(bval);
       System.out.println("Sum of bigvalue " +bsum.toString());
    }
}
