package BinarySearch;
public class ceiling {

    public static void main(String[] args) {

         int arr[] = {1,5,10,20,40};
         int x= 50;

         int ans = CeilingNumber(arr, x);
         System.out.println("Ceiling of the number"+ " " +ans);
    }

    static int CeilingNumber(int arr[], int x) {

        int low = 0;
        int high = arr.length - 1;


         if(x>arr[arr.length-1]){
            return -1;
         }

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
        return low;
    }
}
