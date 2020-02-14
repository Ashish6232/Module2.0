package array;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("size does not exceed");
            }
        } while (size > 30);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("enter mark a student: " + " ");
            arr[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("List mark of students: " + " ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "," + " ");
            if (arr[j] >= 5 && arr[j] <= 10) {
                count++;
            }
        }
        System.out.println("\n" + "the number of student pass is: " + count);
    }
}

