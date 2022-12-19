package com.jdev.demo;

public class JavaIdentifyingIdentifiers {

    private static final String OK_CONST = "OK";
    static final String OK_CONST_1 = "OK";

    private static int agePerson;

    private static void methodCamelCase(){}

    private class ThisIsClass{}

    private enum ThisIsEnum{
        ENUM_1, ENUM_TYPE_2;
    }

    private interface ThisIsInterface{}

    /**
     * An identifier is the name of a variable,
     * method, class, interface, or package.
     *
     *
     * There are only four rules to remember for legal identifiers:
     *
     * Identifiers must begin with a letter, a $ symbol, or a _ symbol.
     *
     * Identifiers can include numbers but not start with them.
     *
     * Since Java 9, a single underscore _ is not allowed as an identifier.
     *
     * You cannot use the same name as a Java reserved word. A
     * reserved word is special word that Java has held aside so that you
     * are not allowed to use it. Remember that Java is case sensitive, so
     * you can use versions of the keywords that only differ in case.
     * Please don’t, though.
     * */
    public static void main(String[] args) {
        int i1;
        int $1;
//        int _;//Since Java 9, a single underscore _ is not allowed as an identifier.
        int _i3;
//        String 9line;//Identifiers can include numbers but not start with them
//        int package;
//        int class;
        int Package;
        int clasS;
        int Int;
        long okidentifier;
        float $OK2IDENTIFIER;
        Boolean _alsoOk1n3;

//        byte hollywood@line;
//        String *$coffee;

        //camel case
        int thisIsCamelCaseVariable;

        //snake case
    }

}
