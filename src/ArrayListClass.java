import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Student{
    int rollno;
    String name;
    int age;
    public Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

public class ArrayListClass {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println(list);
        System.out.println("Check whether empty " + list.isEmpty());
        list.set(1, "Ram");
        System.out.println("Checking after changes " + list);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String str:list){
            System.out.println(str);
        }

        ListIterator<String> list1 = list.listIterator(list.size());
        while(list1.hasPrevious()){
            String str = list1.previous();
            System.out.println(str);
        }

        System.out.println("Traversing list through for loop");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

//        storeStudent();
//        addArrayList();
        removeArrayList();
    }

    public static void removeArrayList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Raghav");
        list.add("Ravi");
        list.add("Vijay");
        list.add("Tarun");
        list.add("Ayush");
        System.out.println("Before changes" + list);

        list.remove("Vijay");
        System.out.println("After changes" + list);

        list.remove(1);
        System.out.println("After further changes" + list);

    }

    public static void addArrayList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Raghav");
        list.add("Tarun");
        System.out.println("Current List : " + list);

        list.add(1, "Ayush");
        System.out.println("Now after changes" + list);
    }

    public static void storeStudent(){
        Student s1 = new Student(101, "Raghav", 20);
        Student s2 = new Student(102, "Tarun", 14);
        Student s3 = new Student(103, "Ayush", 23);

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println("Rollno " + st.rollno + " name " + st.name + " age " + st.age);
        }
    }
}
