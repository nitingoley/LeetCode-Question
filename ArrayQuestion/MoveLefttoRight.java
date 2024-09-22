import java.util.Arrays;

public class MoveLefttoRight {

    public static void main(String[] args) {

        // System.out.println ;

        // int arr[] = { 1, 2, 3, 4, 5, 6 };  
          int[]arr = {9, 8, 7, 6, 4, 2, 1, 3};
           Shift(arr);

        // in that problem the time complexcity of that problem is 0(N) because there is
        // only one loop running Nth time and space complexcity 0(1) we are not use any
        // extra space

        System.out.println(Arrays.toString(arr));

    }
    // static int ShiftLeftToRight(int arr[]) {
    // int n = arr.length;
    // int temp = arr[0];
    // for (int i = 1; i < n; i++) {
    // arr[i - 1] = arr[i];
    // }
    // arr[n - 1] = temp;
    // return temp;
    // }

    // second type problem

    // Input: arr = [9, 8, 7, 6, 4, 2, 1, 3]
    // Output: [3, 9, 8, 7, 6, 4, 2, 1]
    // Explanation: After rotating clock-wise 3 comes in first position.

    static int Shift(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n-1; i >0;  i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return temp;
    }
}
