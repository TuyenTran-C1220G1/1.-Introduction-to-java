package myPackage;

import java.util.Scanner;

public class Tinh_Chi_So_Can_Nang_Cua_Co_The {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float weight;
        float height;
        float bmi;

        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextInt();

        System.out.print("Your height (in meter):");
        height = scanner.nextInt();

        bmi = (float) (weight / Math.pow(height, 2));

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
