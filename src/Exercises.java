import java.util.*;

public class Exercises {
    public static void main(String[] args){
//        String input = "abacd";
//        System.out.println(findDuplicate(input));
//        String input2 = "abcd";
//        System.out.println(findDuplicate(input2));

//        int[] nums = {1, 2, 3, 4};
//        int target = 5;
//        System.out.println(twoSum(nums, target));
//        int[] nums2 = {1, 4, 5, 1, 6};
//        int target2 = 12;
//        System.out.println(twoSum(nums2, target2));

//        String str = "raghav";
//        System.out.println(reverseString(str));

//        int[] arr = {-1, 15, 59, 22, 6, 42, 45, 0};
//        int k = 4;
//        System.out.println(findTopK(arr, k));

        System.out.println(translateNumberToWord(1233476));
    }

    private static final String[] LESS_THAN_20 = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] THOUSANDS = {"", "thousand", "million", "billion"};

    public static String translateNumberToWord(int number) {
        if (number == 0)
            return "zero";
        int i = 0;
        String words = "";
        while (number > 0) {
            if (number % 1000 != 0) {
                words = helper(number % 1000) + THOUSANDS[i] + " " + words;
            }
            number /= 1000;
            i++;
        }
        return words.trim();
    }

    private static String helper(int num){
        if(num == 0)
            return "";
        else if(num < 20)
            return LESS_THAN_20[num] + " ";
        else if(num < 100)
            return TENS[num / 10] + " " + helper(num%10);
        else
            return LESS_THAN_20[num / 100] + " hundred " + helper(num % 100);
    }

    public static ArrayList<Integer> findTopK(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int a:arr){
            pq.add(a);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(k-- > 0){
            list.add(pq.peek());
            pq.poll();
        }
        return list;

        /*
        * TreeSet<Integer> treeSet = new TreeSet<Integer>();
        * for(int a:arr){
        *   treeSet.add(num);
        *   if(treeSet.size() > k){
        *       treeSet.pollFirst();
        *   }
        * }
        * return treeSet.stream().collect(Collections.toList());
        * */

    }

    public static String reverseString(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return rev;

//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        return sb.reverse().toString();
    }

    public static boolean twoSum(int[] nums, int target){
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(target - nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }

    public static int findDuplicate(String input){
        Set<Character> set = new HashSet<Character>();
        for(int i=0;i<input.length();i++){
            if(set.contains(input.charAt(i)))
                return i;
            else
                set.add(input.charAt(i));
        }
        return -1;
    }

}
