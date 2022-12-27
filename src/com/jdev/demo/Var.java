package com.jdev.demo;

//While var is not a reserved word and allowed to be used as an identifier, it is considered a reserved type name.
// A reserved type name means it cannot be used to define a type, such as a class, interface, or enum.
public class Var {

    private int var = 0;

    public Var(int var){
        this.var = var;
    }

    public void var(){
        Var var = new Var(10);
    }

    public static void main(String[] args) {
        new Var(10);
    }

}

//rule 7
//A var is a reserved type name but not a reserved word, meaning it can be used as an identifier except as a class, interface, or enum
//name.

/*class var{

}*/

//enum var{}
//interface var{}
