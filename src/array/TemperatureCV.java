package array;

import java.util.Scanner;

public class TemperatureCV {
    public static double feranitToCelsius(double feranit){
        double celsius = (9.0 / 5) * feranit + 32;
        return celsius;
    }

    public static double celsiusToFeranit(double celsius){
        double feranit = (9.0 / 5) * celsius + 32;
        return feranit;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double feranit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Feranit to Celsius");
            System.out.println("2. Celsius to Feranit");
            System.out.println("0. Exit");
            System.out.print("enter your choice: ");
            choice=scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter feranit: ");
                    feranit=scanner.nextDouble();
                    System.out.println(feranit+" Feranit = "+ feranitToCelsius(feranit)+" Celsius");
                    break;
                case 2:
                    System.out.print("Enter celsius: ");
                    celsius=scanner.nextDouble();
                    System.out.println(celsius+" Celsius= "+ celsiusToFeranit(celsius)+" Feranit");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        } while (choice!=0);

    }
}
