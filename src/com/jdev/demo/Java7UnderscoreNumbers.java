package com.jdev.demo;

public class Java7UnderscoreNumbers {

    public static void main(String[] args) {
        int million = 1000000;
        million = 1_000_000;

//        double notAtStart = _1000.00;// DOES NOT COMPILE, because in begin
//        double notAtEnd = 1000.00_;// DOES NOT COMPILE on the end
//        double notByDecimal = 1000_.00;// DOES NOT COMPILE before . sign
//        double notByDecimal = 1000._00;// DOES NOT COMPILE after . sign
        double annoyingButLegal = 1_00_0.0_0;// Ugly, but compiles
        double reallyUgly = 1__________2;// Also compiles
        float f = 10_259.023_892F;
    }

}
