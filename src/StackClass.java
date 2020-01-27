import java.util.Stack;

public class StackClass {
    public static void main(String args[]){
        Stack stack = new Stack();

        // push
        for(int i=1;i<6;i++)
            stack.push(i);

        // pop
        System.out.println(stack.pop());

        // peek
        System.out.println(stack.peek());

        // search
        Integer pos = (Integer) stack.search(4);
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at "+ pos);

        // check whether empty or not
        System.out.println(stack.empty());
    }
}
