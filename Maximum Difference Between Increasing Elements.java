class Solution {
    public int maximumDifference(int[] nums) {
        int diff = -1;
        int mn = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > mn) {
                diff = Math.max(diff, nums[i] - mn);
            }
            if (nums[i] < mn) {
                mn = nums[i];
            }
        }
        
        return diff;
    }
}
