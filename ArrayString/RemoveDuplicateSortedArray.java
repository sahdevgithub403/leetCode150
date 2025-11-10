import java.util.LinkedHashSet;

public class RemoveDuplicateSortedArray {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        int k = 0;
        for (int n : set) {
            nums[k++] = n;
        }
        return k;

    }

    public static void main(String[] args) {
        RemoveDuplicateSortedArray rd = new RemoveDuplicateSortedArray();

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int newLength = rd.removeDuplicates(nums);

        System.out.println("New length - " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
