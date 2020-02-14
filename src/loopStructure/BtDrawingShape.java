package loopStructure;

import java.util.Scanner;

public class BtDrawingShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the square");
            System.out.println("2. Draw the triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Enter weight");
                    double weight = scanner.nextDouble();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < weight; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("triangle botton-left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("triangle top-left ");
                    for (int i=5;i>0;i--){
                        for (int j=0;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Enter height: ");
                    int h = scanner.nextInt();
                    for (int i=0;i<h;i++){
                        for (int j=0;j<h-i;j++){
                            System.out.print(" ");
                        }
                        for (int k=0;k<2*i-1;k++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}