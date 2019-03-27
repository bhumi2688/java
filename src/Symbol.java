import java.util.Scanner;

public class Symbol {
    //Enter any value and find out if it Alphabet,number or Symbol
    // Java main method
    public static void main(String[]args){
        int a,b,Ans;
        char ch;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number 1:");
        a = scanner.nextInt();

        System.out.println("Enter number 2:");
        b = scanner.nextInt();

        System.out.println("Enter symbol +,-,*,/");
        ch = scanner.next().charAt(0);

        if (ch == '+')
        {
            Ans = a + b;
            System.out.println("Answer is = " +Ans);
        }
        else if (ch == '-')
        {
            Ans = a - b;
            System.out.println("Answer is = " +Ans);
        }
        else if (ch == '*')
        {
            Ans = a * b;
            System.out.println("Answer is =" +Ans);
        }
        else if (ch == '/')
        {
            Ans = a / b;
            System.out.println("Answer is =" +Ans);
        }
        else
        {
            System.out.println("Entered Wrong Symbol");
        }

















    }


}
