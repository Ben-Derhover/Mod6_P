import java.util.Scanner;

public class Mod6_P5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = 0;
        int input2 = 0;
        int input3 = 0;
        String trash = "";
        boolean done = false;


        do {
            System.out.println("give me a number");
            if (scanner.hasNextInt()) {
                input1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("give me another number");
                if (scanner.hasNextInt()) {
                    input2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("give me another number");
                    if (scanner.hasNextInt()) {
                        input3 = scanner.nextInt();
                        scanner.nextLine();
                        done = true;
                    }
                    else {
                        trash = scanner.nextLine();
                    }
                }
                else {
                    trash = scanner.nextLine();
                }
            }
            else {
                trash = scanner.nextLine();
            }
        }
        while(done==false);
     if (input1 > input2 && input1 > input3){
         System.out.println("1st input is largest");
     }
     else if (input2 > input1 && input2 > input3) {
         System.out.println("2nd input is largest");
     }
     else{
         System.out.println("the biggest number is the third");
     }
    }
}
