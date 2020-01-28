import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("Initial List of elements " + map);
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "rahul");
        System.out.println("Size of map " + map.size());
        System.out.println(map);
        if(map.containsKey(100)){
            String str = map.get(100);
            System.out.println("value for key " + str);
        }
        for(int i:map.keySet()){
            System.out.println(i + map.get(i));
        }
        map.remove(100);
        System.out.println(map);
        map.clear();
        System.out.println(map.isEmpty());
    }
}
