package array;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[]array={"a","b","c"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter word: ");
        String word = scanner.nextLine();

        boolean isExit = false;
        for (int i=0;i<array.length;i++) {
            if (word.equals(array[i])) {
                System.out.println("position of "+ word + " is "+i);
                isExit = true;
            }
        }

        if (!isExit){
            System.out.println("not found "+ word+ " in array");
        }
    }
}
