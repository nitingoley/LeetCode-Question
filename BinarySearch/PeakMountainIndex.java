package BinarySearch;

public class PeakMountainIndex {
public static void main(String[] args) {
    int arr[] = {0,1,10,5,2};

     int ans = PeakIndex(arr);
    System.out.println("The peak index is that : " + " " +ans);
  }

   static int PeakIndex(int arr[]){
    int start =0;
    int end = arr.length-1;
    while (start< end) {
        int mid =(start+end)/2;
        if(arr[mid]>arr[mid+1]){ 
            end = mid;
        }
        else{
            start = mid+1;
        }
    }
    return start;
   }
}  