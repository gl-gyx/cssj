package com.tom.sanyueshiba;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket=new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        Scanner scanner=new Scanner(System.in);
        System.out.print("you start station");
        int choice=Integer.parseInt(scanner.next());
        Station.startStation=null;
        switch (choice){
            case 1:
                endStation=Station.TAIPEI_STATION;
                    break;
            case 2:
                endStation=Station.TAICHUNG_STATION;
                    break;
            case 3:
                endStation=Station.KAOHSIUNG_STATION;
                break;
        }
        int id;
        String name

    }
}
