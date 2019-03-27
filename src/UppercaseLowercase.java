import java.util.Scanner;

public class UppercaseLowercase {
    // input any alphabet in uppercase and print in lowercase
    //Java main method

    public static void main(String[]args){
        char ch;
        int temp;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a Character in Uppercase:");
        ch= scanner.next().charAt(0);

        temp = (int) ch;
        temp = temp +32;
        ch = (char) temp;

        System.out.println("Equivalent character in Lowercase =" + ch);



    }
}
