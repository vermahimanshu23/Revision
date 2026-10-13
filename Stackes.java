// import java.util.Stack;

public class Stackes {
    private int top = -1;
    private int size = 5;
    private int arr[] = new int[size];

    public static void main(String args[]) {
        Stackes stack = new Stackes();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
    }
void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = data;
            System.out.println(data + " pushed to stack");
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top--];
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }
   
   void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    

   
}
