import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exc_1();
        exc_2();
        exc_3();
        exc_4();
        exc_5();
        exc_6();
        exc_7();
    }

    static void exc_7(){
        System.out.print("task 7:\n" + "enter a 3-digit number: ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        String reversedValue = new StringBuilder(value).reverse().toString();
        System.out.println(reversedValue);

    }
    static void exc_1(){
        double a = 2;
        double b = 3;
        double c = 4;
        double s = (a + b + c) / 2;
        double S;
        S = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("task 1: " + S);
    }
    static void exc_2(){
        double a = 2.5;
        System.out.println("task 2:\n" + "P = " + 4*a + "\nS = " + a*a);
    }
    static void exc_3(){
        double A = 2.8;
        double x = 1.5;
        double B = 1;
        double y = Math.sqrt(Math.log10(A + B) + x) / Math.exp(x) + 1;
        System.out.println("task 3: " + Math.abs(x*x - y*y));
    }
    static void exc_4(){
        double A = 10;
        double x = 1.5;
        double y = Math.sqrt((Math.exp(x) + 1)/(Math.exp(x) + 2) + Math.sin(x));
        System.out.println("task 4: " + A*y*Math.sin(y));
    }
    static void exc_5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("task 5:\n" + "enter a 3-digit number: ");
        int num = scanner.nextInt();
        if (num < 100 || num > 999){
            while(num < 100 || num > 999){
                System.out.print("enter a 3-digit number: " );
                num = scanner.nextInt();
            }
            System.out.println("result = " + (num%10 + num%100/10 + num/100));
        }
        else{
            System.out.println("result = " + (num%10 + num%100/10 + num/100));
        }
    }
    static void exc_6(){
        System.out.print("task 6:\n" + "enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("result = " + num%10);
    }
}