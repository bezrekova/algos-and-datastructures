package hortsman_exersices;

/**
 * Created by 1 on 29.11.2016.
 */
public class Test {
    public static void main(String[] args) {
        /**
         String fizz = "Fizz";//%3
         String buzz = "Buzz";//%5
         String sum = "FizzBuzz";//%15
         */
        for (int i = 1; i < 101; i++) {

            String n = "" + i, f = "Fizz", b = "Buzz";
            //n = Integer.toString(i);

            if (i % 3 != 0) {
                f = "";//not true
            } else n = "";
            if (i % 5 != 0) {
                b = "";//not true
            } else {
                n = "";
            }
            System.out.println(n + f + b);
        }
    }
}
