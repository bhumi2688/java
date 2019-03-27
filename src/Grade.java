import java.util.Scanner;

public class Grade {
    //Input student name,roll number, 3 subject marks and find total ,percentage ,pass fail,grade
    //
    public static void main(String[] args) {
        int physice, history, biology;
        float total, percentage;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:"); // student name Maria
        String name = scanner.next();
        System.out.println("Enter Student roll number:"); // roll no 23
        int x = scanner.nextInt();
        System.out.println("Enter marks of Physics:");
        int Physics = scanner.nextInt();
        System.out.println("Enter marks of History:");
        int History = scanner.nextInt();
        System.out.println("Enter marks of Biology:");
        int Biology = scanner.nextInt();
        System.out.println("Enter marks of 3" + Physics + " and " + History + " and " + Biology + " =" + (Physics + History + Biology));

        total = Physics + History + Biology;
        percentage = (total / 300) * 100;

        System.out.println("total marks =" + total);
        System.out.println("percentage =" + percentage);

        // if student is pass or fail


        if (percentage >= 35) {
            System.out.println("Pass!");
        } else {
            System.out.println("Fail!");
        }
        // Grade of students
        char grade;
        if (percentage >=80 ) {
            System.out.println("A+ grade");
        }
        else if (percentage >= 60)
        {
            System.out.println("A grade ");
        }
        else if (percentage >= 50)
        {
            System.out.println("B grage");
        }
        else if (percentage >=35)
        {
            System.out.println("C grade");
        }
            else
        {
            System.out.println("Fail");
        }









    }
}








