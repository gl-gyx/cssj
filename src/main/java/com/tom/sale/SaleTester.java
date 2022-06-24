package com.tom.sale;

import java.util.ArrayList;
import java.util.List;

public class SaleTester {
    public static void main(String[] args) {
        List<Customer> Customers=new ArrayList<>();
        Customers.add(new Customer("0001",1200));
        Customers.add(new Customer("0002",1200));
        Customers.add(new SilverCustomer("0003",1200));
        Customers.add(new GoldenCustomer("0004",1200));
        for(Customer c :Customers){
            c.print();
        }

    }
}
