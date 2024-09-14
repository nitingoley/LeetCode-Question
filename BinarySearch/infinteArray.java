package BinarySearch;
public class infinteArray {

    public static void main(String[] args) {

        int arr[] = new int[] { 3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170 };
        int target = 80;

        // System.out.println(FindingArray(arr, target));
    
         int ans  = FindingArray(arr, target);

         System.out.println("   "  +ans);
     
    }

    static int FindingArray(int arr[], int target) {

        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;

            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int arr[], int target, int start, int end) {

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