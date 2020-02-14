package array;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int count = 0;

        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        int b =str.length();

        System.out.println("enter the char: ");
        char c = scanner.next().charAt(0);

        for (int i=0;i<b;i++){
            if (str.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
