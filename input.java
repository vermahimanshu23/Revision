import java.util.Scanner;
public class input {
    public static void main (String[] args)
    {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("enter the number ");
        // int number = scanner.nextInt();
        // System.out.println("You entered: " + number);
        // scanner.close();
     for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
    