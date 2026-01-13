class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                if (count > maxCount) maxCount = count;
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println(solution.findMaxConsecutiveOnes(nums1));

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println(solution.findMaxConsecutiveOnes(nums2));
    }
}