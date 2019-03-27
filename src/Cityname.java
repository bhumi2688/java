import java.util.Scanner;

public class Cityname {
    //input alphabet a to f and print there city name accordingly
    //Java main method

    public static void main(String[] args){
     String a,b,c,d,e,f,A,B,C,D,E,F;
      char  ch;
      Scanner scaneer =new Scanner(System.in);
      System.out.println("Enter any alphabet from A to F:");
      ch = scaneer.next().charAt(0);

      if (ch =='A' || ch == 'a')
      {
          System.out.println("Ahemdavad");
      }
      else if (ch =='B' || ch == 'b')
      {
          System.out.println("Baroda");
      }
      else if (ch =='C' || ch == 'c')
        {
            System.out.println("Changa");
        }
      else if (ch =='D' || ch == 'd')
        {
            System.out.println("Dehradun");
        }
      else if (ch =='E' || ch== 'e')
        {
            System.out.println("Etawah");
        }
      else if (ch =='F' || ch =='f')
      {
          System.out.println("Faizalpur");
      }
      else
      {
          System.out.println("Invalid character");
      }








    }
}
