import java.util.Date;

public class DateClass {
    public static void main(String[] args){
        Date date1 = new Date(123454);
        Date date2 = new Date(123457);
        System.out.println(date1.after(date2));
        System.out.println(date1.before(date2));
        System.out.println(date1.compareTo(date2));
        System.out.println(date1.equals(date2));
        System.out.println(date2.getTime());
        date1.setTime(1561554154352L);
        System.out.println(date1.getTime());
        System.out.println(date1.toString());
    }
}
