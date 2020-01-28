import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("India");
        set.add("America");
        set.add("Russia");
        set.add("Germany");
        System.out.println("HashSet " + set);
        System.out.println("Set contain India or not "+ set.contains("India"));
        set.remove("America");
        System.out.println("Set contain America or not "+ set.contains("America"));

        System.out.println("Iterating over list");
        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
