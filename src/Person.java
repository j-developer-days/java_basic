/**
 * THis is person class.
 * */
public class Person {

    // single line comment
    // this is person name field
    private String name;

    /**
     * multi
     * line
     * comment
     * */
    private int age;

    public void setName(String name){
        this.name = name;
    }

    /**
     * java doc comment
     * @author j.developer.days
     * */
/*
    public static void main(String [] args){
        System.out.println("Hello from person class");
        System.out.println("This is first param - " + args[0]);
        System.out.println("Second param - " + args[1]);
        System.out.println("param #3 is - " + args[2]);
    }
  */
    /*public static void main(String args []){
        System.out.println("Hello from person class");
        System.out.println("This is first param - " + args[0]);
        System.out.println("Second param - " + args[1]);
        System.out.println("param #3 is - " + args[2]);
    }*/

    public static void main(String ... options){
        System.out.println("Hello from person class");
        System.out.println("This is first param - " + options[0]);
        System.out.println("Second param - " + options[1]);
        System.out.println("param #3 is - " + options[2]);
    }

}
