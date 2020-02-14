package oop;

import java.util.Scanner;

public class SimpleCircle {
    double radius;

    public SimpleCircle(){
    }

    public SimpleCircle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter radius: "+" ");
        double radius = scanner.nextDouble();

        SimpleCircle simpleCircle = new SimpleCircle(radius);

        System.out.println("Area of simplecircle: "+ simpleCircle.getArea());

        System.out.print("Perimeter of simplecircle: "+ simpleCircle.getPerimeter());

    }

}
