import java.util.Random;
import java.util.Base64;

public class ImportDemo {

    public static void main(String[] args) {
        Random random = new Random();
        Base64.getUrlEncoder();
        System.out.println("random number is - " + random.nextInt());
        System.out.println("date from util package, current date is - " + new java.util.Date());
        System.out.println("date from sql package, current date is - " + new java.sql.Date(new java.util.Date().getTime()));


    }

}
