import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exc_1();
        exc_6();
        exc_8();
    }

    static void exc_1(){
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
    }
    static void exc_6(){
        System.out.print("task 6:\n" + "enter a 3-digit number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a1 = num / 100;
        int a2 = num / 10 % 10;
        int a3 = num % 10;
        if (a1 == a2 || a2 == a3 || a1 == a3)
            System.out.println("the number have at least two identical digits");
        else
            System.out.println("the number doesn't have two identical digits");
    }
    static void exc_8(){
        System.out.print("task 8:\n" + "enter the month number: ");
        Scanner scanner = new Scanner(System.in);
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
    }
}

