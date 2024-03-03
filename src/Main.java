import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Davaleba 2");
        System.out.println();

        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("task 1: ");
        double min;
        System.out.print("Enter first number: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = scanner.nextDouble();

        if (n1 <= n2 && n1 <= n3) {
            min = n1;
        }
        else if (n2 <= n1 && n2 <= n3) {
            min = n2;
        }
        else {
            min = n3;
        }

        System.out.println("min = " + min);

        //6
        System.out.print("task 6:\n" + "enter a 3-digit number: ");
        int num = scanner.nextInt();
        int a1 = num / 100;
        int a2 = num / 10 % 10;
        int a3 = num % 10;
        if (a1 == a2 || a2 == a3 || a1 == a3)
            System.out.println("the number have at least two identical digits");
        else
            System.out.println("the number doesn't have two identical digits");

        //8
        System.out.print("task 8:\n" + "enter the month number: ");
        int month = scanner.nextInt();

        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "fall";
                break;
            default:
                season = "invalid month";
        }

        System.out.println("season: " + season);

        System.out.println();
        System.out.println("Davaleba 1");
        System.out.println();
        davaleba1();
    }

    static void davaleba1(){
        //1
        double a = 2;
        double b = 3;
        double c = 4;
        double s = (a + b + c) / 2;
        double S;
        S = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("task 1: " + S);

        //2
        a = 2.5;
        System.out.println("task 2:\n" + "P = " + 4*a + "\nS = " + a*a);

        //3
        double A = 2.8;
        double x = 1.5;
        double B = 1;
        double y = Math.sqrt(Math.log10(A + B) + x) / Math.exp(x) + 1;
        System.out.println("task 3: " + Math.abs(x*x - y*y));

        //4
        A = 10;
        x = 1.5;
        y = Math.sqrt((Math.exp(x) + 1)/(Math.exp(x) + 2) + Math.sin(x));
        System.out.println("task 4: " + A*y*Math.sin(y));

        //5
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

        //6
        System.out.print("task 6:\n" + "enter a number: ");
        num = scanner.nextInt();
        System.out.println("result = " + num%10);

        //7
        System.out.print("task 7:\n" + "enter a 3-digit number: ");
        String value = scanner.next();
        String reversedValue = new StringBuilder(value).reverse().toString();
        System.out.println(reversedValue);

        scanner.close();
    }
}

