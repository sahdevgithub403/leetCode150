//Jump Game 2

public class JumpGame_2 {

    public int jumpGame2(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int end = 0;
        int forthest = 0;

        for (int i = 0; i < n - 1; i++) {
            forthest = Math.max(forthest, nums[i] + i);

            if (forthest >= n - 1) {
                ans++;
                return ans;
            }

            if (i == end) {
                ans++;
                end = forthest;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        JumpGame_2 jp = new JumpGame_2();

        int[] nums = { 2, 3, 1, 1, 4 };
        int result = jp.jumpGame2(nums);

        System.out.println("Result : " + result);
    }
}
