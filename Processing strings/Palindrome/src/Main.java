import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder buffer = new StringBuilder(str);
        if (str.equals(buffer.reverse().toString())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
