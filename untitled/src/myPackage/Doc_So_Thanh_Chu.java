package myPackage;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Doc_So_Thanh_Chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, which to read: ");
        int number = scanner.nextInt();
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (number >= 10 && number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String readToTens = "";
            String readToOnes = "";
            switch (tens) {
                case 2:
                    readToTens = "Twenty";
                    break;
                case 3:
                    readToTens = "Thirty";
                    break;
                case 4:
                    readToTens = "Forty";
                    break;
                case 5:
                    readToTens = "Fifty";
                    break;
                case 6:
                    readToTens = "Sixty";
                    break;
                case 7:
                    readToTens = "Seventy";
                    break;
                case 8:
                    readToTens = "Eighty";
                    break;
                case 9:
                    readToTens = "Ninety";
                    break;
            }
            switch (ones) {
                case 1:
                    readToOnes = "One";
                    break;
                case 2:
                    readToOnes = "Two";
                    break;
                case 3:
                    readToOnes = "Three";
                    break;
                case 4:
                    readToOnes = "Four";
                    break;
                case 5:
                    readToOnes = "Five";
                    break;
                case 6:
                    readToOnes = "Six";
                    break;
                case 7:
                    readToOnes = "Seven";
                    break;
                case 8:
                    readToOnes = "Eight";
                    break;
                case 9:
                    readToOnes = "Nine";
                    break;
            }
            System.out.println(readToTens + " " + readToOnes);
        } else {
            System.out.println("out of ability");
        }

    }
}
