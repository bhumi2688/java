import java.util.Scanner;

public class Leapyear {

    // find out weather the year is leap year or not
    //Leap year a= 2018
    //Java main method

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number :" );
        int a = scanner.nextInt();
        // year divisible by 400 then is a leap year
        if (a % 400 ==0)
        System.out.println("Entered year is a leap year");
        else
            System.out.println("Entered number is not a leap year");









    }
}
