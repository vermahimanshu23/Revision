
import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter ther second number : ");
        int num2 = scanner.nextInt();
        System.out.println("enter an option");
        System.out.println("1. Add");
        System.out.println("2. Subtract");  
        System.out.println("3. Multiply");
        System.out.println("4. Divide");        
        int math = scanner.nextInt();
        switch (math) {
            case 1:
                int sum = num1 + num2;
                System.out.println("The sum is: " + sum);
                break;
            case 2:
                int difference = num1 - num2;
                System.out.println("The difference is: " + difference);
                break;
                case 3:
                int product = num1 * num2;      
                System.out.println("The product is: " + product);
                break;
            case 4:
                if (num2 != 0) {
                    double quotient = (double) num1 / num2;
                    System.out.println("The quotient is: " + quotient);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid option selected. Please choose 1, 2, 3, or 4.");
                break;
                

        }
        scanner.close();
    }

}
