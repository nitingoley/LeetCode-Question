package BinarySearch;
public class binarySearch {

    public static void main(String[] args) {
         
        int arr[] = {1,2,4,5,8,9,19};
        int target =  9;

        int ans = BinarySearch(arr, target);

        System.out.println("  " +ans);
    }
    static int BinarySearch(int arr[], int target) {

         int start =0;
         int end  = arr.length-1;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = start + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
    
}