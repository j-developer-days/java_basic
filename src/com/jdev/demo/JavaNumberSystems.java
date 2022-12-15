package com.jdev.demo;

public class JavaNumberSystems {

    /**
     * Octal (digits 0–7), which uses the number 0 as a prefix—for
     * example, 017
     *
     * Hexadecimal (digits 0–9 and letters A–F/a–f), which uses 0x or 0X
     * as a prefix—for example, 0xFF, 0xff, 0XFf. Hexadecimal is case
     * insensitive so all of these examples mean the same value.
     *
     * Binary (digits 0–1), which uses the number 0 followed by b or B as
     * a prefix—for example, 0b10, 0B10
     */
    public static void main(String[] args) {
        int decimal = 10;
        System.out.println("decimal = " + decimal);
        decimal = 19;
        System.out.println("decimal = " + decimal);
        int binary = 0B000000101;
        System.out.println("binary - " + binary);
        System.out.println(Integer.toBinaryString(5));

        int octal = 000017;
        System.out.println("octal = " + octal);
        System.out.println(Integer.toOctalString(15));

        /*
        * a = 10
        * b = 11
        * c = 12
        * d = 13
        * e = 14
        * f = 15
        * */
        int hexaDecimal = 0Xfff;
        System.out.println("hexaDecimal = " + hexaDecimal);
        hexaDecimal = 0x19AF;
        System.out.println("hexaDecimal = " + hexaDecimal);
    }

}
