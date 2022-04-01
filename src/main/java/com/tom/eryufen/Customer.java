package com.tom.eryufen;

public class Customer {
    int pay;
    String id;
    float off=0.1f;

    public Customer(String id,int pay){
    this.id=id;
    this.pay=pay;
    }
    public float backMoney(){
        return (pay/1000)*off*1000;
    }
    public void print(){
        System.out.println(id+"\t"+pay+"\t"+(pay-backMoney()));
    }
}
