import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println("TreeSet : " + set);
        System.out.println("Does set contain 10 " + set.contains(10));
        set.remove(20);
        System.out.println("Does set contain 20 " + set.contains(20));
        Iterator itr = set.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
