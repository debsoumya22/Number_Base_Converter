package converter;
import java.math.BigDecimal;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean exit = false;

        while (!exit) {

            System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            String source = scanner.next();

            if ("/exit".equals(source)) {
                break;
            }
            
            String target = "";

            if (scanner.hasNext()) {
                target = scanner.next();
            }

            int sourceRadix = Integer.parseInt(source);
            int targetRadix = Integer.parseInt(target);
            
            while (!exit) {
                System.out.println("Enter number in base " + source + " to convert to base " + target + " (To go back type /back) ");
                String sourceNumber = scanner.next();

                if ("/back".equals(sourceNumber)) {
                    break;
                }

                if (!sourceNumber.contains(".")) {
                    String decimalNumber = new BigInteger(sourceNumber, Integer.parseInt(source)).toString();
                    System.out.print("Conversion result: ");
                    System.out.println(new BigInteger(decimalNumber).toString(Integer.parseInt(target)));
                } else {
                    String[] parts = sourceNumber.split("\\.");
                    String n = new BigInteger(parts[0], sourceRadix).toString();
                    double fractionalValue = 0;
                    int power = 1;

                    for (int i = 0; i < parts[1].length(); i++) {
                        String part = Character.toString(parts[1].charAt(i));
                        fractionalValue += Integer.parseInt(part, sourceRadix) / Math.pow(sourceRadix, power++);
                    }
                    System.out.print("Conversion result: " + new BigInteger(n).toString(Integer.parseInt(target)) + ".");
                    StringBuilder resultFractionalValue = new StringBuilder();

                    for (int i = 0; i < 5; i++) {
                        fractionalValue *= targetRadix;
                        int toAdd = (int) fractionalValue;
                        fractionalValue -= toAdd;
                        resultFractionalValue.append(Integer.toString(toAdd, targetRadix));
                    }

                    String fractionalResult = resultFractionalValue.toString();
                    System.out.println(fractionalResult);
                }
            }
        }
    }
}