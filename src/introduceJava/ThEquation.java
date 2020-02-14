package introduceJava;

import java.util.Scanner;

public class ThEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        if (a != 0){
            double x = (b)/a;
            System.out.println("phuong trinh co nghiem la x= "+ x);
        } else {
            if (b==0){
                System.out.println("PT co vo so nghiem");
            }else {
                System.out.println("PT vo nghiem");
            }
        }
    }
}
