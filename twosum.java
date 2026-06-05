import java.util.HashMap;

public class twosum {
    public static void main(String[] args){
       
    int arr[]= {2,1,5,3};
    int target =4;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int com=target-arr[i];
               

            if(map.containsKey(com)){
                
                System.out.println("Two numbers are: "+arr[i]+" and "+com);
                return;
            }
            map.put(arr[i],i);
        }
    
}

    
}
