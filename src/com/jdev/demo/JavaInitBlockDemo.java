package com.jdev.demo;

public class JavaInitBlockDemo {

    private int number = 1;

    public JavaInitBlockDemo() {
        System.out.println("before constructor no arg , number = " + number);
        number = 5;
        System.out.println("after constructor no args, number = " + number);
    }

    public JavaInitBlockDemo(int number) {
        this();
        System.out.println("before constructor with arg, number = " + number);
        this.number = number;
        System.out.println("after constructor with arg, number = " + number);
    }

    public static void main(String[] args) {
        JavaInitBlockDemo javaInitBlockDemo = new JavaInitBlockDemo();
        System.out.println("----------------------------------");
        JavaInitBlockDemo javaInitBlockDemo1 = new JavaInitBlockDemo(10);
    }


    {
        System.out.println("before init block 2 run, number = " + number);
        number = 3;
        System.out.println("after init block 2 run, number = " + number);
    }

    {
        System.out.println("before init block 1 run, number = " + number);
        number = 2;
        System.out.println("after init block 1 run, number = " + number);
    }


}
