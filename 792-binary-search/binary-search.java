class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        System.out.println(solution.search(nums1, 9));  // Output: 4

        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        System.out.println(solution.search(nums2, 2));  // Output: -1
    }
}