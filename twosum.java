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




//   String s = "foLLowthecode";

//         HashMap<Character, Integer> map = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {

//             char c = s.charAt(i);

//             if (map.containsKey(c)) {
//                 map.put(c, map.get(c) + 1);
//                 if (map.get(c) == 2) {
//                     System.out.println("First repeating character: " + c);               
//                     return;
//                 }

//             } else {
//                 map.put(c, 1);
//             }
        
//     }
//     System.out.println("No repeating character found.");
int arr[]={4,5,1,2,1,2,1};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        int number=0;
        int secondmax=0;
        for(int key:map.keySet()){
            if(map.get(key)>max){
                secondmax=max;
                max=map.get(key);
                number=key;
            }
            else if(map.get(key)>secondmax && map.get(key)!=max){
                secondmax=map.get(key);
            }
        }
        
        System.out.println("Maximum frequency is: "+max+" for number: " + number);
        System.out.println("Second maximum frequency is: "+secondmax+" for number: " + number);
         
        for(int num:arr){
            if(map.get(num)==1){
                System.out.println("First non-repeating number is: "+num);
                break;
            }
        }
}
}
