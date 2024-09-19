// import java.*;
import java.util.Arrays;
public class ParityBitSort {
public static void main(String[] args) {

  int arr[]= {3,9,2,1,5,4,7,8,6};
  int n = arr.length;
int ans[] = SortByParity(arr);

  
   System.out.println(Arrays.toString(ans));

}

  // today we will discuss about the bubble sort algorithm   

  // bubble sort is a sorting algorithm that sorts the array in ascending order  
  // the algorithm works by repeatedly swapping adjacent elements if they are in the wrong order

  static int[] SortByParity(int[] arr) {
    int  n= arr.length;
    int ans[] = new int[n];
    int evenIdex = 0;
    int oddIndex = n-1;

    for(int num : arr) {
      if(num%2==0){
        ans[evenIdex++] = num;
      }
      else {
        ans[oddIndex--] = num;
      }
    }
  return ans;
  }
}
