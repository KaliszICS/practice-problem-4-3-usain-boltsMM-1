
import java.util.Scanner;

public class PracticeProblem {

    public static void main(String args[]) {

    }

    public static void q1() {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Input a positive integer: ");
            num = input.nextInt();
        } while (num < 0);

        System.out.println(num * 2);
    }

    public static void q2() {
        Scanner input = new Scanner(System.in);
        String password;
        String confirm;

        do {
            System.out.print("Input a password: ");
            password = input.nextLine();
            System.out.print("Confirm the password: ");
            confirm = input.nextLine();
        } while (!password.equals(confirm));

        System.out.println("success.");
    }

    public static void q3() {
        Scanner input = new Scanner(System.in);
        int first;
        int second;

        do {
            System.out.print("Input an integer: ");
            first = input.nextInt();
            System.out.print("Input an integer that is a multiple of the first integer: ");
            second = input.nextInt();
        } while (second % first != 0);

        System.out.println("success.");
    }
}