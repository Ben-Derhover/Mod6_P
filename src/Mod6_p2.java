import java.sql.SQLOutput;
import java.util.Scanner;

public class Mod6_p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input1 = 0; 
        double input2 = 0;
        double input3 = 0;
        String trash = "";
        boolean done = false;


        do {
            System.out.println("give me a number");
            if (scanner.hasNextDouble()) {
                input1 = scanner.nextDouble();
                scanner.nextLine();
                done = true;
                }
            else
            {
                trash = scanner.nextLine();
                //System.out.println("You entered trash");
                //scanner.nextLine();
            }

        } while (done == false);
        
        done = false;
        
        do {
            System.out.println("give me a number");
            if (scanner.hasNextDouble()) {
                input2 = scanner.nextDouble();
                scanner.nextLine();
                done = true;
            }
            else
            {
                trash = scanner.nextLine();
                //scanner.nextLine();
            }

        } while (done == false);
        
        done = false;

        do {
            System.out.println("give me a number");
            if (scanner.hasNextDouble()) {
                input3 = scanner.nextDouble();
                scanner.nextLine();
                done = true;
            }
            else
            {
                trash = scanner.nextLine();
                //1scanner.nextLine();
            }

        } while (done == false);
        
        done = false;
        
        if (input1 == input2 && input1 == input3 && input3 == input2){

            System.out.println("all numbers are the same");
            
        } else if (input1 == input2 || input1 == input3 || input2 == input3) {

            System.out.println("nether");
            
        }
        else{
            System.out.println("all numbers are the same");
        }

    }
}
