import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args){
        StringTokenizer st1 = new StringTokenizer("my name is raghav", " ");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
    }
}
