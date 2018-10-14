package com.tranglua;

public class Main {

    public static void  main(String[] args) {
        int a=1;
        int b=2;

        int c;
        c = SumCal(a,b);
        System.out.println(c);
        c = DevCal(a, b);
        System.out.println(c);
    }

    public static int SumCal(int a, int b){ return a+b; }
    public static int DevCal(int a, int b){return a-b;}

}
