package com.select;

/**
 * Created by gnsad on 6/27/2018.
 */
public class CheckTry {
    void display(){
        throw new RuntimeException();
    }
    public static void main(String[] args){
        CheckTry obj= new CheckTry();
        try{
            obj.display();
        }catch (RuntimeException e){
            System.out.println("Runtime Exception raised");
        }
    }
}
