import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String line = scanner.nextLine();
        String alphabet = "abcdefghijklmopqrstuvwxyz";
        System.out.println(alphabet.contains(line));

    }
    
}
