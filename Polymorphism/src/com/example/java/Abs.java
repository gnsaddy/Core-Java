package com.example.java;

 class Ani {
     static void showStatic(){
         System.out.println("static base method");
     }
     void showInstance(){
         System.out.println("Instance class method");
     }
 }
 class Bni extends Ani{
     static void showStatic(){
         System.out.println("static child method");
     }
     void showInstance(){
         System.out.println("Instance child method");
     }
     public static void main(String[] args){
         Bni obj=new Bni();
         //obj.showInstance();
         Ani ani=obj;
         ani.showInstance();
         Ani.showStatic();
         Bni.showStatic();
     }
 }
