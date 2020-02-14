package array;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("element " + i + " ");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("element in array1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }

        int[] arr2 = new int[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("element " + i + " ");
            arr2[i] = scanner.nextInt();
        }

        System.out.println("element in array2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        int d = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[d] = arr1[i];
            d++;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[d] = arr2[i];
            d++;
        }

        System.out.println("element in array3: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + " ");
        }
    }
    }
