package Sorting;
import java.util.Arrays;

public class SortArrayByParity2 {
    
    public static void main(String[] args) {
        int arr[] = {4,2,5,7};

        int []ans= SortArrayByParity2(arr);

        System.out.println(Arrays.toString(ans));
        
    }
    static int[] SortArrayByParity2(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int even = 0;
        int odd = 1;

        for(int num : arr) {
            if(num%2==0) {
                ans[even] = num;
                even+=2;
            }
            else {
                ans[odd] = num;
                odd +=2;
            }
        }
        return ans;
    }
}




// apporch  
// Initialization: The sorted array is created to hold the reordered integers.
// Two Pointers: evenIndex starts at 0 and oddIndex starts at 1, ensuring that even numbers are placed at even indices and odd numbers at odd indices.
// Iteration: As you loop through the input array nums, check if each number is even or odd, and place it in the appropriate index in the sorted array.
// Output: The main method demonstrates how to use the sortArrayByParityII method and prints the resulting array.