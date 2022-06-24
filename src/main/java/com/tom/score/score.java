package com.tom.score;

public class score {
    public static void main(String[] args) {
        Student jack=new Student("jack");
        Student hank=new Student("hank",84,66);
        jack.english=100;
        jack.math=88;
        jack.print();
        hank.print();
        Student s =new Student();
        GraduatedStudent jane= new GraduatedStudent("jane",99,88,88);
        jane.name="jane";
        jane.print();
    }
}
