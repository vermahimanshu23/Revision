
import java.util.HashMap;
import java.util.Map;
public class javahash {
    public static void main(String[] args){
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"suresh");
        map.put(2,"shiva");
        map.put(3,"kumar");
        map.put(4,"raju");
        System.out.print(map);
        map.remove(2);
        System.out.println("\nAfter removing an element:"); 
        System.out.print(map);
        for(Map.Entry<Integer,String> e:map.entrySet()){
            System.out.println("\nKey: "+e.getKey()+" Value: "+e.getValue());
        } 
       

    }
    
}
