package loopStructure;

import java.util.Scanner;

public class BtPrime2 {
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
            System.out.println("Smaller prime number: ");
            int num = scanner.nextInt();
            int count = 0;
            int i=1;
            while (i<num){
                if (check(i)){
                    count++;
                    System.out.println(" "+i);
                }
                i++;
            }
        }

        public static void main(String[] args)
        {
            display();
        }
    }
