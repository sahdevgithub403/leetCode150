class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1, nums2, and the end of the merged array
        int i = m - 1; // last valid element in nums1
        int j = n - 1; // last element in nums2
        int k = m + n - 1; // last position in nums1 (total size - 1)

        // Compare and fill from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 still has elements left
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    // For testing the merge function
    public static void main(String[] args) {
        mergeSortedArray sol = new mergeSortedArray();

        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        sol.merge(nums1, m, nums2, n);

        // Print merged array
        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
