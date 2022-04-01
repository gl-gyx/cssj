package com.tom.sanyueshiba;

public class Ticket {
    public static final int TAIPEI_STATION=100;
    public static final int TAICHUNG_STATION=200;
    public static final int KAOHISUNG_STATION=300;

    Station start;
    Station destination;
    int price;
    public Ticket(Station start,Station destination){
        this.start=start;
        this.destination=destination;
    }
    public void print(){
        if(start.id==100){
            if(destination.id==200){
                price=600;
            }else {
                price=900;
            }
        }else if (){

        }
        System.out.println();
    }

}
