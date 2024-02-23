import java.util.Scanner;

public class Mod6_P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthInput = 0;
        String trash = "";
        boolean done = false;


        do {
            System.out.println("give me a number");
            if (scanner.hasNextInt()) {
                monthInput = scanner.nextInt();
                scanner.nextLine();
                if(monthInput > 0 && monthInput < 13){
                    done = true;
                }
                else{
                    System.out.println("outside of range");
                }

            }
            else
            {

                trash = scanner.nextLine();
            }

        } while (done == false);

        done = false;
        switch (monthInput){
            case 9:
            case 4:
            case 6:
            case 11:
                System.out.println("theres 30 days in your month");
                break;
            case 2:
                System.out.println("your month has 29");
                break;
            default:
                System.out.println("your month has 31 days");
                break;

        }
    }
}
