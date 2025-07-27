class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int left = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if ((nums[i] > nums[left] && nums[i] > nums[i + 1]) || 
                    (nums[i] < nums[left] && nums[i] < nums[i + 1])) {
                    count++;
                }
                left = i;
            }
        }
        return count;
    }
}
