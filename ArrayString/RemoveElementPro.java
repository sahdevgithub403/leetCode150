public class RemoveElementPro {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElementPro rm = new RemoveElementPro();

        int[] nums = { 3,2,2,3 };
        int val = 3;

        int newLength = rm.removeElement(nums, val);

        System.out.println("New Length " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
