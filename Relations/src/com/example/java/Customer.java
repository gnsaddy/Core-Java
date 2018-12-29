package com.example.java;

public class Customer {
    int customerId;
    String customerName;

    void setCustomer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public void getCustomer() {
        System.out.println("Show Customer Id and Customer name " + customerId + " and " + customerName);
    }
}

class Order extends Customer {
    int orderId;
    String orderName;

    void setOrder(int orderId, String orderaName) {

        this.orderId = orderId;
        this.orderName = orderaName;
    }

    public void display() {
        System.out.println("Show Order Id and Order name " + orderId + " and " + orderName);
    }


    public static void main(String[] args) {

        Order obj = new Order();
        obj.setCustomer(153, "Adity Raj");
        obj.getCustomer();
        obj.setOrder(112, "Milk");
        obj.display();


    }

}