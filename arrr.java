import java.util.*;
import java.util.Scanner;
public class arrr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];

        for(int i=0;i<arr.length;i++)
        {
            System.out.print("enter the number ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]>max){
           max=arr[i+1];
           }
        }

           System.out.println("greater number is " +    max);


           int min=arr[0];
           for(int i=1;i<arr.length;i++)
           {
               if(arr[i]<min)
               {
                   min=arr[i];
               }
           }

           System.out.println("smaller number is " +    min);
    }
}

   
