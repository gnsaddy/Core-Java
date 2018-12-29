package com.example.java;

public class Bank{
    private String bankName;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
}
class Emp{
    private String emoloyeename;

    public void setEmoloyeename(String emoloyeename) {
        this.emoloyeename = emoloyeename;
    }

    public String getEmoloyeename() {
        return emoloyeename;
    }
}

class Association{
    public static void main(String[] args){
        Bank bank=new Bank();
        bank.setBankName("Axis Bank");
        Emp emp=new Emp();
        emp.setEmoloyeename("Aditya Raj");
        System.out.println(emp.getEmoloyeename() + " is a employee of " +bank.getBankName());
    }
}
