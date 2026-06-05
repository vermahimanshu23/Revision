
public class arr2d
{
public static void  main(String [] args){
    int [][]arr= {
        {1,2,3},
        {3,4,5},
        {5,6,7}
    };
    int sum=0;
    for(int i=0; i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++)
        {  
            sum +=arr[i][j]; 
        }
        
       
    }
      System.out.println(sum);
   
}
}
// public class arr2d{
//     public static void main(String args[]){
//         int arr[][]={
//             {5,6,3,7},
//             {8,5,6,7},
//             {5,7,9,5}
//         };
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++)
//             {
//                 System.out.print(arr[i][j]+ " ");
//             }
// System.out.println("");
//         }
//     }
// }