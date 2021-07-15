import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal startingMoney = new BigDecimal(scanner.next());
        BigDecimal interestRate = new BigDecimal(scanner.next());
        BigDecimal years = new BigDecimal(scanner.next());

        BigDecimal finalAmount = startingMoney
                .multiply(BigDecimal.ONE.add(interestRate.divide(BigDecimal.valueOf(100))).pow(years.intValue()));
        System.out.printf("Amount of money in the account: %s", finalAmount.setScale(2, RoundingMode.CEILING));
    }
}
