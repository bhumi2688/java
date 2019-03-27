import java.util.Scanner;

public class PositiveNegative {
    // input any number and find out if it is positive or negative
    //Java main method

    public static void main(String[]args){
        int x;
        Scanner scaneer = new Scanner(System.in);
        System.out.println("Enter the number:");
        x= scaneer.nextInt();
        if(x>4){
            System.out.println("The given number" +x+" is positive");

        }
        else if (x<4){
            System.out.println("The given number" +x+" is negative");

        }
        else {
            System.out.println("The given number is Zero");

        }




    }
}
