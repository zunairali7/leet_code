class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // pointer for the position of next non-val element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // move non-val element to the front
                k++; // increment k
            }
        }

        return k; // number of elements not equal to val
    }
}

// Test example
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.print("Output: " + k1 + ", nums = [");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + (i < k1 - 1 ? "," : ""));
        }
        System.out.println("]");

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = solution.removeElement(nums2, val2);
        System.out.print("Output: " + k2 + ", nums = [");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + (i < k2 - 1 ? "," : ""));
        }
        System.out.println("]");
    }
}