package loopStructure;

import java.util.Scanner;

public class BtPrime {
    static boolean check(int n){
        if (n<2){
            return false;
        }else {
            for (int i=2;i<n;i++){
                if (n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    static void display(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number prime need to display: ");
        int num = scanner.nextInt();
        int count = 0;
        int i=2;
        while (count<num){
            if (check(i)){
                count++;
                System.out.println(" "+i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        display();
    }
}
