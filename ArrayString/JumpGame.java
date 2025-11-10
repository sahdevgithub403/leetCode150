// Jump Game

public class JumpGame {

    public boolean jumpGame(int[] nums) {

        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        if (goal == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        JumpGame jp = new JumpGame();
        int[] nums = { 3, 2, 1, 0, 4 };

        boolean result = jp.jumpGame(nums);
        System.out.println("Result : " + result);

    }
}
