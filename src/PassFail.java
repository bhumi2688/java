import java.util.Scanner;

public class PassFail {
    // pass or fail on basis of student needs to pass
    // Java main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("physics");
        int physics = scanner.nextInt();
        System.out.println("history");
        int history = scanner.nextInt();
        System.out.println("biology");
        int biology = scanner.nextInt();

        if (35 <= physics && 35 <= history && 35 <= biology) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");


        }
    }
}
