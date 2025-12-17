public class SearchMatrix {

    public static boolean searchMatrix(int[][] nums, int target) {
        int m = nums.length;
        int n = nums[0].length;

        int l = 0;
        int r = m * n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int row = mid / 2;
            int col = mid % 2;

            int value = nums[row][col];

            if (value == target) {
                return true;
            } else if (value < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        boolean res = searchMatrix(nums, target);
        System.out.println(res);
    }
}
