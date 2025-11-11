import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int front = nums[i];
            int back = nums[j];
            
            if (front + back == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            } else if (front + back > target) {
                j--;
            } else {
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sl = new Solution();

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = sl.twoSum(nums, target);

        System.out.println("Result : " + Arrays.toString(result));
    }
}
