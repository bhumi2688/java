import java.util.Scanner;

public class Turnery {

    //using turney operator find out even or odd number
    //Java main method

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();


        System.out.println( "Enter a Number: ");
        String evenodd = (a % 5 ==0) ? "even " : "odd";
        System.out.println(a + "is" + evenodd);




    }
}
