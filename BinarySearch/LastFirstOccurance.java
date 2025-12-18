/*Given an array of integers nums sorted in non-decreasing order, 
find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.*/

import java.util.Arrays;

public class LastFirstOccurance {
    public static int[] searchRange(int[] nums, int target) {
        int first = firstOccur(nums, target);
        int last = lastOccur(nums, target);
        return new int[] { first, last };
    }

    public static int firstOccur(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                ans = mid;
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccur(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                ans = mid;
                l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] res = searchRange(nums, target);
        System.out.println("Output : " + Arrays.toString(res));
    }
}
