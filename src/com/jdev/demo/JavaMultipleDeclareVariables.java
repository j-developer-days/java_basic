package com.jdev.demo;

public class JavaMultipleDeclareVariables {

    public static void main(String[] args) {
        {
            String s1, s2;//declare variables
            String s3 = "s3", s4 = "s4";//declared and initialized our variables
        }

        {
            int i1, i2, i3 = 0;
            System.out.println(i3);
//            System.out.println(i1);
            i1 = i3 + 10;
            System.out.println(i1);
//            System.out.println(i2);
        }

        {
//            int num, String value;
            int num; String value;
            int num1, value1;
        }

        {
            boolean b1, b2;
            String s1 = "1", s6, s7 = "7", s8, s9;
            System.out.println(s1 + " " + s7);
//            System.out.println(s6 + " " + s8 + s9);
        }

        {
//            double d1, double d2;
            double d1; double d2;
            int i1; int i2, i3 = 0, i4;
//            int i5; i6;
        }

        {
            int i1; double d2; String s1; long l1 = 1L;
            int i2;
            int i3;
//            i4;
        }

    }

}
