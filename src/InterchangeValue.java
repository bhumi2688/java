import java.util.Scanner;

public class InterchangeValue {
    // input any two numbers and then print there interchanged value
    //Java main method

    public static void main(String[]args){
     int c,d;
     System.out.println("Enter c and d");
        Scanner scanner = new Scanner(System.in);

        c= scanner.nextInt();
        d= scanner.nextInt();

        System.out.println("Before Swapping\nc = "+c+"\nd ="+d);

        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("After Swapping\nc = "+c+"\nd ="+d);



    }
}
