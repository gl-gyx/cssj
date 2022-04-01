package com.tom.eryufen;

import com.tom.eryufen.Customer;

public class TiaCustomer extends Customer {
    public TiaCustomer(String id,int pay){
        super(id,pay);
        off=0.3f;
    }
    public void print(){
        System.out.println(id+"\t"+pay+"\t"+(pay-backMoney())+"("+backMoney()+")");
    }

}
