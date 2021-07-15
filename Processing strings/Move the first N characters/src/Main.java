import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = sc.nextInt();

        if (n > 0 & n <= input.length()) {
            System.out.println(input.substring(n).concat(input.substring(0, n)));
        } else {
            System.out.println(input);
        }
    }
}
