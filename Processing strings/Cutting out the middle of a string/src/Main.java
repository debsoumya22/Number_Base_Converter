import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String subStr1;
        String subStr2;
        if (str.length() % 2 != 0) {
            subStr1 = str.substring(0, str.length() / 2);
            subStr2 = str.substring(str.length() / 2 + 1);
            System.out.println(subStr1 + subStr2);
        } else {
            subStr1 = str.substring(0, str.length() / 2 - 1);
            subStr2 = str.substring(str.length() / 2 + 1);
            System.out.println(subStr1 + subStr2);
        }
    }
}
