import java.util.Scanner;

public class AlphabetNumber {
    // enter any value and find out it is number or alphabet or symbol
    // Java main method

    public static void main(String[]args){
        System.out.println("Enter any alphabet,number or symbol");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.matches("[a-zA-z]"))
        {
            System.out.println("This is Alphabet");
        }
        else if (input.matches("[0-9]"))
        {
            System.out.println("This is number");
        }
        else
        {
            System.out.println("This is Symbol");
        }

    }
}
