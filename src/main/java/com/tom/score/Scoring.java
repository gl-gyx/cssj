package com.tom.score;

public class Scoring {
    public static void main(String[] args) {
        int[] math={11,22,33,44};
        int[] english={11,22,33,44};
        String[] names={"jack","rose","tomas","hank"};
        for(int i=0;i<=3;i++){
            System.out.println(names[i]+"\t"+english[i]+"\t"+math[i]+"\t"+((english[i]+math[i]) /2));
        }
    }

}
