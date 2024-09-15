package BinarySearch;

public class SplitSum {
 public static void main(String[] args) {
  
    int arr[] =  {1,2,3,4,5};
    int ans = SplitArray(arr, 2);
    System.out.println(" " +ans);
 }

 static int SplitArray(int arr[] , int target) {

    int s = 0;
    int e = 0;
    for(int i=0; i<arr.length-1; i++){
        s = Math.max(s, arr[i]);
        e += arr[i];
    }
    while (s<e) {
        int mid  = s+(e-s)/2;
        int sum =0;
        int piece = 1;

        for(int num: arr) {
            if(sum+num >target){ 
                sum = num;
                piece++;
            }
            else {
                sum += num;
            }
            if(piece>target) {
                s = mid+1;
            }
            else{
                e = mid;
            }

        }

    }
    return e;
 }
}
