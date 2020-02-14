package introduceJava;

import java.util.Scanner;

public class BtConvertCurrency {
    public static void main(String[] args) {
        float a;
        float b;
        float usd;
        float vnd;
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter type: ");
        do {
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    a = 23000;
                    b = 1;
                    System.out.print("USD: ");
                    usd = scanner.nextFloat();
                    vnd = (usd * a) / b;
                    System.out.println(usd + " USD = " + vnd + " VND");
                    break;
                case 2:
                    a = 1;
                    b = 23000;
                    System.out.print("VND: ");
                    vnd = scanner.nextFloat();
                    usd = (vnd * a) / b;
                    System.out.println(vnd + " VND = " + usd + " USD");
                    break;
            }
        }while (number==1||number==2);
    }
}
