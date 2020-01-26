public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
        int target = 11;
        int mid = -1;
        int low = 0;
        int high = arr.length;
        while(low <= high){
            mid = (low + high)/2;
            if(arr[mid] == target)
                break;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        if(mid == -1)
            System.out.println("Sorry");
        else
            System.out.println("Found it at : " + mid);
    }
}
