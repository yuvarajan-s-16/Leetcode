class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                sum+=nums[i];
            }
            else
            {
                sum-=nums[i];
            }
        }
        return sum!=0;
    }
}
