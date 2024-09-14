package BinarySearch;
public class Floor {
    public static void main(String[] args) {
   
        int arr[] = {1,2,6,10,20,40,50};
        int x = 5;
        int ans = FLoorNumber(arr, x);

        System.out.println("   "  +ans);
    }

    static int FLoorNumber(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
       return high;
    }

}
