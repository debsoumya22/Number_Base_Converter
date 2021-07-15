import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String[] strArr = new Scanner(System.in).nextLine().split("");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        
        System.out.print(arr[0] + arr[1] + arr[2] == arr[3] + arr[4] + arr[5] ? "Lucky" : "Regular");
    }
}
