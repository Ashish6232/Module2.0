package array;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[]arr = {1,2,5,4,5,1,0,0};

        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        for (int i=0;i<arr.length;i++){
            if (arr[i]==number){
                for (int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
            }
        }

        System.out.print("Element in array after delete:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
