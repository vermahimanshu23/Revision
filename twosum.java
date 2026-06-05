import java.util.HashMap;

public class twosum {
    public static void main(String[] args){
       
//     int arr[]= {2,1,5,3};
//     int target =4;
//         HashMap<Integer,Integer> map= new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             int com=target-arr[i];
               

//             if(map.containsKey(com)){
                
//                 System.out.println("Two numbers are: "+arr[i]+" and "+com);
//                 return;
//             }
//             map.put(arr[i],i);
//         }
    
// }
// String s = "followthecode";
// HashMap<Character,Integer> map= new HashMap<>();
// for(int i=0;i<s.length();i++){
//     char c=s.charAt(i);

//     if(map.containsKey(c)){
//         map.put(c,map.get(c)+1);
    
//     if(map.get(c)==2){
//         System.out.println("First repeating character is: "+ c);
//         return;
//     }
// }
//     else{
//         map.put(c,1);
//     }


// }
// System.out.println("No repeating character found.");
//     }
// }




  String s = "foLLowthecode";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                if (map.get(c) == 2) {
                    System.out.println("First repeating character: " + c);
                    return;
                }

            } else {
                map.put(c, 1);
            }
        
    }
    System.out.println("No repeating character found.");
}
}
