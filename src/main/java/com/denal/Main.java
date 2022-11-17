package com.denal;


public class Main {
    public static void main(String[] args) {
        //Variables
        byte b = 127;
        byte b2 = 100;
        short s = 32767;
        int i = 25;
        long l = 100000L;
        float f = 33.33f;
        double d = 6.66;

        //Calculations with different data types
        System.out.println(l + f);
        if (f / i != s * d) {
            System.out.println("You can work with different types of data in calculations");
        }
        int intFromDoub = (int) (f - d);
        System.out.println(intFromDoub);

        //Overflows
        byte oper = (byte) (b + b2);
        System.out.println(oper);
        if (f + d > 10 && s - i > 10) {
            s += 100;
            System.out.println(s);
        }
    }
}