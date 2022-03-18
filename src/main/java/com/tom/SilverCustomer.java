package com.tom;

public class SilverCustomer extends Customer{

    public SilverCustomer(String id,int pay){
        super(id,pay);
    }

    @Override
    public void print() {
        System.out.println(id+"\t"+pay+"\t"+(pay-backMoney())+"("+backMoney()+")");
    }
}
