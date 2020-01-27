import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("Initial List of elements " + map);
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "rahul");

        System.out.println("After invoking put() method");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
