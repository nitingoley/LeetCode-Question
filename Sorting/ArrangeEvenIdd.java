package Sorting;
import java.util.Arrays;
public class ArrangeEvenIdd {
    public static void main(String[] args) {
        int arr[]= {3,9,2,1,5,4,7,8,6};

        int ans[] = SortByParity(arr);

        System.out.println(Arrays.toString(ans));
    }
    static int[] SortByParity(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int even = 0;
        int odd = n-1;

        for(int num : arr) {
            if(num%2==0) {
                ans[even++] = num;
            }
            else {
                ans[odd--]= num;
            }
        }
        return ans;
    }
}
