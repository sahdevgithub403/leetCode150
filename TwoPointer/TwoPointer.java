//Two pointers 

import java.util.Arrays;

public class TwoPointer {

    public static int[] twoPointer(int[] arr, int target) {
        int n = arr.length - 1;
        Arrays.sort(arr);
        int i = 0;
        int j = n;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                return new int[] { arr[i], arr[j] };
            }
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        int[] arr = { 11, 7, 15, 2, 17};
        int target = 9;
        System.out.println("Number : " + Arrays.toString(twoPointer(arr, target)));
    }
}
