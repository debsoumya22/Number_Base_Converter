import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] parts = str.split("-");
        System.out.print(parts[1] + "/" + parts[2] + "/" + parts[0]);
    }
}
