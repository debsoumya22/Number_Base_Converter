import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String str = new Scanner(System.in).nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "" + str.charAt(i));
        }
    }
}
