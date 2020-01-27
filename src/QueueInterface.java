import java.util.LinkedList;
import java.util.Queue;
public class QueueInterface {

    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<Integer>();

        // add elements in queue
        for(int i=1;i<6;i++)
            q.add(i);

        // display
        System.out.println("Element of queue " + q);

        // remove
        int r = q.remove();
        System.out.println("Removed Element " + r);

        int head = q.peek();
        System.out.println("Head of queue " + head);

        int size = q.size();
        System.out.println("Size of queue " + size);
    }
}
