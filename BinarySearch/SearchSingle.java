package BinarySearch;

public class SearchSingle {

    public static void main(String[] args) {

         int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
         int ans = SearchSingleElementInTwiceArray(arr);
         System.out.println("The ans :  ");
         System.out.println(ans);
    }

    static int SearchSingleElementInTwiceArray(int nums[]) {
        // int n = nums.length-1;

        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        int l = 0, r = n - 2;

        while (l <= r) {
            int mid = r + (l - r) / 2;

            if ((nums[mid] != nums[mid + 1]) && (nums[mid] != nums[mid - 1])) {
                return nums[mid];
            }

            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
