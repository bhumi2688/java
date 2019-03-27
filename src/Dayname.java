import java.util.Scanner;

public class Dayname {
    // input any number and print day of week
    //Java main method
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int daynumber= scanner.nextInt();
        if (daynumber == 1)
            System.out.println("Monday");
        else if (daynumber == 2)
            System.out.println("Tuesday");
        else if (daynumber == 3)
            System.out.println ("Wednesday");
        else if (daynumber == 4)
            System.out.println("Thursday");
        else if (daynumber == 5)
            System.out.println ("Friday");
        else if (daynumber ==6)
            System.out.println("Saturday");
        else if (daynumber == 7)
            System.out.println("Sunday");




    }
}
