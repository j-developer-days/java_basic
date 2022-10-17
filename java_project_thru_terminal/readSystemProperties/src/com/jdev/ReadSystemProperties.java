package com.jdev;

public class ReadSystemProperties {

    public static void main(String[] args) {
        System.out.println("Property key \t\t value");
        if (args.length == 0) {
            System.getProperties().forEach((key, value) -> System.out.println(key + "\t\t" + value));
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i] + "\t\t" + System.getProperties().getProperty(args[i]));
            }
        }
    }

}
