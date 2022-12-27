package com.jdev.demo;

import java.util.Properties;

public class VarRules {

    static {
        var c = 100;
    }

    {
        var c = 100;
    }

    /**
     * Rule 1. A var is used as a local variable in a constructor, method, or initializer block.
     */

    public VarRules() {
        var c = 10;
    }

    public static void show1() {
        var c = 1_000L;
    }

    public static void main(String[] args) {
//        rule 3
        //A var is always initialized on the same line (or statement) where it is declared.
        var i = 0;
        var g =
                10;
//        var ii;
//        ii = 10;


        {
            //rule 4
            //The value of a var can change, but the type cannot.
            var o = 10;
            o = 100;
//            o = 10L;
        }

        {
//            rule 5
//            A var cannot be initialized with a null value without a type.
//            var s = null;
            var gg = (Integer) null;
            System.out.println(gg);
            gg = 10;
            System.out.println(gg);
            var gg2 = (String) null;
        }

        {
            //rule 6
//            A var is not permitted in a multiple-variable declaration.
            for (int i2 = 0, y = 0; i2 < 10; i2++){
                System.out.println(i2);
            }
        }

        //        var in the Real World
//        this would be an improvement without losing any information
        Properties properties = new Properties();
        var properties1 = new Properties();

    }

    public void show() {
        var c = 1_000L;
    }

}

/*A var cannot be used in constructor parameters, method parameters, instance variables, or class variables.* */
class VarRule2 {
//    private static var I;
//    private var i;
//
//    public VarRule2(var i) {
//        this.i = i;
//    }
//
//    public void setI(var i) {
//        this.i = i;
//    }
}