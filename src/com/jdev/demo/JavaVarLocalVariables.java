package com.jdev.demo;

public class JavaVarLocalVariables {

//    var name = "text";

    public static void main(String[] args) {
//        var i = 0;
        int i = 0;
        var text = "text";
//        text = 0;

        var r = "r";
        r = "text";

        {
            /*
             * the byte can be automatically promoted to a short, because a byte is small enough that it can fit
             * inside of short.
             * */
            var s = (short)10;
            s = (byte)5;
//            s = 1_000_000;

            short s1 = (short)10;
            s1 = (byte)5;
//            s1 = 1_000_000;
        }

        {
//            breaking declaration, this is valid
            var i2
                    =5;
        }

        {
            //Remember that for local variable type inference, the compiler looks only at the line with the declaration.
            boolean ch = true;
            var q1 = 1;
            q1 = 1;
            var a1 = -1;
            if(ch){
                a1 = 2;
            }else{
                a1 = 3;
            }
        }


        {
            //All the types declared on a single line must be the same type and share the same declaration.
//            int a, var b = 3; // DOES NOT COMPILE
            int a, v = 3;
//            The compiler is being asked to infer the type of null. This could be any reference type.
//            The designers of Java decided it would be better not to allow var for null than to have to guess at intent.
//            var n = (String)null; // DOES NOT COMPILE

//            var a = 2, b = 3; // DOES NOT COMPILE - Java does not allow var in multiple variable declarations.
            var a2 = 2;
            var b = 3;


//            While a var cannot be initialized with a null value without a type
            var n = "string";
            n = null;
            var m = 4;
            //not compile since the
            //type of m is a primitive int, which cannot be assigned a null value
//            m = null;
//            we can wrote
            var o = (String)null;
        }

    }

    /**
     *  These are not local variables.
     *  Be on the lookout for var used with constructors, method parameters, or instance variables.
     *  Remember that var is only used for local variable type inference!
     */

//    private static int add(var i1, var i2){
//        return i1 + i2;
//    }

}
