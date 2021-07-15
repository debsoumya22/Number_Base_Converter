import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        String str = input[0];
    
        for (int i = 1; i < input.length; i++) {
            if (input[i].length() > str.length()) {
                str = input[i];
            }            
        }
        System.out.println(str);
    }
}
