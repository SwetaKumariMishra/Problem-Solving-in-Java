import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopConcept {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(12, 13);
        map.put(45,67);
         int arr[]  = {12,45,55};
//         for(int i:arr)
//         {
//             System.out.println(i);
//         }
        Set<Integer> keys= map.keySet();
        for(int key:keys)
         {
           System.out.println(key+ " "  +map.get(key));
    }
        Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext())
        {
            Map.Entry<Integer,Integer> entry = itr.next();
            System.out.println("Key: " + entry.getKey() + " Value: "+ entry.getValue());
        }

    }
}

