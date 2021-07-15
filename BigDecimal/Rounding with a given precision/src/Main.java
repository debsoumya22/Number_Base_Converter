import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int inputInt = scanner.nextInt();
        BigDecimal firstBigDecimal = new BigDecimal(input);        
        System.out.println(firstBigDecimal.setScale(inputInt, RoundingMode.CEILING));
    }   
}
