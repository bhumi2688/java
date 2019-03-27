import java.util.Scanner;

public class Average {
    //input 5 numbers and find average of 5 numbers
    //Java main method

    public static void main(String[]args) {

        int i,n=0,s=0;
        double avg;
        {

        System.out.println("Enter the 5 numbers : ");}
        for (i=0;i<5;i++) {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            s += n;
        }

            avg=s/5;
            System.out.println("The sum of 5 number is : " +s+"\nThe Average is : " +avg);









    }
}

