import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RightTriangle triangle = new RightTriangle(0, 0, 0, 3, 4, 0);

        if (triangle.isRightTriangle()) {
            System.out.println("this is right triangle");
        } else {
            System.out.println("this is not right triangle");
        }

        PointDistance points = new PointDistance(0,0,2,2);
        System.out.println(points.DistanceLength());

        RectangleArea rectangle = new RectangleArea(3,4);
        System.out.println(rectangle.area());

        Point point = new Point(2,3);
        point.cordinates();

        Points2 point2 = new Points2();
        point2.message();

        ParallelepipedVolume paralelo= new ParallelepipedVolume(3,4, 5);
        System.out.println(paralelo.volume());

        Market bread = new Market(2,5,7);
        System.out.println(bread.profit());
        bread.left_quantity();
        System.out.println(bread.profit());

    }
    static class RightTriangle{
        public double x1,x2,x3,y1,y2,y3;

        public RightTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        }

        public boolean isRightTriangle() {
            double sideAB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double sideBC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double sideAC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));


            return (Math.pow(sideAB, 2) + Math.pow(sideBC, 2) == Math.pow(sideAC, 2) ||
                    Math.pow(sideAB, 2) + Math.pow(sideAC, 2) == Math.pow(sideBC, 2) ||
                    Math.pow(sideAC, 2) + Math.pow(sideBC, 2) == Math.pow(sideAB, 2));
        }


    }
    static class PointDistance{
        public double x1,x2,y1,y2;

        public PointDistance(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public double DistanceLength() {
            double distance;
            distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            return distance;
        }

    }

    static class RectangleArea{
        public double a,b;
        public RectangleArea(double a, double b) {
            this.a = a;
            this.b = b;
        }
        public double area() {
            double area;
            area = a * b;
            return area;
        }

    }

    static class Point{
        double x,y;
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public void cordinates(){
            System.out.println("cordinates of point ->  " + x + " | " + y);
        }
    }

    static class Points2{
        public void message() {
            System.out.println("use PointDistance");
        }
    }

    static class ParallelepipedVolume{
        public double a,b,h;
        public ParallelepipedVolume(double a, double b, double h) {
            this.a = a;
            this.b = b;
            this.h = h;
        }
        public double volume() {
            double volume;
            volume = a * b * h;
            return volume;
        }
    }

    static class Market{
        public double base_price, price;
        public int quantity;
        public Market(double base_price, double price, int quantity){
            this.base_price = base_price;
            this.price = price;
            this.quantity = quantity;
        }
        public int sold_quantity = 0;

        public int sold(){
            sold_quantity += 1;
            return sold_quantity;
        }

        public int left_quantity(){
            quantity -= 1;
            sold();
            if (quantity == 0){
                base_price = 0;
                price = 0;
            }
            return quantity;
        }

        public double profit(){
            double profit_tot;
            profit_tot = sold_quantity * (price - base_price);
            return profit_tot;
        }
    }
}
