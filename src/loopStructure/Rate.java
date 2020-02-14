package loopStructure;

import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
    double money = scanner.nextDouble();

    System.out.println("Enter month: ");
        int month = scanner.nextInt();

        System.out.println("Enter rate: ");
        double rate = scanner.nextDouble();

        double interset=0;
        for (int i=1; i<month;i++){
            interset = money*(rate/100)/12*month;
        }
        System.out.println("Interset: "+ interset);
    }
}
