public class StringClass {
    public static void main(String[] args){
        String str1 = "RV";
        String str2 = new String("Raghav Verma");
        System.out.println(str1);
        System.out.println(str2);

        byte[] b_arr = {71, 101, 101, 107, 115};
        String str3 = new String(b_arr);
        System.out.println(str3);

        char[] char_arr = {'C', 'o', 'd', 'e', 'r'};
        String str4 = new String(char_arr);
        System.out.println(str4);

        StringBuffer s_buffer = new StringBuffer("Coder");
        String str5 = new String(s_buffer);
        System.out.println(str5);

        StringBuilder s_builder = new StringBuilder("Master");
        String str6 = new String(s_builder);
        System.out.println(str6);

        System.out.println(str6.length());
        System.out.println(str3.charAt(1));
        System.out.println(str2.substring(3));
        System.out.println(str1.concat(str2));
        System.out.println(str1.indexOf("V"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.replace('a', 'e'));
    }
}
