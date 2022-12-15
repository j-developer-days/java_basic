package com.jdev.demo;

public class JavaDataTypes {

    /**
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     * */
    public static void main(String[] args) {
        booleanDataType();
        System.out.println("**************************");
        integralDataType();
        System.out.println("**************************");
        floatingDataTypes();
        System.out.println("**************************");
        charDataType();
    }

    private static void charDataType(){
        char c = '5';
        System.out.println("c = " + c);
        c = 'A';
        System.out.println("c = " + c);
        double pow = Math.pow(2, 16);
        System.out.println(pow);
        c = (char) 65535;
        System.out.println("c = " + c);

        for (int i = 0; i < 65_535 + 50; i++){
            System.out.println("#" + i + " = " + ((char)i));
        }
        System.out.println(65_569 - 65_536);

    }

    private static void floatingDataTypes(){
        floatDataType();
        System.out.println("**************************");
        doubleDataType();
    }

    /**
     * This means the numbers
     * are stored as two numbers, a and b, of the form a x 10b.
     */
    private static void doubleDataType(){
        //5_000 = 5 * 10 pow 3 =
        System.out.println("result = " + Math.pow(10, 3) * 5);
//        5.823 = a = 5823 = 10 -3
        System.out.println("result = " + Math.pow(10, -3) * 5_823);
        double d = 0.D;
        d = .0D;
        d = 1_000.000_5F;
//        float f = 0.0;
    }

    private static void floatDataType(){
        float f = 0.F;
        f = .0F;
        f = 1_000.000_5F;
    }

    /**
     * The byte, short, int, and long types are used for numbers without
     * decimal points. In mathematics, these are all referred to as
     * integral values, but in Java, int and Integer refer to specific types.
     * <p>
     * Each numeric type uses twice as many bits as the smaller similar
     * type. For example, short uses twice as many bits as byte does.
     * <p>
     * All of the numeric types are signed in Java. This means that they
     * reserve one of their bits to cover a negative range. For example,
     * byte ranges from -128 to 127. You might be surprised that the
     * range is not -128 to 128. Don’t forget, 0 needs to be accounted for
     * too in the range.
     */
    private static void integralDataType() {
        byteDataType();
        System.out.println("**************************");
        shortDataType();
        System.out.println("**************************");
        intDataType();
        System.out.println("**************************");
        longDataType();
        System.out.println("**************************");
    }

    private static void longDataType() {
        long l = 3_147_483_647L;
        System.out.println("l = " + l);
        double pow = Math.pow(2, 64);
        System.out.println("pow - " + pow);
        System.out.println(pow / 2);
        //range int
        long max = 9_223_372_036_854_775_807L;
//        max = 9223372036854775808L;
        long min = -9223372036854775808L;
//        min = -9223372036854775809L;
//        min = -2147483649;
    }

    private static void intDataType() {
        int i = 33_000;
        System.out.println("i = " + i);
        double pow = Math.pow(2, 32);
        System.out.println("pow - " + pow);
        System.out.println(pow / 2);
        //range int
        int max = 2_147_483_647;
//        max = 2147483648;
        int min = -2_147_483_648;
//        min = -2147483649;
    }

    private static void shortDataType() {
        short s = 10;
        System.out.println("s = " + s);
        double pow = Math.pow(2, 16);
        System.out.println("pow - " + pow);
        System.out.println(pow / 2);
        //range for short is from -32768 32767
        short min = -32_768;
        min = -32_767;
//        min = -32_769;
        short max = 32_767;
//        max = 32_768;
        System.out.println("min = " + min);

        short c = 'A';
        System.out.println("c = " + c);
        char ch = 65;
        System.out.println("ch = " + ch);
        ch = 0;
        System.out.println("ch = " + ch);
//        ch = -1;
    }

    private static void byteDataType() {
        byte b = 10;
        System.out.println("b - " + b);
        double pow = Math.pow(2, 8);
        System.out.println("pow - " + pow);
        //-128 - negative => 256 - 128 = 128
        //0-positive => 128 - 1 = 127
        //127
        //range -128 <-> 127
        byte min = -128;
//        min = -129;
        min = -127;
        b = 0;
        System.out.println("b - " + b);
        byte max = 127;
        max = 126;
//        max = 128;

    }

    private static void booleanDataType() {
        boolean b = true;
        System.out.println("b = " + b);
        b = false;
        System.out.println("b = " + b);
    }

}
