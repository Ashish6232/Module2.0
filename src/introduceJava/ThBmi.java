package introduceJava;

import java.util.Scanner;

public class ThBmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter weight: ");
        double weight = scanner.nextDouble();

        System.out.println("enter height: ");
        double height = scanner.nextDouble();

        double bmi = weight/Math.pow(height,2);
        System.out.println(bmi);

        if (bmi < 18){
            System.out.println("UnderWeight");
        } else if (bmi<25){
            System.out.println("Normal");
        } else if(bmi<30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
