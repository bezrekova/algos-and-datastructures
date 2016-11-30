package hortsman_exersices;

/**
 * Created by 1 on 29.11.2016.
 */
public class Test {
    public static void main(String[] args) {

        //1st approach
        String fizz = "Fizz";//%3
        String buzz = "Buzz";//%5
        String sum = "FizzBuzz";//%15

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(fizz);
            }
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(buzz);
            }
            if (i % 15 == 0) {
                System.out.println(sum);
            } else {
                System.out.println(i);
            }
        }
        //2d approach
        for (int i = 1; i < 101; i++) {

            String n = "" + i, f = "Fizz", b = "Buzz";
            //n = Integer.toString(i);

            if (i % 3 != 0) {
                f = "";
            } else n = "";
            if (i % 5 != 0) {
                b = "";
            } else {
                n = "";
            }
            System.out.println(n + f + b);
        }

    }
}
