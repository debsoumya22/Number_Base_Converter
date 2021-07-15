import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subStr = scanner.nextLine();
        Pattern pattern = Pattern.compile(subStr);
        Matcher matcher = pattern.matcher(str);
        int countCharacter = 0;
        while (matcher.find()) {
            countCharacter++;
        }
        System.out.println(countCharacter);
    }
}
