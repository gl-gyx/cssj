package com.tom;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String id,int pay){
        super(id,pay);
        off=0.2f;
    }

    @Override
    public void print() {
        System.out.println(id+"\t"+pay+"\t"+(pay-backMoney())+"("+backMoney()+")");
    }
}
