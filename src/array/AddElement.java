package array;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 0,0,0,0};
        System.out.println("enter index: ");
        int index = scanner.nextInt();
        if (index <0 || index >= arr.length) {
            System.out.print("Do not add elemnt");
        }else {
            System.out.println("enter number: ");
            int number=scanner.nextInt();
            for (int i=arr.length-1;i>index;i--){
                arr[i]=arr[i-1];
            }
            arr[index]=number;
        }

        System.out.println("element in array: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}