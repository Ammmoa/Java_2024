import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exc_1();
        exc_3();
        exc_5();
        exc_6();
        exc_8();
        exc_11();
        exc_13();
    }

    static void exc_1(){
        int sum = 0;
        int product = 1;
        double average;

        for (int i = 1; i <= 15; i++) {
            sum += i;
            product *= i;
        }
        average = (float) sum / 15;
        System.out.println("-----exc: 1");
        System.out.println("sum: " + sum);
        System.out.println("product: " + product);
        System.out.println("avg: " + average);
    }
    static void exc_3(){
        float sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += (float) 1 / i;
        }
        System.out.println("-----exc: 3");
        System.out.println("sum: " + sum);
    }
    static void exc_5(){
        System.out.println("-----exc: 5");
        for (int i = 100; i <= 999; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int unit = i % 10;
            if (i % (hundreds + tens + unit) == 0){
                System.out.println("number:" + i);
            }
        }
    }
    static void exc_6(){
        System.out.println("-----exc: 6");
        String out_str = "";
        for (int i = 10; i >= 0; i--) {
            int j = i;
            while (j > 0){
                out_str += "*";
                j--;
            }
            System.out.println(out_str);
            out_str = "";
        }
    }
    static void exc_8(){
        System.out.println("-----exc: 8");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many fibonacci num you want: ");
        int number = scanner.nextInt();
        int i = 1;
        int j = 1;
        System.out.println(i);
        System.out.println(j);
        for (int u = 3; u <= number; u++){
            int c = i + j;
            i = j;
            j = c;
            System.out.println(c);
        }
    }
    static void exc_11(){
        System.out.println("-----exc: 11");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter max num: ");
        int number = scanner.nextInt();

        int product = 1;
        for (int u = 1; u <= number; u++){
            product *= u;
        }
        double g_avg = Math.pow(product, 1.0 / number);
        System.out.println("g_avg:" + g_avg);

    }
    static void exc_13(){
        System.out.println("-----exc: 13");
        double h = 1.5;

        System.out.println("x\t|\ty");
        System.out.println("------------");

        for (double x = 1; x <= 10; x += h) {
            double y = Math.pow(x, 2) + 2 * x + 1;
            System.out.printf("%.1f\t|\t%.1f%n", x, y);

            if (y > 50) {
                System.out.println("more than 50");
                break;
            }
        }
    }
}
