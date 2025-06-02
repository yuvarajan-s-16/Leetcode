class Solution {
    public int minOperations(int[] nums, int k) {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
        }
        
        return s%k;
    }
}
