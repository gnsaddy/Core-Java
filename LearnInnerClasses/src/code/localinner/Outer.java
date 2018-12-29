package code.localinner;

  class Outer {

      void m1(){
          class Inner {
              void sum(int x,int y){
                  System.out.println("the sum " +(x+y));
              }
          }
          Inner i =new Inner();
          i.sum(10,20);
          ;
          ;
          ;
          i.sum(100,200);
          ;
          ;
          i.sum(1000,2000);
          ;
          ;
      }
      public static void main(String[] args){
          Outer obj = new Outer();
          obj.m1();
      }

}
