package array;

import java.util.Scanner;

public class SumColunm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int[][] arr = {
                {1, 8, 3},
                {4, 5, 9},
                {7, 5, 3}
        };

        do {
            System.out.println("Menu");
            System.out.println("1. Sum column 0");
            System.out.println("2. Sum column 1");
            System.out.println("3. Sum column 2");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            int sum = 0;
            switch (choice) {
                case 1:
                    for (int i = 0; i < choice; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            sum = sum + arr[j][i];
                        }
                    }
                    System.out.println(sum);
                    break;

                case 2:
                    for (int i = 1; i < choice; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            sum = sum + arr[j][i];
                        }
                    }
                    System.out.println(sum);
                    break;

                case 3:
                    for (int i = 2; i < choice; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            sum = sum + arr[j][i];
                        }
                    }
                    System.out.println(sum);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        } while (choice != 0);
    }
}
