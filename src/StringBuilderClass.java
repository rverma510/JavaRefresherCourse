public class StringBuilderClass {
    public static void main(String[] r){
        StringBuilder sb1 = new StringBuilder("Hello ");
        sb1.append("Raghav");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.insert(1, "RV");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.replace(1, 3, "Java");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.delete(1, 3);
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("raghav");
        sb5.reverse();
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder();
        System.out.println(sb6.capacity());
        sb6.append("Hello");
        System.out.println(sb6.capacity());
        sb6.append(" Java is my favourite language");
        System.out.println(sb6.capacity());

        System.out.println();
        vowels(new StringBuilder("udacity course"));

    }

    public static void vowels(StringBuilder sb){
        int i=0;
        while(i != sb.length()){
            System.out.println(i);
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' || sb.charAt(i) == 'e')
                i++;
            else
                sb.delete(i, i+1);
        }
        System.out.println(sb);
    }
}
