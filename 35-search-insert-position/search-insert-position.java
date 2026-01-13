class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 3, 5, 6};
        System.out.println(solution.searchInsert(nums1, 5));

        int[] nums2 = {1, 3, 5, 6};
        System.out.println(solution.searchInsert(nums2, 2));

        int[] nums3 = {1, 3, 5, 6};
        System.out.println(solution.searchInsert(nums3, 7));
    }
}