package myPackage;

import java.util.Scanner;

public class Chuyen_Doi_Tien_Te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VND;
        double USD;
        int choose;

        System.out.println("1. Convert to USD");
        System.out.println("2. Convert to VND");
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Enter amount VND: ");
                VND = scanner.nextDouble();
                USD = 23000 * VND;
                System.out.println(USD);
        }
    }
}