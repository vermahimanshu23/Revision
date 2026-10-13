import java.util.HashMap;
public class removeduplicate {
    public static void main(String args[]){
        int arr[]={1,2,3,2,4,5,1};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                System.out.print(arr[i]+" ");
                map.put(arr[i],1);
            }
        }
    }
    
}
