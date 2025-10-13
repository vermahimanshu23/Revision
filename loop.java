// public class loop {
//     public static void main(String[] args) {
//         System.out.println("This is a loop example.");
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Iteration: " + i);
//         }
//     }
// }
// public class loop {
// public static void main(String [] args){
//     for(int i=5; i>0; i--){
//         System.out.println("");
//         for(int j=0; j<i; j++){
//             System.out.print("*");
//         }
//     }
// }}
import java.util.Scanner;
public class loop {
public static void main(String [] args){
    System.out.println("Enter ther number");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int i, j; 
    for (i = n; i >0; i--) {
            for (j = n - i; j > 1; j--) {
                System.out.print( " ");
            }

            // inner loop to print stars.
            for (j = 0; j <= i; j++) {
                System.out.print("*"+" ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
