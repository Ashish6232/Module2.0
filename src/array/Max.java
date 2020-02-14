package array;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int size;
        int[]array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("enter size: ");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("size does not exceed");
            }
        } while (size>20);

        array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("element "+i+" ");
            array[i]= scanner.nextInt();
            i++;
        }

        System.out.print("Element in array: ");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }

        int max = array[0];
        int index = 0;
        for (int j=1;j<array.length;j++){
            if (array[j]>max){
                max = array[j];
                index = j;
            }
        }
        System.out.println("max is "+ max +" at position "+ index);
    }
}
