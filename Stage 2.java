package converter;
import java.util.Scanner;

public class Main{
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            String convert = sc.nextLine();
            if (convert.equals("/exit")){
                break;
            }
            else if(convert.equals("/from")){
                from();
            }
            else if(convert.equals("/to")){
                to();
            }

        }

    }
    public static void from(){
        System.out.println("Enter a number in decimal system:");
        int decimalValue = sc.nextInt();
        System.out.println("Enter the target base:");
        int base = sc.nextInt();
        String result = "";
        if (base==2){
            result = Integer.toBinaryString(decimalValue);
        }
        else if(base == 8){
            result = Integer.toOctalString(decimalValue);
        }
        else{
            result = Integer.toHexString(decimalValue);
        }
        System.out.println("Conversion result: "+result);



    }
    public static void to(){
        System.out.println("Enter source number: ");
        var sourceNumber = sc.next();
        System.out.println("Enter source base: ");
        int sourceBase = sc.nextInt();
        System.out.println("Conversion to decimal result: "+Integer.parseInt(sourceNumber,sourceBase));
    }




    }