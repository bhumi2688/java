import java.util.Scanner;

public class SalesCommission {
    // input sales id ,sellers name,sales amount,salary basic and find sales commission
    //Java main method

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double salesamount,salarybasic,commission;
        double commissionrate=0.0;

        System.out.println("Enter the sales id:"); // sales id: 452
        int id=scanner.nextInt();

        System.out.println("Enter sellers name:"); // seller name Elina
        String name=scanner.next();

        System.out.println("Enter sales amount: "); //sales amount 70,000
        salesamount= scanner.nextDouble();

        System.out.println("Enter salary basic:");// basic salary 30,000
        salarybasic= scanner.nextDouble();

        if (salesamount >= 50000)commissionrate=0.35;
        else if (salesamount >=30000) commissionrate=0.20;
        else if (salesamount >=20000) commissionrate=0.10;
        else if (salesamount >=10000) commissionrate=0.05;
        else commissionrate=0.02;

        commission=commissionrate*salesamount;

        System.out.println("Commission is : "+ commission);




        }


    }

