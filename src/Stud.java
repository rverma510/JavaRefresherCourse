public class Stud extends Person{
    private int rollno;
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public int getRollno(){
        return this.rollno;
    }

    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.setRollno(100);
        s1.setName("Raghav");
        s1.setAge(20);
        System.out.println(s1.rollno + " " + s1.name + " " + s1.age);
    }
}
