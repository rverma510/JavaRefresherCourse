import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class Stu{
    int rollno;
    String name, address;
    public Stu(int rollno, String name, String address){
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString(){
        return this.rollno + " " + this.name + " " + this.address;
    }
}
class Sortbyroll implements Comparator<Stu> {
    public int compare(Stu a, Stu b){
        return a.rollno - b.rollno;
    }
}
public class TreeMapClass {
    public static void main(String[] args){
//        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//        map.put(30, "Raghav");
//        map.put(20, "Rahul");
//        map.put(10, "Ayush");
//
//        System.out.println("TreeMap : " + map);

//        TreeMap<Stu, Integer> map = new TreeMap<Stu, Integer>(new Sortbyroll());
//        map.put(new Stu(300, "Raghav", "Ghaziabad"), 1);
//        map.put(new Stu(200, "Ayush", "Rampur"), 2);
//        map.put(new Stu(100, "Rahul", "Ghaziabad"), 3);
//        System.out.println("TreeMap : " + map);

        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(10, "Raghav");
        map.put(20, "Rahul");
        map.put(30, "Ajay");
        System.out.println("TreeMap : " + map);

        System.out.println("Does map contain 10 " + map.containsKey(10));
        System.out.println("Does map contain Ajay " + map.containsValue("Ajay"));
        System.out.println("Traversing map");
        for(Map.Entry<Integer, String> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }
}
