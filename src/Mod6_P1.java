import java.util.Scanner;

public class Mod6_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String trash = "";
        double num1 = 0;
        boolean done = false;
        double num2 = 0;

        do {
            System.out.println("give me a number");
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
                scanner.nextLine();
                done = true;
            } else {
                trash = scanner.nextLine();
                scanner.nextLine();
            }

        } while (done == false);
        if (num1 > 0) {
            if (num1 < 10) {
                System.out.println("your number has 1 digits");
            } else if (num1 >= 10 && num1 < 100) {
                System.out.println("your number has 2 digits");
            } else if (num1 >= 100 && num1 < 1000) {
                System.out.println("your number has 3 digits");
            } else if (num1 >= 1000 && num1 < 10000) {
                System.out.println("your number has 4 digits");
            } else if (num1 >= 10000 && num1 < 100000) {
                System.out.println("your number has 5 digits");
            } else if (num1 >= 100000 && num1 < 1000000) {
                System.out.println("your number has 6 digits");
            } else {
                System.out.println("you number is greater then 7 digits");
            }
        } else {
            num2 = num1 * -1;
            if (num2 < 10) {
                System.out.println("your number has 1 digits");
            } else if (num2 >= 10 && num2 < 100) {
                System.out.println("your number has 2 digits");
            } else if (num2 >= 100 && num2 < 1000) {
                System.out.println("your number has 3 digits");
            } else if (num2 >= 1000 && num2 < 10000) {
                System.out.println("your number has 4 digits");
            } else if (num2 >= 10000 && num2 < 100000) {
                System.out.println("your number has 5 digits");
            } else if (num2 >= 100000 && num2 < 1000000) {
                System.out.println("your number has 6 digits");
            } else {
                System.out.println("you number is greater then 7 digits");
            }
        }
    }
}