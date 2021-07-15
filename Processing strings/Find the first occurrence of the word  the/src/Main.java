import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner  = new Scanner(System.in);
        String input = scanner.nextLine();
        String lowerInput = input.toLowerCase();
        System.out.println(lowerInput.indexOf("the"));
    }
}