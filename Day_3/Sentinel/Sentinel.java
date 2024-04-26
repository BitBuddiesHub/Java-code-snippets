package Day_3.Sentinel;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        int value = 0;
        final int SENTINEL = -999;
        
        Scanner input = new Scanner(System.in);
        while (value != SENTINEL) {
            System.out.println("Enter a value (or -999 to stop):");
            value = input.nextInt();

            System.out.println("You entered: " + value);
        }

        input.close();
    }
}


/*
        while (true) {
            System.out.println("Enter a value (or -999 to stop): ");
            value = input.nextInt();

            if (value == SENTINEL) {
                break;
            }

            System.out.println("You entered: " + value);
        }
        
        input.close();
        System.out.println("Sentinel value entered. Exiting program.");
*/