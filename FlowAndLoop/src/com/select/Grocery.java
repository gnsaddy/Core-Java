package com.select;

/**
 * Created by gnsad on 6/16/2018.
 */
public class Grocery {

    int weight;
    void weightNow(){
        weight =30;
    }

    void checkWeight(){
        this.weightNow();
        System.out.println("weight of Grocery is "+ weight);
    }

    public static void main(String[] args){
        Grocery obj= new Grocery();
        obj.checkWeight();
    }
}
