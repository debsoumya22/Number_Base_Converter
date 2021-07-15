package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in decimal system: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Enter target base:");
        int targetBase = scanner.nextInt();


        if (targetBase == 2) {
            System.out.println("Conversion result: " + Integer.toBinaryString(inputNumber));
        } else if (targetBase == 16) {
            System.out.println("Conversion result: " + Integer.toHexString(inputNumber));
        } else if (targetBase == 8) {
            System.out.println("Conversion result: " + Integer.toOctalString(inputNumber));
        }







    }


}
