package oop;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta(){
        double delta= Math.pow(b,2)-4*a*c;
        return delta;
    }

    public double getRoot1(){
        double r1 = ((-b)+Math.sqrt(getDelta()))/(2*a);
        return r1;
    }

    public double getRoot2(){
        double r2 = ((-b)-Math.sqrt(getDelta()))/(2*a);
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("enter a: "+" ");
        double a =scanner.nextDouble();
        while (a==0){
            System.out.print("enter a again"+" a: ");
            a=scanner.nextDouble();
        }

        System.out.print("enter b: "+" ");
        double b = scanner.nextDouble();

        System.out.print("enter c: "+" ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDelta()==0){
            System.out.println("Pt co nghiem kep: "+ ((-b)/(2*a)));
        } else if (quadraticEquation.getDelta()>0){
            System.out.println("Pt co 2 nghiem r1 = "+ quadraticEquation.getRoot1()+" and r2 = "+ quadraticEquation.getRoot2());
        }else {
            System.out.println("Pt vo nghiem");
        }
    }
}
