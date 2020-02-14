package oop;

import java.util.Scanner;

public class Ractangle {
    double width,height;

    public Ractangle(){
    }

    public Ractangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double setWidth(double newWidth){
        return this.width=newWidth;
    }

    public double setHeight(double newHeight){
        return this.height=newHeight;
    }

    public double getPerimeter(){
        return (this.width+this.height)*2;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public String display(){
        return ("Ractangle has width "+this.width+" height "+ this.height);
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter width: "+" ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: "+" ");
        double height = scanner.nextDouble();

        Ractangle ractangle = new Ractangle(width,height);
        System.out.println(ractangle.display());

        System.out.println("Area of ractangle: "+ ractangle.getArea());

        System.out.print("Perimeter of ractangle: "+ ractangle.getPerimeter());
    }
}

