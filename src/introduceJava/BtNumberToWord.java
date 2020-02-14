package introduceJava;

import java.util.Scanner;


public class BtNumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, thou, hun, tens, ones, elevens;
        System.out.println("Enter number: ");
        n = scanner.nextInt();

            if (n == 0) {
                switch (n) {
                    case 0:
                        System.out.println("Zero");
                        break;
                }
            }
            if ((n >= 100) && (n < 10000)) {

                thou = n / 1000;
                n=n%1000;
                hun = n / 100;
                n = n % 100;

                switch (thou) {
                    case 1:
                        System.out.print("One Thousand ");
                        break;
                    case 2:
                        System.out.print("Two Thousand ");
                        break;
                    case 3:
                        System.out.print("Three Thousand ");
                        break;
                    case 4:
                        System.out.print("Four Thousand ");
                        break;
                    case 5:
                        System.out.print("Five Thousand ");
                        break;
                    case 6:
                        System.out.print("Six Thousand ");
                        break;
                    case 7:
                        System.out.print("Seven Thousand ");
                        break;
                    case 8:
                        System.out.print("Eight Thousand ");
                        break;
                    case 9:
                        System.out.print("Night Thousand ");
                        break;
                }


                switch (hun) {
                    case 1:
                        System.out.print("One Hundred ");
                        break;
                    case 2:
                        System.out.print("Two Hundred ");
                        break;
                    case 3:
                        System.out.print("Three Hundred ");
                        break;
                    case 4:
                        System.out.print("Four Hundred ");
                        break;
                    case 5:
                        System.out.print("Five Hundred ");
                        break;
                    case 6:
                        System.out.print("Six Hundred ");
                        break;
                    case 7:
                        System.out.print("Seven Hundred ");
                        break;
                    case 8:
                        System.out.print("Eight Hundred ");
                        break;
                    case 9:
                        System.out.print("Nine Hundred ");
                        break;

                }
            }

            if ((n > 10) && (n < 20)) {
                elevens = n / 10;
                switch (elevens) {
                    case 1:
                        System.out.print("Eleven ");
                        break;
                    case 2:
                        System.out.print("Twelve ");
                        break;
                    case 3:
                        System.out.print("Thirteen ");
                        break;
                    case 4:
                        System.out.print("Fourteen ");
                        break;
                    case 5:
                        System.out.print("Fifteen ");
                        break;
                    case 6:
                        System.out.print("Sixteen ");
                        break;
                    case 7:
                        System.out.print("Seventeen ");
                        break;
                    case 8:
                        System.out.print("Eighteen ");
                        break;
                    case 9:
                        System.out.print("Nineteen ");
                        break;
                }
            }
            if (n > 3000) {
                System.out.print("INVALID INPUT");
            } else {
                tens = n / 10;
                n=n%10;
                ones = n;

                switch (tens) {

                    case 1:
                        System.out.print("Muoi ");
                        break;
                    case 2:
                        System.out.print("Hai muoi ");
                        break;
                    case 3:
                        System.out.print("Ba muoi ");
                        break;

                    case 4:
                        System.out.print("Bon muoi ");
                        break;
                    case 5:
                        System.out.print("Nam muoi ");
                        break;
                    case 6:
                        System.out.print("Sau muoi ");
                        break;
                    case 7:
                        System.out.print("Bay muoi ");
                        break;
                    case 8:
                        System.out.print("Tam muoi ");
                        break;
                    case 9:
                        System.out.print("Chin muoi ");
                        break;
                }
                switch (ones) {

                    case 1:
                        System.out.print("Mot ");
                        break;
                    case 2:
                        System.out.print("Hai ");
                        break;
                    case 3:
                        System.out.print("Ba ");
                        break;

                    case 4:
                        System.out.print("Bon ");
                        break;
                    case 5:
                        System.out.print("Nam ");
                        break;
                    case 6:
                        System.out.print("Sau ");
                        break;
                    case 7:
                        System.out.print("Bay ");
                        break;
                    case 8:
                        System.out.print("Bay ");
                        break;
                    case 9:
                        System.out.print("Chin ");
                        break;
                }
            }
        }
    }