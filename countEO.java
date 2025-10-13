public class countEO {
    public static void main(String args []){
        int arr[]={11,87,99,45,66};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out .println("Even numbers: "+even);
        System.out .println("Odd numbers: "+odd);
    }

        
    
}
