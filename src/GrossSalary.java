import java.util.Scanner;

public class GrossSalary {
    // input employeeid,name,basic salary then find HRA,DA,TA,PF
    // Java main method

    public static void main(String[]args){

        double basicsalary,HRA,DA,TA,PF,Grosssalary;
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter Employee id:"); // employee id:24
        int id = scanner.nextInt();

        System.out.println("Enter the name of Employee:"); // employee name: shanvi
        String name = scanner.next();

        System.out.println("Enter basicsalary:"); // basic salary 40,000
        basicsalary = scanner.nextDouble();

        HRA = (basicsalary*10)/100;
        DA = (basicsalary*8)/100;
        TA = (basicsalary*9)/100;
        PF = (basicsalary*20)/100;


        Grosssalary = basicsalary + HRA + DA + TA - PF;

        System.out.println("House Rent Allowance: " + HRA);
        System.out.println("Dearness Allowance: " + DA);
        System.out.println("Travelling Allowance: " + TA);
        System.out.println("Provident Fund: " + PF);
        System.out.println("Grosssalary:" + Grosssalary);











    }
}
