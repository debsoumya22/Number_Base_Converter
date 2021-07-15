package converter;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //level one loop
        while (true) {
            System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");
            Scanner scan = new Scanner(System.in);
            String inputOne = scan.nextLine();

            if ("/exit".equals(inputOne)) {
                System.exit(0);
            } else {
                String[] inputString = inputOne.split(" ");
                int sourceBase = Integer.parseInt(inputString[0]);
                int targetBase = Integer.parseInt(inputString[1]);

                //level two loop
                while (true) {
                    System.out.println("Enter number in base " + sourceBase + " to convert to base " +
                        targetBase + "(To go back type /back)");
                    String inputTwo = scan.next();
                    if (inputTwo.contains("back")) {
                        break;
                    } else {
                        BigInteger decimalNumber = new BigInteger(inputTwo, sourceBase);
                        String convertedNumber = new BigInteger(String.valueOf(decimalNumber)).toString(targetBase);
                        System.out.println("Conversion result: " + convertedNumber + "\n");
                    }
                }
            }
        }
    }
 }