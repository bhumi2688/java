import java.util.Scanner;

public class EligibleVote {
    // user should be eligible to vote
    //Java main method

    public static void main(String[]args){
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age:");
        age= scanner.nextInt();
        if (age>=18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");

    }












}










