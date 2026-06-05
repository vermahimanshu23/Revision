import java.util.Scanner;
public class input {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
        scanner.close();
    }
    
}
