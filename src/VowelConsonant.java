import java.util.Scanner;

public class VowelConsonant {
    // print vowel or consonant
    // Java main method

    public static void main(String[]args){
         int i =0;
         Scanner scaneer =new Scanner(System.in);

         System.out.println("Enter a character");
         char ch = scaneer.next().charAt(0);

         if (ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
             System.out.println("Entered character " +ch+" is Vowel");
         else
             System.out.println("Entered character" +ch+" is Consonant");








    }
}
