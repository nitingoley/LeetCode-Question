package BinarySearch;


public class SearchInsert {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 7};
        int x = 6;
        int ans = Search_Insert_Element(arr, x);
        System.out.println("Element should be inserted at index: " + ans);

    }

    static int Search_Insert_Element(int ar[], int x) {
        int n = ar.length;
        int l = 0;
        int r = n - 1;
        int ans = n;

        // Apply binary search to find the insertion position
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (ar[mid] >= x) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    // Function to insert element at the specified index
    static int[] insertElement(int[] arr, int x, int pos) {
        int n = arr.length;
        int[] newArr = new int[n + 1];

        // Copy elements before the insertion point
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[pos] = x;

        // Copy the rest of the elements
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }
}
