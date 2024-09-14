package BinarySearch;

public class Rotated_Search_sorted_binary_search {
    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        // System.out.println(ch(arr, 0));

        int ans = FindPivot(arr);
        System.out.println(" Answer will be " + ans);

    }

    static int Search(int nums[], int target) {
        int pivot = FindPivot(nums);
        if (pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }

        // case 2
        if (pivot == target) {

            // in that case pivot will be the answer /
            return pivot;
        }
        if (nums[pivot] >= nums[0]) {
            return BinarySearch(nums, target, 0, pivot - 1);
        }

        // if()

        return BinarySearch(nums, target, pivot + 1, nums.length - 1);

    }

    static int BinarySearch(int arr[], int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int FindPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid + 1]) {
                return mid - 1;
            }
            if (arr[mid] > arr[start]) {
                end = mid - 1;
            } else {
                start = end + 1;
            }
        }

        return -1;
    }
}
