class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i,j,c=0;
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
        }
        return c;
    }
}
