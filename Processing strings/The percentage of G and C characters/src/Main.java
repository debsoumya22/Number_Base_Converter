import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int numberOfGC = 0;
        double result = 0d;

        for (int i = 0; i < input.length(); i++) {
            if (input.toLowerCase().charAt(i) == 'c'
                || input.toLowerCase().charAt(i) == 'g') {
                numberOfGC++;
            }
        }
        result = (double) numberOfGC / input.length() * 100;
        System.out.println(result);
    }
}
