import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ravi");
        list.add("Raghav");
        list.add("Ram");
        list.add("Rahul");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

//        addLinkedList();
//        removeLinkedList();
    reverseLinkedList();
    }

    public static void reverseLinkedList(){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ram");
        ll.add("Raghav");
        ll.add("Rahul");
        Iterator itr = ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void removeLinkedList(){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Anuj");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Virat");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Amit");

        System.out.println("Initial List " + ll);
        ll.remove("Vijay");
        System.out.println("Invoking remove on Vijay" + ll);
        ll.remove(0);
        System.out.println("After removing 0th index element " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removing first and last element" + ll);
    }

    public static void addLinkedList(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ravi");
        list.add("Raghav");
        list.add("Ram");
        list.add("Rahul");
        System.out.println("Before calling add method " + list);

        list.add(1, "Gaurav");
        System.out.println("After calling add method " + list);

        list.add("Sonu");
        list.add("Monu");
        System.out.println("After some changes " + list);

        list.addFirst("Hello");
        list.addLast("Bye");
        System.out.println("Final Output " + list);
    }
}
