package com.tom;

import java.beans.Customizer;

public class SaleTester {
    public static void main(String[] args) {
        Customer c1=new Customer("0001",1200);
        c1.print();
        SilverCustomer c3=new SilverCustomer("0003",1200);
        c3.print();
        GoldenCustomer c4=new GoldenCustomer("0004",2000);
        c4.print();
    }
}
